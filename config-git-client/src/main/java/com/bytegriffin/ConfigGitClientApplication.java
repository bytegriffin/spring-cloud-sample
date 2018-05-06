package com.bytegriffin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * git配置客户端 <br>
 * 相当于一个转发服务器，完全可以用浏览器直接访问 <br>
 * 可访问http://localhost:8002/hello
 * @author bytegriffin
 *
 */
@SpringBootApplication
public class ConfigGitClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigGitClientApplication.class, args);
	}

}
