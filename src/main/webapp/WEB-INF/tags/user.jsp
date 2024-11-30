<%--
  Created by IntelliJ IDEA.
  User: Carina
  Date: 29.11.2024
  Time: 02:44
  To change this template use File | Settings | File Templates.
--%>
users.jsp                                                                                                                                                                                             <%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>


<t:pageTemplate pageTitle="Users">
    <h1>Users</h1>


    <c:forEach var="user" items="${user}">
        <div class="row">
            <div class="col">${user.email}</div>
            <div class="col">${user.username}</div>
        </div>
    </c:forEach>

</t:pageTemplate>