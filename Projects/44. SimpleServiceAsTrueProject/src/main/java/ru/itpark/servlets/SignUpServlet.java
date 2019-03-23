package ru.itpark.servlets;

import lombok.SneakyThrows;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.itpark.forms.AuthUserForm;
import ru.itpark.services.UsersService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/signUp")
public class SignUpServlet extends HttpServlet {

    private UsersService usersService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        ApplicationContext context = new ClassPathXmlApplicationContext("ru.itpark.config\\context.xml");
        usersService = context.getBean(UsersService.class);
    }

    @SneakyThrows
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        PrintWriter writer = response.getWriter();
        writer.print("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "\t<title>SignUp</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div>\n" +
                "\t<form method='post'>\n" +
                "\t\t<input type=\"text\" name=\"login\" placeholder=\"Login\">\n" +
                "\t\t<br>\n" +
                "\t\t<input type=\"password\" name=\"password\" placeholder=\"Password\">\n" +
                "\t\t<br>\n" +
                "\t\t<input type=\"submit\" value=\"SignUp\">\n" +
                "\t</form>\n" +
                "</div>\n" +
                "</body>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AuthUserForm form = AuthUserForm.builder()
                .login(request.getParameter("login"))
                .password(request.getParameter("password"))
                .build();

        usersService.signUp(form);
        response.sendRedirect("/signInAndCreateCookieValue");
    }
}
