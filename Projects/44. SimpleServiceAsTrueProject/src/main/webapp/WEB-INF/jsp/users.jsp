<%--<%@ page import="ru.itpark.models.User" %>--%>
<%--<%@ page import="java.util.List" %>--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        <%@include file="/WEB-INF/css/style.css"%>
    </style>
</head>
<body>
<div>
    <table>
        <tr>
            <th>id</th>
            <th>First Name</th>
            <th>Last Name</th>
        </tr>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
            </tr>
        </c:forEach>
        <%--<%--%>
            <%--List<User> users = (List<User>) request.getAttribute("users");--%>
            <%--for (User user : users) {--%>
        <%--%>--%>
        <%--<tr>--%>
            <%--<td><%=user.getId()%>--%>
            <%--</td>--%>
            <%--<td><%=user.getFirstName()%>--%>
            <%--</td>--%>
            <%--<td><%=user.getLastName()%>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<%--%>
            <%--}--%>
        <%--%>--%>
    </table>
</div>
</body>
</html>
