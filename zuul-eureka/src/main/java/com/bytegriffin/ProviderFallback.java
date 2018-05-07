package com.bytegriffin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 路由熔断器<br>
 * 启动顺序：zuul-eureka-server、zuul-eureka-provider、zuul-eureka<br>
 * 先访问http://localhost:8888/zuul-eureka-provider/hello?name=abc&token=123<br>
 * 再停掉zuul-eureka-provider后，再次访问上面的url，就会自动返回错误信息。<br>
 * 
 * @author bytegriffin
 *
 */
@Component
public class ProviderFallback implements FallbackProvider {

    private final Logger logger = LoggerFactory.getLogger(FallbackProvider.class);

    /**
     * 指定要熔断处理的 serviceId
     */
    @Override
    public String getRoute() {
        return "zuul-eureka-provider";
    }

    /**
     * 当Zuul出现断路时，它会提供一个什么返回值来处理请求
     * 这本身是一种降级操作
     */
	@Override
	public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
		if (cause != null && cause.getCause() != null) {
            String reason = cause.getCause().getMessage();
            logger.info("Excption {}",reason);
        }
		return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.OK;
            }
            
            @Override
            public int getRawStatusCode() throws IOException {
                return 200;
            }

            @Override
            public String getStatusText() throws IOException {
                return "OK";
            }

            @Override
            public void close() {

            }

            @Override
            public InputStream getBody() throws IOException {
                return new ByteArrayInputStream("该服务已经停用。".getBytes());
            }

            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON);
                return headers;
            }
        };
	}


}
