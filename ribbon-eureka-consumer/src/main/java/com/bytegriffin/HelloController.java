package com.bytegriffin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

	@Autowired
    RestTemplate restTemplate;

	/**
	 * ribbon-eureka-provider是serviceId，是ribbon-eureka-provider1和ribbon-eureka-provider2<br>
	 * 中的spring.application.name值，之所以设置相同的serviceId是因为
	 * @param name
	 * @return
	 */
    @RequestMapping(value = "/hello-consumer")
    public String hello(@RequestParam String name) {
        return restTemplate.getForEntity("http://ribbon-eureka-provider/hello-provider?name="+name, String.class).getBody();
    }

}
