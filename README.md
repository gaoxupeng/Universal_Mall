####  项目初衷

- [ ] 方便自己在工作之余，可以学习些感兴趣的技术。之所以放到`GitHub`，一是看到提交的绿色框框，心情会变好，同时也增强些成就感；二是希望对自己日后求职会有帮助。

#### 当前计划

- 因当前项目不涉及到微服务这块，所以才会将此项目设计为微服务，很多地方会存在瑕疵。其次，项目重在学会相关组件使用，业务不属于重点，很多地方因此并不完善，比如CRUD，我可能只做个查询或者只做个添加就结束了某块的编码。
- 目前学习重心会放在`mall_integration`，准备从头到尾重新撸一遍`SpringBoot`。
  - 其实一部分原因自己电脑有点落后了，性能更不上，服务启动了，比较卡，Linux，Nginx，Mysql，后期再加上这个那个的，电脑支撑不了，先打住。希望2020年可以找个满意的工作，让我有小钱钱去换个性能高的电脑。
  
  - 购买服务器也提上了日程，不过暂时还是先撸`SpringBoot`吧，除此之外，多线程，JVM等等也要抓紧学习，框架的优先级先排排后吧。
  
  - 项目文件层次
  
    ```javascript
    -main
    	|-java
    		|-com.mall
    			|-config   //配置文件
    			|-controller
    			|-dao
    			|-model
    			|-server
    			|-utils
    				|-config
    					|-exception   //自定义异常，全局异常
    					|-redis     //整合redis
    	|-resources
    		|-logback
    		|-mapper   //mybatis的dao对应的语句
    		|-static
    			|-error //错误页面
    ```
  
    

**mall_integration** 的技术栈`相关博客链接教程放在末尾`

```
开发框架:SpringBOOt MyBatis MyBatis_Plus
数据库相关：MySql Druid Redis
日志系统：logback
```



#### 各个模块简要介绍

- `mall_api`： 主要作用是用来生成一些公共的类，比如用户，部门等。采用`mybatis.generator`，后期可能考虑剔除这个模块，或者与`mall_common`整合。
- `mall_common`：目前是用来充当一个公共的模块，目前主要内容是一些公共的工具类，例如分页。
- `mall_eureka`：服务注册中心，后期会考虑替换成阿里的`nacos`。
- `mall_hystrix_dashboard`：断路器组件，进行服务熔断。
- `mall_integration`：此模块跟此项目没有什么必然关系，这个模块主要是自己用来学习`SpringBoot`的一个项目，这个模块会集成很多第三方的工具，比如`Druid`，`Redis`，`MQ`等，可以说是一个`SpringBoot`连接当前社会环境主流的第三方工具的一个模板事例。
- `mall_item`：一个商品相关的模块，涉及到商品的品牌，类别，规格参数。目前完成部分编码。
- `mall_login`：登录模块，目前完成部分编码。
- `mall_upload`：一个上传的模块，目前支持`FastDfs`。
- `mall_zuul`:服务网关，使用了Nginx。

 **前端采用VUE，是网上找的一个VUE项目，后期可能考虑自己写一个。**[VUE项目](https://github.com/gaoxupeng/leyou)

#### 博客链接

##### SpringBoot相关

[SpingBoot系列教程（一）：整合Mybatis-plus+Druid](https://blog.csdn.net/qq_41142325/article/details/104402129)

[SpingBoot系列教程（二）：SpringBoot+Logback](https://blog.csdn.net/qq_41142325/article/details/104436697)

[SpingBoot系列教程（三）：SpringBoot配置全局异常/自定义异常](https://blog.csdn.net/qq_41142325/article/details/104526545)

[SpingBoot系列教程（四）：SpringBoot+Redis](https://blog.csdn.net/qq_41142325/article/details/104784145)

