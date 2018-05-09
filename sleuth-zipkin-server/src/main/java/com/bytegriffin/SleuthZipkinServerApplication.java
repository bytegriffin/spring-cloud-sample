package com.bytegriffin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * 服务链路跟踪器<br>
 * 访问地址 http://localhost:9000/zipkin/ <br>
 * 该子项目与sleuth-zipkin-eureka-server、sleuth-zipkin-eureka-provider、sleuth-zipkin-zuul-eureka子项目联合使用<br>
 * 启动顺序：sleuth-zipkin-eureka-server、sleuth-zipkin-server、sleuth-zipkin-eureka-provider、sleuth-zipkin-zuul-eureka<br>
 * @author bytegriffin
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class SleuthZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SleuthZipkinServerApplication.class, args);
	}

}
