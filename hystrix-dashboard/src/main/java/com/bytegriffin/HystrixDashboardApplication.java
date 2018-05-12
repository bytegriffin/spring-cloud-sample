package com.bytegriffin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 服务熔断监控<br/>
 * 访问http://localhost:8888/hystrix <br/>
 * 该子项目与hystrix-eureka-server、hystrix-provider、hystrix-consumer-node1、hystrix-consumer-node2、hystrix-turbine子项目联合使用<br/>
 * 启动顺序：hystrix-eureka-server->hystrix-provider->hystrix-consumer-node1->hystrix-consumer-node2->hystrix-dashboard->hystrix-turbine<br/>
 * 
 * @author bytegriffin
 *
 */
@EnableHystrixDashboard
@SpringBootApplication
public class HystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardApplication.class, args);
	}

}