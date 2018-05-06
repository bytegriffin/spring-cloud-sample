package com.bytegriffin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * git配置中心 <br />
 * 可手工测试http://localhost:8001/test-config/dev 可以查看github上<br />
 * https://github.com/bytegriffin/spring-cloud-sample/config-git-server/config-repo<br />
 * 下的的配置文件，当然需要事先在github上建立好config-repo文件夹以及test-config-xxx.properties文件<br />
 * 如果只想查看配置文件内容本身，可访问http://localhost:8001/test-config-dev.properties<br />
 * 配置中心会将访问配置文件自动转换为Web服务<br />
 * 该子项目与config-git-client-eureka子项目联合使用
 * @author bytegriffin
 *
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigGitServerApplication {

    public static void main( String[] args ) {
    	SpringApplication.run(ConfigGitServerApplication.class, args);
    }

}
