package com.bytegriffin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 远程访问接口
 * 使用@EnableFeignClients声明时要写相应的远程接口
 * 声明@FeignClient中的值是hystrix-provider-node项目
 * 配置文件中的spring.application.name的值保持一致
 * @author bytegriffin
 *
 */
@FeignClient(name = "hystrix-provider", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

	/**
	 * value值要与hystrix-provider-node项目HelloProvideController的hello-provider请求接口保持一致
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/hello-provider")
	public String hello(@RequestParam(value = "name") String name);

}
