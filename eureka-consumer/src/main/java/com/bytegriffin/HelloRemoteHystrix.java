package com.bytegriffin;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 熔断器
 * 必须在eureka-consumer端定义
 * 启动顺序：enreka-server-ha->eureka-provider->eureka-consumer
 * 当启动完eureka-consumer后，可用http://localhost:9001/hello/abc来检测
 * 之后关闭eureka-provider服务，再次调用http://localhost:9001/hello/abc来检测
 * @author bytegriffin
 *
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

	@Override
	public String hello(@RequestParam(value = "name") String name) {
		return "对不起，" + name + "，这是eureka-provider远程服务熔断器，时间："+LocalDateTime.now();
	}

}