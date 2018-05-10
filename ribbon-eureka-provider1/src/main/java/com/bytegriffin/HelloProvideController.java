package com.bytegriffin;

import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 针对服务调用者开放的具体服务接口
 * @author bytegriffin
 *
 */
@RestController
public class HelloProvideController {

    @RequestMapping("/hello-provider")
    public String index(@RequestParam String name) {
        return "hello "+name+"，这是服务提供者11111，time="+LocalDateTime.now();
    }

}