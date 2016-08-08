package com.vahtakiss.classes.utils;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

class EmailSender {

    private static final String SENDERS_EMAIL = "vahtakiss.order@gmail.com";
    private static final String SENDERS_PWD = "vapenation13";
    private static final String RECIPIENTS_EMAIL = "basketwall.info@mail.ru";

    static void sendEmail(String messageText, String messageSubj) {

        Properties mailProps = new Properties();

        // Set properties required to connect to Gmail's SMTP server
        mailProps.put("mail.smtp.host", "smtp.gmail.com");
        mailProps.put("mail.smtp.port", "587");
        mailProps.put("mail.smtp.auth", "true");
        mailProps.put("mail.smtp.starttls.enable", "true");

        // Create a username-password authenticator to authenticate SMTP session
        Authenticator authenticator = new Authenticator() {
            //override the getPasswordAuthentication method
            protected PasswordAuthentication getPasswordAuthentication( ) {
                return new PasswordAuthentication(SENDERS_EMAIL, SENDERS_PWD);
            }
        };

        // Create the mail session
        Session session = Session.getDefaultInstance(mailProps, authenticator);
        try {
            // Create a default MimeMessage object.
            final MimeMessage message = new MimeMessage(session);

            // Set the sender's email address
            message.setFrom(new InternetAddress(SENDERS_EMAIL));

            // Set recipient's email address
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(RECIPIENTS_EMAIL));

            // Set the subject of the email
            message.setSubject(messageSubj);

            // Now set the actual message body of the email
            message.setText(messageText);
            
            // Send message
            Transport.send(message);

        } catch (Exception e) {
            System.err.println("Problem sending email. Exception : " + e.getMessage());
        }
    }
}