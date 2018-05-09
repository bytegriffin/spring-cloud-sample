package com.bytegriffin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 服务网关<br>
 * 调用入口，访问http://localhost:8888/sleuth-zipkin-eureka-provider/hello?name=neo <br>
 * 其中sleuth-zipkin-eureka-provider是application.name，然后在http://localhost:9000/zipkin/ 就可以看到调用trace结果<br>
 * 该子项目与sleuth-zipkin-eureka-server、sleuth-zipkin-eureka-provider、sleuth-zipkin-server子项目联合使用<br>
 * 启动顺序：sleuth-zipkin-eureka-server、sleuth-zipkin-server、sleuth-zipkin-eureka-provider、sleuth-zipkin-zuul-eureka<br>
 * @author bytegriffin
 *
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulEurekaApplication.class, args);
	}

}
