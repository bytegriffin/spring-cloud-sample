package com.bytegriffin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务提供者<br>
 * 访问http://localhost:7777/hello?name=abc 来查看是否启动成功
 * 该子项目与sleuth-zipkin-eureka-server、sleuth-zipkin-server、sleuth-zipkin-zuul-eureka子项目联合使用
 * 启动顺序：sleuth-zipkin-eureka-server、sleuth-zipkin-server、sleuth-zipkin-eureka-provider、sleuth-zipkin-zuul-eureka<br>
 * @author bytegriffin
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderApplication.class, args);
	}

}
