package com.bytegriffin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务调用者1<br/>
 * 访问http://localhost:9001/hello/abc 刷新数据，因为不存在服务提供者，所以会被断路器熔断并返回错误信息<br/>
 * 该子项目与hystrix-consumer-node2、hystrix-provider、hystrix-eureka-server、hystrix-dashboard、hystrix-turbine子项目联合使用<br/>
 * 启动顺序：hystrix-eureka-server->hystrix-provider->hystrix-consumer-node1->hystrix-consumer-node2->hystrix-dashboard->hystrix-turbine<br/>
 * @author bytegriffin
 *
 */
@EnableHystrix
@EnableFeignClients
@SpringBootApplication
public class HystrixConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixConsumerApplication.class, args);
	}
}