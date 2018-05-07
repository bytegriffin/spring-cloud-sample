package com.bytegriffin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 消息提供者<br>
 * 启动顺序：zuul-eureka-server、zuul-eureka-provider、zuul-eureka<br>
 * 该子项目与zuul-eureka-provider、zuul-eureka-server子项目联合使用
 * @author bytegriffin
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZuulEurekaProviderApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ZuulEurekaProviderApplication.class, args);
	}
	
}
