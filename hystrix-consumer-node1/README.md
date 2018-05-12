# spring-cloud-sample

服务调用者<br/>
访问http://localhost:9001/hello/abc 刷新数据，因为不存在服务提供者，所以会被断路器熔断并返回错误信息<br/>
该子项目与hystrix-consumer-node2、hystrix-eureka-server、hystrix-dashboard、hystrix-turbine子项目联合使用<br/>
启动顺序：hystrix-eureka-server->hystrix-consumer-node1->hystrix-consumer-node2->hystrix-dashboard->hystrix-turbine<br/>
