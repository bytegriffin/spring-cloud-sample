# spring-cloud-sample

服务网关<br>
调用入口，访问http://localhost:8888/sleuth-zipkin-eureka-provider/hello?name=neo <br>
其中sleuth-zipkin-eureka-provider是application.name，然后在http://localhost:9000/zipkin/ 就可以看到调用trace结果<br>
该子项目与sleuth-zipkin-eureka-server、sleuth-zipkin-eureka-provider、sleuth-zipkin-server子项目联合使用<br>
启动顺序：sleuth-zipkin-eureka-server、sleuth-zipkin-server、sleuth-zipkin-eureka-provider、sleuth-zipkin-zuul-eureka<br>
