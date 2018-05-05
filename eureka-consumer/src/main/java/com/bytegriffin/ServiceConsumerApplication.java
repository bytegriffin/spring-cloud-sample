package com.bytegriffin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务调用者:从Eureka-Server获取注册服务列表，从而能够消费服务。
 * 该子项目与eureka-provider、eureka-server-ha子项目联合使用
 * 启动顺序：enreka-server-ha->eureka-provider->eureka-consumer
 * 当启动完eureka-consumer后，可用http://localhost:9001/hello/abc来检测
 * @author bytegriffin
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class ServiceConsumerApplication {

    public static void main(String[] args){
        SpringApplication.run(ServiceConsumerApplication.class, args);
    }

}