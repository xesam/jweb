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
<h1>
    <%= getText("JSP") %>
</h1>
<h1>
    <%= getText("World") %>
</h1>
<div>
    <p>application.getInitParameter("ctx_1") = <%= application.getInitParameter("ctx_1")%>
    </p>
    <p>application.getInitParameter("ctx_2") = <%= application.getInitParameter("ctx_2")%>
    </p>
    <p>
        <%= request.getContextPath()%>
    </p>
</div>
</body>
</html>