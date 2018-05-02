package com.bytegriffin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 访问http://192.168.1.101:8762/hello?name=abc
 * 可以根据返回信息查看本客户端服务是否可用
 * 该子项目与eureka-server子项目联合使用
 * @author bytegriffin
 *
 */
@RestController
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}

	@Value("${server.port}")
	private String port;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return "hello "+name+",i am from port:" +port;
    }

}
