package com.vahtakiss.servlets;

import com.vahtakiss.classes.Beverage;
import com.vahtakiss.classes.BeverageFactory;
import com.vahtakiss.classes.utils.OrderToEmail;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Test extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        String id = "189830424";
        final String link = "https://new.vk.com/id" + id;

        BeverageFactory factory = new BeverageFactory();
        List<Beverage> order = new ArrayList<Beverage>();

        order = factory.createBeverages(req);

        OrderToEmail orderToEmail = new OrderToEmail(order, link);
        orderToEmail.sendOrder();

        String    url = "/orderInProcessed.jsp";
        ServletContext    sc  = getServletContext();
        RequestDispatcher rd  = sc.getRequestDispatcher(url);
        rd.forward(req, resp);
    }
}
