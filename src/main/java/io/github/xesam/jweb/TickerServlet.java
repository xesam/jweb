package io.github.xesam.jweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

@WebServlet(
        name = "tickerServlet",
        urlPatterns = {"/tickets"},
        loadOnStartup = 1
)
@MultipartConfig(
        fileSizeThreshold = 5_242_880,
        maxFileSize = 20_971_520L,
        maxRequestSize = 41_943_040L
)
public class TickerServlet extends HttpServlet {
    private volatile int ITCKET_ID_SEQUENCE = 1;
    private Map<Integer, Ticket> ticketDatabase = new LinkedHashMap<>();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "list";
        }
        switch (action) {
            case "create":
                break;
        }
    }
}
