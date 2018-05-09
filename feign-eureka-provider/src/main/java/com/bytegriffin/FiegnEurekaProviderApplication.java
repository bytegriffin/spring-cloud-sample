package com.bytegriffin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务提供者<br>
 * 该子项目与feign-enreka-server、feign-eureka-consumer子项目联合使用<br>
 * 启动顺序：feign-enreka-server->feign-eureka-provider->feign-eureka-consumer<br>
 * 当启动完eureka-provider后，可用http://localhost:8888/hello-provider?name=abc 来检测
 * @author bytegriffin
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class FiegnEurekaProviderApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(FiegnEurekaProviderApplication.class, args);
	}
	
}