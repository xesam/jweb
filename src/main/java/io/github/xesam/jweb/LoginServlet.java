package io.github.xesam.jweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(
        name = "loginAction",
        urlPatterns = {"/loginAction"},
        loadOnStartup = 1
)
public class LoginServlet extends HttpServlet {
    private String NAME = "admin";
    private String PASSWORD = "admin";

    @Override
    public void init() throws ServletException {
        System.out.println(getServletName() + " init");
    }

    @Override
    public void destroy() {
        System.out.println(getServletName() + " destroy");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String action = req.getParameter("action");
        if (action != null && action.equals("logout")) {
            req.getSession().invalidate();
            resp.sendRedirect("loginAction");
//            resp.sendRedirect("login/login.jsp");
            return;
        }
        HttpSession session = req.getSession();
        if (session.getAttribute("user") != null) {
            resp.sendRedirect("login/posts.jsp");
            return;
        }
        req.getRequestDispatcher("login/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if (session.getAttribute("user") != null) {
            resp.sendRedirect("login/posts.jsp");
            return;
        }
        String name = req.getParameter("name");
        String pwd = req.getParameter("pwd");
        if (NAME.equals(name) && PASSWORD.equals(pwd)) {
            req.changeSessionId();
            session.setAttribute("user", name);
            resp.sendRedirect("login/posts.jsp");
            return;
        }
        req.getRequestDispatcher("login/login.jsp").forward(req, resp);
    }
}
