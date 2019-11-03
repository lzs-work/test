package com.hxjt.cloud.com.hxjt.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description:com.hxjt.cloud.com.hxjt.filter
 * @Author: http://www.huaxintec.com/
 * @Date:${Date}
 * @Version:1.0
 */
public class TokenFilter extends ZuulFilter {


    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String token = request.getParameter("token");
        if(token==null||token.isEmpty()){
            ctx.setSendZuulResponse(false);//过滤该请求
            ctx.setResponseStatusCode(401);
            ctx.setResponseBody("token is Empty");
    }
        return null;
    }
}
