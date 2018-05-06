package com.bytegriffin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * git配置客户端 <br>
 * 可访问http://localhost:8002/hello
 * 该子项目与config-git-server子项目联合使用
 * @author bytegriffin
 *
 */
@SpringBootApplication
public class ConfigGitClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigGitClientApplication.class, args);
	}

}
