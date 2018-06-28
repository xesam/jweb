package io.github.xesam.jweb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println(getServletName() + " init");
    }

    @Override
    public void destroy() {
        System.out.println(getServletName() + " destroy");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("hello servlet");
    }
}