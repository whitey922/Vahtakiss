package com.vahtakiss.servlets;

import com.vahtakiss.classes.Beverage;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int count = Integer.parseInt(req.getParameter("count"));
        List<Beverage> order = new ArrayList<Beverage>();

    }
}
