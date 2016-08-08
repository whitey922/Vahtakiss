package com.vahtakiss.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Test extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
/*
        BeverageFactory factory = new BeverageFactory();

        int count = Integer.parseInt(req.getParameter("count"));
        for (int i = 0; i < count; i++) {
            factory.createBeverages(req);
        }
        List<Beverage> order = new ArrayList<Beverage>();
*/

        EmailSender.sendEmail();

        PrintWriter writer = resp.getWriter();

        writer.print("Email sent!");
    }
}
