package com.bytegriffin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConsumeController {

	@Autowired
    HelloRemote HelloRemote;

	@RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return HelloRemote.hello(name);
    }
	
	
//    @RequestMapping("/hello")
//    public String index(@RequestParam String name) {
//        return "hello "+name+"，this is producer 2  send first messge";
//    }

}