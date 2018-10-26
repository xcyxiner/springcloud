# 参考资料
* [springcloud(三)：服务提供与调用](http://www.ityouknow.com/springcloud/2017/05/12/eureka-provider-constomer.html)
* [https://mvnrepository.com/](https://mvnrepository.com/)
* [Spring Boot 2下使用Feign找不到@EnableFeignClients的解决办法](https://blog.csdn.net/alinyua/article/details/80070890)


# IDEA 打包编译

```
mvn clean package
```

# 启动c1

```
cd target
java -jar spring-cloud-consumer-0.0.1-SNAPSHOT.jar --spring.profiles.active=c1
```

# 启动c2

```
cd target
java -jar spring-cloud-consumer-0.0.1-SNAPSHOT.jar --spring.profiles.active=c2
```
