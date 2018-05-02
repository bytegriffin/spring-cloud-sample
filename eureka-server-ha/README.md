# spring-cloud-sample

高可用服务注册中心<br/>
访问http://localhost:1111/和http://localhost:1112/查看状态页面<br/>
该子项目与eureka-provider、eureka-consumer子项目联合使用<br/>
注意：由于采用共同的代码，不同的配置文件，需要在每台Eureka Server里配置host文件<br/>
启动顺序：enreka-server-ha->eureka-provider->eureka-consumer<br/>
启动enreka-server-ha的命令：
```xml
mvn clean package
cd target
java -jar eureka-server-ha-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1  
java -jar eureka-server-ha-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2  
```