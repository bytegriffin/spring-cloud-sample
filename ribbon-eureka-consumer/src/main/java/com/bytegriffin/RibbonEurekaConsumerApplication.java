package com.bytegriffin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 服务调用端的负载均衡器<br>
 * 访问http://localhost:8888/hello-consumer?name=abc<br>
 * 每次轮训都会返回不同的ribbon-eureka-provider的结果<br>
 * 该子项目与ribbon-eureka-provider1、ribbon-eureka-provider2、ribbon-eureka-server子项目联合使用
 * @author bytegriffin
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonEurekaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonEurekaConsumerApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
