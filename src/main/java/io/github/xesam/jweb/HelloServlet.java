package io.github.xesam.jweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "hello3",
        urlPatterns = {"/hello3"},
        loadOnStartup = 1
)
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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("doGet");
        PrintWriter writer = resp.getWriter();
        writer.println(String.format("HelloServlet:%s", this.getServletName()));
    }
}
