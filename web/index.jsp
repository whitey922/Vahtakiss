<%--
  Created by IntelliJ IDEA.
  User: Tony
  Date: 03.08.2016
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.vahtakiss.jsp.*" %>
<html>
<head>
    <link rel="stylesheet" href="css/main.css"/>
    <title>VahtaKiss</title>
    <script>
        function toLocal(coffee) {
            alert(coffee + " is added!!!");
            localStorage.setItem('title', document.getElementById(coffee + "_title").innerHTML);
            localStorage.setItem('sugar', document.getElementById(coffee + "_sugar").value);
            localStorage.setItem('milk', document.getElementById(coffee + "_milk").value);

            console.log(localStorage.getItem('title'));
            console.log(localStorage.getItem('sugar'));
            console.log(localStorage.getItem('milk'));
        }
    </script>
</head>
<body>
<div class="container">
    <div class="row">
        <%
            String[] coffee = {"Late", "Espresso", "Mocachino", "Coffee"};

            for (int i = 0; i < coffee.length; i++) {
        %>
        <form class="order">
            <h2><%= coffee[i] %>
            </h2>
            <label for="sugar"> Sugar: </label>
            <input name="sugar" type="number" min="0" max="3" value="1"/>
            <label for="milk">Milk: </label>
            <input name="milk" type="number" min="0" max="2" value="1">
            <input type="submit" value="Order" onclick="toLocal(coffee[i])"/>
        </form>
        <%
            }
        %>
    </div>
</div>
</body>
</html>
