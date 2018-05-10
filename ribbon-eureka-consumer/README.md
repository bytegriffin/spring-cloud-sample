# spring-cloud-sample

服务调用端的负载均衡器<br>
访问http://localhost:8888/hello-consumer?name=abc<br>
每次轮训都会返回不同的ribbon-eureka-provider的结果<br>
该子项目与ribbon-eureka-provider1、ribbon-eureka-provider2、ribbon-eureka-server子项目联合使用
