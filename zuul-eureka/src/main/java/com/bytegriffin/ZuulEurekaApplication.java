package com.bytegriffin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * 服务网关<br>
 * http://localhost:8888/zuul-eureka-provider/hello?name=abc&token=123<br>
 * 其中zuul-eureka-provider是application.properties中的spring.application.name值<br>
 * zuul会根据serviceId自动路由到相应的服务上。<br>
 * 跟直接访问http://localhost:9001/hello?name=abc 效果一样<br>
 * 启动顺序：zuul-eureka-server、zuul-eureka-provider、zuul-eureka<br>
 * 该子项目与zuul-eureka-provider、zuul-eureka-server子项目联合使用
 * 
 * 注意：使用负载均衡和熔断，就无需使用retry。<br>
 * 使用retry，断路器就只有在该服务的所有实例都无法运作的情况下才能起作用。
 * @author bytegriffin
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulEurekaApplication {

    public static void main( String[] args ) {
    	SpringApplication.run(ZuulEurekaApplication.class, args);
    }

    /**
     * 把TokenFilter加入到启动类
     * @return
     */
    @Bean
    public TokenFilter tokenFilter() {
    	return new TokenFilter();
    }

}
