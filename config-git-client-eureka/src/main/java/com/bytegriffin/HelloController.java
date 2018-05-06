package com.bytegriffin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * web服务化<br>
 * 可访问http://localhost:8002/hello <br>
 * 当服务端配置文件被修改时候，用下列POST命令来获取更新：<br>
 * curl -X POST http://localhost:8002/refresh <br>
 * 如果不想每次手工refresh，那么可以在github上配置WebHooks，自动推送更新
 * @author bytegriffin
 *
 */
@RestController
@RefreshScope
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
