package com.bytegriffin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册中心<br>
 * 访问http://localhost:8761/查看状态页面
 * 启动顺序：zuul-eureka-server、zuul-eureka-provider、zuul-eureka<br>
 * 该子项目与zuul-eureka-provider、zuul-eureka-server子项目联合使用
 * @author bytegriffin
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class ZuulEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulEurekaServerApplication.class, args);
	}

}
