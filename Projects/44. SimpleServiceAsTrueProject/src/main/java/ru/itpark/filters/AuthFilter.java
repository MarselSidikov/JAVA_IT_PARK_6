package ru.itpark.filters;

import ru.itpark.repositories.AuthRepository;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class AuthFilter implements Filter {

    private AuthRepository authRepository;


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        System.out.println(request.getServletPath());
        filterChain.doFilter(request, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
