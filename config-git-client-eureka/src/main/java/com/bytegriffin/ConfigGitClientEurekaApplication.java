package com.bytegriffin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * git配置客户端 <br>
 * 相当于一个转发服务器，完全可以用浏览器直接访问 <br>
 * 可访问http://localhost:8003/hello 获取配置结果
 * 该子项目与config-git-server-eureka、config-git-eureka-server子项目联合使用
 * @author bytegriffin
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigGitClientEurekaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigGitClientEurekaApplication.class, args);
	}

}
