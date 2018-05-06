package com.bytegriffin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 服务集群监控<br/>
 * 访问http://localhost:8001/turbine.stream 获取实时数据<br/>
 * 访问http://localhost:8001/hystrix 将地址http://localhost:8001/turbine.stream 输入到输入栏点击Monitor Stream<br/>
 * 访问http://localhost:9001/hello/abc 或者 http://localhost:9001/hello/abc 刷新数据，之后就可以在hystrix中看到了<br/>
 * 该子项目与hystrix-consumer-node1、hystrix-consumer-node2、hystrix-dashboard-turbine子项目联合使用<br/>
 * 启动顺序：hystrix-eureka->hystrix-consumer-node1->hystrix-consumer-node2->hystrix-dashboard-turbine<br/>
 * 
 * @author bytegriffin
 *
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine

@EnableDiscoveryClient
@EnableCircuitBreaker
public class HystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardApplication.class, args);
	}

}