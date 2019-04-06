package ru.itpark.app;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import ru.itpark.config.AppConfig;
import ru.itpark.filters.AuthFilter;
import ru.itpark.repositories.AuthRepository;
import ru.itpark.services.AuthService;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

// замена web.xml
public class AppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // загрузили конфигурацию бинов в контекст Spring
        AnnotationConfigWebApplicationContext context
                = new AnnotationConfigWebApplicationContext();
        context.register(AppConfig.class);
        // кладем в контекст сервлетов бин с AuthService
        servletContext.setAttribute("context", context);
        // сказали контексту спринг, что ему нужно работать
        // с контекстом сервлетов
        context.setServletContext(servletContext);
        // создаем DispatcherServlet
        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
        // регистрируем данный сервлет в контексте всех сервлетов
        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", dispatcherServlet);
        servlet.setLoadOnStartup(1);
        // говорим, что наш сервлет будет работать со всеми урлами
        servlet.addMapping("/");
        servletContext.addFilter("authFilter", AuthFilter.class).addMappingForUrlPatterns(null, false, "/*");
    }
}
