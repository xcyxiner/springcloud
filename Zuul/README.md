

# 参考资料
* [springcloud(十)：服务网关zuul初级篇](http://www.ityouknow.com/springcloud/2017/06/01/gateway-service-zuul.html)


# IDEA 打包编译

```
mvn clean package
```


# 启动

```
cd target
java -jar gateway-service-zuul-0.0.1-SNAPSHOT.jar
```


# 测试

```
curl http://localhost:8888/spring-cloud-producer/hello?name=123123

输出 hello123123,this is first message
```