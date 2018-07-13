<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.lang.Math" %>
<%!
    public int add(int a, int b) {
        return a + b;
    }
%>
<html>
<head>
    <title>black</title>
</head>
<body>
<h1>hello blank</h1>
<h2>
    <%=add(2, 3)%>
</h2>
<h2>
    <%=Math.sin(Math.PI)%>
</h2>
</body>
</html>
