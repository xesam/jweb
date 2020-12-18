package io.github.xesam.jweb;

import javax.servlet.*;
import java.io.IOException;

public class DefaultFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(getClass().getSimpleName() + ",init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println(getClass().getSimpleName() + ",doFilter");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println(getClass().getSimpleName() + ",destroy");
    }
}
