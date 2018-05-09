package com.bytegriffin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务调用者<br>
 * 该子项目与feign-enreka-server、feign-eureka-provider-子项目联合使用
 * 启动顺序：feign-enreka-server->feign-eureka-provider->feign-eureka-consumer
 * 访问http://localhost:7777/hello/abc 之后内部会自动调用服务http://localhost:8888/hello-provider?name=abc
 * 并返回其结果，也就是暴露在外面的是host不变，port跟uri地址都会发生跳转，zuul可以保证暴露在外面的host也发生变化
 * @author bytegriffin
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class FeignEurekaConsumerApplication {

    public static void main(String[] args){
        SpringApplication.run(FeignEurekaConsumerApplication.class, args);
    }

}