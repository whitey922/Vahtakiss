package Servlete;

/**
 * Created by Yegorov on 03.08.2016.
 */
import sun.net.www.http.HttpClient;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


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
