package ru.itpark.filters;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import ru.itpark.models.User;
import ru.itpark.services.AuthService;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

public class AuthFilter implements Filter {

    private AuthService authService;


    @Override
    public void init(FilterConfig filterConfig) {
        AnnotationConfigWebApplicationContext context = (AnnotationConfigWebApplicationContext) filterConfig.getServletContext().getAttribute("context");
        context.refresh();
        authService = context.getBean(AuthService.class);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        if (forProtectedRequest(request)) {
            // достаем из запроса все куки, которые были переданы на сервер
            // их может быть много, они могут быть разные
            Cookie cookies[] = request.getCookies();
            if (cookies != null) {
                // пробегаемся по всем кукам
                for (Cookie cookie : cookies) {
                    // если мы нашли куку с названием CLIENT_ID
                    if (cookie.getName().equals("CLIENT_ID")) {
                        // то ищем пользователя, который под этой кукой
                        // был залогинен
                        Optional<User> candidateUser = authService.findUserByCookie(cookie);
                        // если пользователь есть
                        if (candidateUser.isPresent()) {
                            // разрешаем ему идти дальше
                            filterChain.doFilter(request, response);
                            return;
                        } else {
                            // если пользователя нет, кидаем
                            // браузер на страницу логина
                            response.sendRedirect("/signIn");
                            // останавливаем обработку запроса
                            return;
                        }
                    }
                }
            }
            // если мы так и не нашли нужную куку
            // отпарвляем браузер на страницу логина
            response.sendRedirect("/signIn");
            // останавливаем обработку запроса
            return;
        } else {
            filterChain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {

    }

    private boolean forProtectedRequest(HttpServletRequest request) {
        String path = request.getServletPath();
        return !(path.equals("/signIn") || path.equals("/signUp"));
    }
}