package com.bytegriffin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 可调用http://localhost:9001/hello/abc 测试
 * @author bytegriffin
 *
 */
@RestController
public class HelloConsumeController {

	@Autowired
    HelloRemote HelloRemote;

	@RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return HelloRemote.hello(name);
    }

}