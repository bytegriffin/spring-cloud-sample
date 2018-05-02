package com.bytegriffin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 高可用注册中心
 * 访问http://localhost:1111/和http://localhost:1112/查看状态页面
 * 该子项目与eureka-provider、eureka-consumer子项目联合使用
 * 注意：由于采用共同的代码，不同的配置文件，
 * 需要在每台Eureka Server里配置host文件
 * 启动顺序：enreka-server-ha->eureka-provider->eureka-consumer
 * 启动enreka-server-ha的命令：
 * mvn clean package
 * cd target
 * java -jar eureka-server-ha-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1  
 * java -jar eureka-server-ha-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2  
 * @author bytegriffin
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
