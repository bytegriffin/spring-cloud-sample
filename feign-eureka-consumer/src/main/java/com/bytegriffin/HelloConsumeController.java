package com.bytegriffin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务调用者<br>
 * 可以访问http://localhost:7777/hello/abc 来测试是否启动成功
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