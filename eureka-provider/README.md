# spring-cloud-sample

服务提供者:将自身服务注册到Eureka，从而使服务消费方能够找到<br/>
该子项目与eureka-consumer、eureka-server-ha子项目联合使用<br/>
启动顺序：enreka-server-ha->eureka-provider->eureka-consumer<br/>
当启动完eureka-provider后，可用http://localhost:9000/hello-provider?name=abc来检测