# spring-cloud-sample

服务调用者:从Eureka-Server获取注册服务列表，从而能够消费服务。<br/>
该子项目与eureka-provider、eureka-server-ha子项目联合使用<br/>
启动顺序：enreka-server-ha->eureka-provider->eureka-consumer<br/>
当启动完eureka-consumer后，可用http://localhost:9001/hello/abc来检测