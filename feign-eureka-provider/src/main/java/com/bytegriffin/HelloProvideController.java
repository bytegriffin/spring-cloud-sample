package com.bytegriffin;

import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 针对服务调用者开放的具体服务接口<br>
 * 可以访问http://localhost:8888/hello-provider?name=abc 来测试是否启动成功
 * @author bytegriffin
 *
 */
@RestController
public class HelloProvideController {

    @RequestMapping("/hello-provider")
    public String index(@RequestParam String name) {
        return "hello "+name+"，这是服务提供者，time="+LocalDateTime.now();
    }

}