package com.bytegriffin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务提供者1<br>
 * 用http://localhost:9001/hello-provider?name=123 来检测
 * 该子项目与ribbon-eureka-provider2、ribbon-eureka-provider2、ribbon-eureka-server子项目联合使用
 * @author bytegriffin
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class RibbonEurekaProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonEurekaProviderApplication.class, args);
	}
	
}