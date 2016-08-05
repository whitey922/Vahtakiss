package Servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CatchOrder extends HttpServlet{
    private static final String EMAIL = "antonlazarets@gmail.com";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int count = Integer.parseInt(req.getParameter("count"));
        PrintWriter print = resp.getWriter();

        for (int current = 0; current < count; current++) {
            print.print(printLine(req, print, current));
        }
    }

    private String printLine(HttpServletRequest req, PrintWriter print, int current) {
        String coffee = req.getParameter("coffee" + current);
        String sugar = req.getParameter("sugar" + current);
        String milk = req.getParameter("milk" + current);
        return "Type: " + coffee + " sugar: " + sugar + " milk: " + milk + "\n";
    }

}
