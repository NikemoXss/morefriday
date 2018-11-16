package com.more.friday.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebFilter(urlPatterns="/*")
public class HttpFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter init............");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String uri = request.getRequestURI();
        System.out.println("uri : "+uri);
      //  response.sendRedirect("/person/find/all");
        //先sendRedirect再filterChain
       // filterChain.doFilter(servletRequest,servletResponse);
        //对于http的response，如果已经进行了提交（重定向，请求转发，过滤器中的放行），则不能对response再进行任何操作(加上return)，比如修改，比如再次提交。
        return;
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter destroy..........");
    }
}
