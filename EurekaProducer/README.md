# 参考资料
* [springcloud(三)：服务提供与调用](http://www.ityouknow.com/springcloud/2017/05/12/eureka-provider-constomer.html)
* [https://mvnrepository.com/](https://mvnrepository.com/)
* [Spring Cloud中，Eureka常见问题总结](https://blog.csdn.net/lc0817/article/details/54375802)


# IDEA 打包编译

```
mvn clean package
```

# 启动p1

```
cd target
java -jar spring-cloud-producer-0.0.1-SNAPSHOT.jar --spring.profiles.active=p1
```

# 启动p2

```
cd target
java -jar spring-cloud-producer-0.0.1-SNAPSHOT.jar --spring.profiles.active=p2
```
