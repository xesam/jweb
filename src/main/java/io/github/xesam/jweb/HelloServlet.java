package io.github.xesam.jweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "helloServlet3",
        urlPatterns = {"/greeting3"},
        loadOnStartup = 1
)
public class HelloServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println(getServletName() + " init");
        System.out.println(getServletName() + " " + getServletContext().getInitParameter("ctx-param-1"));
        System.out.println(getServletName() + " " + getServletContext().getInitParameter("ctx-param-2"));
    }

    @Override
    public void destroy() {
        System.out.println(getServletName() + " destroy");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(String.format("ServletName:%s,hello servlet", this.getServletName()));
    }
}
