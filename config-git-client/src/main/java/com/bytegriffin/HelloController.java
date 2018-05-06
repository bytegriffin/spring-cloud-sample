package com.bytegriffin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * web服务化<br>
 * 可访问http://localhost:8002/hello
 * @author bytegriffin
 *
 */
@RestController
public class HelloController {

	/**
	 * test.hello就是config-git-server/config-repo/test-config-dev.properties
	 * 中的test.hello对应的值
	 */
	@Value("${test.hello}")
	private String hello;

	@RequestMapping("/hello")
	public String from() {
		return this.hello;
	}

}
