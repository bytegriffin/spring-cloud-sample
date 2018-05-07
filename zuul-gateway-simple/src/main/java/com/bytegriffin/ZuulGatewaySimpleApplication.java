package com.bytegriffin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 服务网关<br>
 * 访问http://localhost:8888/ 会自动跳转到<br>
 * https://www.github.com/bytegriffin
 * @author bytegriffin
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulGatewaySimpleApplication {

    public static void main( String[] args ) {
    	SpringApplication.run(ZuulGatewaySimpleApplication.class, args);
    }
}
