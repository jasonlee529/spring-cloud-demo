### Spring cloud Dubbo

1. 协议：dubbo
2. 序列化方案：kryo
3. 注册中心：Nacos

#### 1. 注册失败。IllegalStateException: Failed to check the status of the service com.alibaba.cloud.dubbo.service.DubboMetadataService. No provider available for the servic
启动时服务失败，原因是因为启动服务时没有启动起来。

解决办法：重启provider服务。
#### 2.hessian 序列化失败.org.apache.dubbo.remoting.RemotingException: Fail to decode request due to: RpcInvocation []
RPC接口在传递时需要进行序列化和反序列化，而dubbo的默认序列化协议用的是Hessian。Hessian需要被序列化的类有空参数的构造方法。Pageable接口的实现类PageRequest并没有默认无参构造方法，导致失败。

解决办法： 将序列化协议改为Kryo。
``` xml
<dependency>
    <groupId>com.esotericsoftware</groupId>
    <artifactId>kryo</artifactId>
    <version>4.0.2</version>
</dependency>
<dependency>
    <groupId>de.javakaffee</groupId>
    <artifactId>kryo-serializers</artifactId>
    <version>0.45</version>
</dependency>
```

