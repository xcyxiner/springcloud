# host 配置

* MAC OS  
* ```/etc/hosts``` 添加如下

```
127.0.0.1 peer1
127.0.0.1 peer2
```

# IDEA 打包编译

```
mvn clean package
```

# 启动peer1

```
cd target
java -jar eurekaserver-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
```

# 启动peer2

```
cd target
java -jar eurekaserver-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2
```


# 参考资料

* [springcloud(二)：注册中心Eureka](http://www.ityouknow.com/springcloud/2017/05/10/springcloud-eureka.html)
* [Eureka高可用注册中心，available-replicas不出现分布式注册中心](https://blog.csdn.net/u012503481/article/details/78919799)