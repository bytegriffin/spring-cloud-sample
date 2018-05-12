# spring-cloud-sample

服务熔断监控<br/>
访问http://localhost:8888/hystrix <br/>
该子项目与hystrix-eureka-server、hystrix-provider、hystrix-consumer-node1、hystrix-consumer-node2、hystrix-turbine子项目联合使用<br/>
启动顺序：hystrix-eureka-server->hystrix-provider->hystrix-consumer-node1->hystrix-consumer-node2->hystrix-dashboard->hystrix-turbine<br/>
