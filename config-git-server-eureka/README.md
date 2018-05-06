# spring-cloud-sample

高可用服务git配置中心<br>
启动顺序：config-git-eureka-server->config-git-server-eureka->config-git-client-eureka<br>
需要启动两个不同server.port的config-git-server-eureka<br>
该子项目与config-git-client-eureka、config-git-eureka-server子项目联合使用<br>
可手工测试http://localhost:8001/test-config/dev 可以查看github上<br>
https://github.com/bytegriffin/spring-cloud-sample/config-git-server-eureka/config-repo<br>
下的的配置文件，当然需要事先在github上建立好config-repo文件夹以及test-config-xxx.properties文件<br>
如果只想查看配置文件内容本身，可访问http://localhost:8001/test-config-dev.properties