<%@page contentType="text/html; charset=UTF-8" %>
<%!
    String getText(String content) {
        return "Hello " + content;
    }
%>
<html>
<head>
    <%@include file="head.jsp" %>
</head>
<body>
<p>
    <%= getText("A") %>
</p>
<p>
    <%= getText("B") %>
</p>
<div>
    <p>application.getInitParameter("ctx_1") = <%= application.getInitParameter("ctx_1")%>
    </p>
    <p>application.getInitParameter("ctx_2") = <%= application.getInitParameter("ctx_2")%>
    </p>
    <p>
        <%= request.getContextPath()%>
    </p>
    <p><a href="loginAction">login</a></p>
</div>
</body>
</html>