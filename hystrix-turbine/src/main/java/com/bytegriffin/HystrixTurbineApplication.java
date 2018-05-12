package com.bytegriffin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 服务集群监控<br/>
 * 访问http://localhost:9999/turbine.stream?cluster=MAIN 获取实时数据<br/>
 * 访问http://localhost:8888/hystrix 将地址http://localhost:9999/turbine.stream?cluster=MAIN 输入到输入栏点击Monitor Stream<br/>
 * 访问http://localhost:9001/hello/abc 或者 http://localhost:9002/hello/abc 刷新数据，之后就可以在hystrix中看到了<br/>
 * 该子项目与hystrix-consumer-node1、hystrix-consumer-node2、hystrix-privider、hystrix-eureka-server、hystrix-dashboard子项目联合使用<br/>
 * 启动顺序：hystrix-eureka->hystrix-privider->hystrix-consumer-node1->hystrix-consumer-node2->hystrix-dashboard->hystrix-turbine<br/>
 * 
 * @author bytegriffin
 *
 */
@EnableTurbine
@SpringBootApplication
public class HystrixTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixTurbineApplication.class, args);
	}

}