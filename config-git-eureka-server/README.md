# spring-cloud-sample

git配置服务注册中心<br>
如果配置中心是集群的话，可以考虑将这些服务全部注册到eureka中<br>
以达到高可用，访问http://localhost:8761/<br>
启动顺序：config-git-eureka-server->config-git-server-eureka->config-git-client-eureka
