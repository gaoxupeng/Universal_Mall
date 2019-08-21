# Universal_Mall

### 1.简要介绍

这个商城项目只是为了自我学习，因此注重自己学的新技术的落地实现，注重业务逻辑，倾向于后端，前端leyou，是我借用黑马的一个vue项目。

### 2.子项目介绍

mall_eureka        服务注册中心

mall_zuul             服务网关中心

mall_upload        服务上传配置

mall_item             商城品牌管理

### 3.技术展望，期待落地实现

分布式服务框架。如Dubbo、SpringCloud

分库分表  MyCat

分布式事务。2PC、3PC、TCC

分布式锁。Redis实现、zk实现

消息中间件。Kafka、RabbitMQ、RocketMQ

分布式缓存。Redis、Memcached

分布式搜索系统。Elasticsearch，solr
分布式理论。CAP、BASE

高性能、高可用、高并发。分库分表、读写分离、缓存、限流、降级、异步消息

以上这些知识点，有几个方面需要注意：

1、要知道同类竞品之间的差异、优缺点
2、要知道为什么使用这类产品，如RPC框架、消息中间件等
3、使用这些产品带来的一些问题是什么，如分库分表带来的分布式事务问题

4、常用中间件的基本原理，如Redis的线程模型、zk的存储模型
