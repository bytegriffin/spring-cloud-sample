package com.bytegriffin;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * 限流器<br>
 * 为了安全，我们需要对请求做一定的限制，比如请求中含有Token<br>
 * 便让请求继续往下走，如果请求不带Token就直接返回并给出提示
 * @author bytegriffin
 *
 */
public class TokenFilter extends ZuulFilter {

    private final Logger logger = LoggerFactory.getLogger(TokenFilter.class);

    /**
     * file类型
     * pre：在请求被路由之前调用，pre阶段可结合shiro、oauth2.0做鉴权验证
     * routing：将请求路由到微服务
     * post：在请求路由之后调用
     * error：在其他阶段请求错误时调用
     * 
     */
    @Override
    public String filterType() {
        return "pre"; 
    }

    /**
     * filter执行顺序，通过数字指定 ,优先级为0，数字越大，优先级越低
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否执行该过滤器，此处为true，说明需要过滤
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * filter需要执行的具体操作
     * 请求参数中含有token参数，那么就路由
     * 不含就不对其路由
     */
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        logger.info("【TokenFilter】截取url【{}】开始检查是否包含token参数。。。", request.getRequestURL().toString());
        String token = request.getParameter("token");// 获取请求的参数
        if (token != "" && !token.equals("")) {
            ctx.setSendZuulResponse(true); //对请求进行路由
            ctx.setResponseStatusCode(200);
            ctx.set("isSuccess", true);
            return null;
        } else {
            ctx.setSendZuulResponse(false); //不对其进行路由
            ctx.setResponseStatusCode(400);
            ctx.setResponseBody("token is empty");
            ctx.set("isSuccess", false);
            return null;
        }
    }

}