# spring-cloud-sample

服务网关<br>
包括自定义Filter、路由熔断、熔断重试等。<br>
http://localhost:8888/zuul-eureka-provider/hello?name=abc&token=123<br>
其中zuul-eureka-provider是application.properties中的spring.application.name值<br>
zuul会根据serviceId自动路由到相应的服务上。<br>
跟直接访问http://localhost:9001/hello?name=abc 效果一样<br>
启动顺序：zuul-eureka-server、zuul-eureka-provider、zuul-eureka<br>
该子项目与zuul-eureka-provider、zuul-eureka-server子项目联合使用