package com.vahtakiss.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletSendEmail extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

/*        String     to         = "order@vahtakiss.com.ua";
        String     from       = "antonlazarets@gmail.com";
        String     host       = "ftp.vahtakiss-com-ua.1gb.ua";
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);

        Session session = Session.getDefaultInstance(properties);

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from, ""));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("This is the Subject Line!");
            message.setText("This is actual message");
            Transport.send(message);

        } catch (AddressException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }*/


        String message = "Some string from SendEmail servlet";

        String            url = "/Email.jsp";
        ServletContext    sc  = getServletContext();
        RequestDispatcher rd  = sc.getRequestDispatcher(url);

        req.setAttribute("message", message);
        rd.forward(req, resp);
    }
}
