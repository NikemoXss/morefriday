package com.more.friday.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_DECORATION_FILTER_ORDER;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;
@Component
public class TokenFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return PRE_DECORATION_FILTER_ORDER-1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        System.out.println("getMethod :"+request.getMethod());
        System.out.println("getRequestURL :"+request.getRequestURL());
        System.out.println("getLocalName :"+request.getLocalName());
        String token = request.getParameter("name");
        if(token == null) {
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().setCharacterEncoding("UTF-8");
                ctx.getResponse().getWriter().write("禁止访问");
            } catch (Exception e){
                return null;
            }
        }else {
            ctx.setSendZuulResponse(true);
            ctx.setResponseStatusCode(200);
        }
        return null;
    }
}
