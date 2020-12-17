<%@page contentType="text/html; charset=UTF-8" %>
<html>
<body>
<div>
    <h1>Posts</h1>
    <p>
        session[user] = <%= session.getAttribute("user")%>
    </p>
    <p>
        <a href="/basic/loginAction?action=logout">logout</a>
    </p>
</div>
</body>
</html>