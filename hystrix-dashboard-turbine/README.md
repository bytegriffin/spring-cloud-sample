# spring-cloud-sample

服务集群监控<br/>
访问http://localhost:8001/turbine.stream 获取实时数据<br/>
访问http://localhost:8001/hystrix 将地址http://localhost:8001/turbine.stream 输入到输入栏点击Monitor Stream<br/>
访问http://localhost:9001/hello/abc 或者 http://localhost:9001/hello/abc 刷新数据，之后就可以在hystrix中看到了<br/>
该子项目与hystrix-consumer-node1、hystrix-consumer-node2、hystrix-dashboard-turbine子项目联合使用<br/>
启动顺序：hystrix-eureka->hystrix-consumer-node1->hystrix-consumer-node2->hystrix-dashboard-turbine<br/>

注意：本示例目前版本存在BUG，启动turbine会报404的错误。