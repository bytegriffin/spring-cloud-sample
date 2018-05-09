package com.bytegriffin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册中心<br>
 * 访问http://localhost:8761/ 查看状态页面<br>
 * 该子项目与feign-eureka-consumer、feign-eureka-provider子项目联合使用<br>
 * 启动顺序：feign-enreka-server->feign-eureka-provider->feign-eureka-consumer<br>
 * @author bytegriffin
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
