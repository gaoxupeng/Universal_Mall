1.Eureka是Spring Cloud Netfix微服务套件中的一部分，主要负责完成微服务架构中的服务治理功能。

## 服务治理

服务治理作为微服务中最为核心和基础的模块，主要用来实现各个微服务实例的自动化注册于发现。包含了服务端及客户端。
&nbsp;&nbsp;&nbsp;&nbsp;服务端（服务注册中心），支持高可用配置，依托强一致性提供良好的服务实例可用性，来应对多种不同的故障场景。在集群模式中，如果存在分片故障，允许在故障期间继续提供服务的注册于发现，当故障分片恢复允许时，集群的其他分片会把它们的状态再次同步回来。**不同可用的服务注册中心通过异步模式相互复制各自的状态。**
&nbsp;&nbsp;&nbsp;&nbsp;客户端。处理服务的注册于发现。向注册中心注册自身的服务，并且周期性的发送心跳来更新服务租约，同时，查询当前注册的服务信息，并缓存到本地并周期性地刷新服务状态。

```
eureka.client.register-with-eureka: 注册中心，false 代表不向注册中心注册自己。
eureka.client.fetch-registry: 服务中心的职责是维护服务实例，不需要检索服务，所以设置为false。
```
**高可用的设计，所有的节点既是服务提供方，消费方。因此，将自己作为服务向其他服务注册中心注册自己，这样就可以形成一组互相注册的服务注册中心，实现服务清单的互相同步。**
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190601220813221.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQxMTQyMzI1,size_16,color_FFFFFF,t_70)

## 服务的消费
Ribbon是一个基于HTTP和TCP的客户端负载均衡器。通过客户端中配置的ribbonServerList服务端列表去轮询访问，以达到均衡负载的作用。

 - [ ] 不熟悉，先不写，然后补充。
 - [ ] Feign

## 服务治理机制

 **服务续约**
 注册完服务之后，服务提供者会维护一个心跳用来持续告诉Eureka Server：“我还活着”,防止“剔除服务”。


```
eureka.instance.lease-renewal-interval-in-seconds=30 服务续约任务的调用间隔，默认30S
eureka.instance.lease-expiration-duration-in-seconds=90 服务失效的时间，默认90S
```
**获取服务**
当启动服务的消费者时，会发送一个Rest请求给服务注册中心，来获取服务清单，为了性能考虑，中心会返回一个可读的服务清单，缓存清单30s更新。

```
eureka.client.fetch-registry: 获取清单是服务消费者基础，必须确保为true。
eureka.client.fetch-registry-fetch-interval-seconds=30 缓存更新时间。
```
**服务调用**
1.消费者可根据服务清单上的实例名和元数据信息来进行调用。
Ribbon采用轮询方式，从而实践负载均衡。
2.Region和Zone。
&nbsp;&nbsp;&nbsp;&nbsp;一个Region可以包含多个Zone，服务调用优先调用同处一个Zone中的服务提供方，访问不到再去访问其他Zone。

**服务下线**
正常关闭会发送一个Rest请求，中心接受，并且下线事件传播出去。

**自我保护**
中心运行期间会统计心跳失败的比例在15分钟之内是否低于85%，低于会将当前实例信息保护起来（原因之一可能因为网络不稳定），不会过期。但这段时间实例出现问题，客户端很容易拿到实际已经不存在的服务实例，出现调用失败，因此需要有容错机制。如请求重试，断路器等机制。