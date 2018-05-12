# spring-cloud-sample

服务提供者<br>
可以访问http://localhost:8888/hello-provider?name=abc 来测试是否启动成功
该子项目与hystrix-consumer-node1、hystrix-consumer-node2、hystrix-eureka-server、hystrix-dashboard、hystrix-turbine子项目联合使用<br/>
启动顺序：hystrix-eureka-server->hystrix-provider->hystrix-consumer-node1->hystrix-consumer-node2->hystrix-dashboard->hystrix-turbine<br/>