package com.bytegriffin;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 熔断器
 * 必须在eureka-consumer端定义
 * 没有或者关闭hystrix-provider服务，调用http://localhost:9001/hello/abc 就可启动熔断器
 * @author bytegriffin
 *
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

	@Override
	public String hello(@RequestParam(value = "name") String name) {
		return "对不起，" + name + "，这是node1服务熔断器，时间："+LocalDateTime.now();
	}

}