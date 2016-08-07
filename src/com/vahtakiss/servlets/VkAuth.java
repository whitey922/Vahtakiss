package com.vahtakiss.servlets;

/**
 * Created by Yegorov on 03.08.2016.
 */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class VkAuth extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.sendRedirect("http://oauth.vk.com/authorize?client_id=5574035&" +
//                "scope=users&redirect_uri='http://vahta.com.ua'&" +
//                "display=popup&response_type=token");


    }
}
