<%--
  Created by IntelliJ IDEA.
  User: Tony
  Date: 03.08.2016
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.vahtakiss.jsp.*" %>
<%@ page import="static java.awt.SystemColor.text" %>
<html>
<head>
    <link rel="stylesheet" href="css/main.css"/>
    <title>VahtaKiss</title>
    <script>
        function toLocal(coffee) {
            var orderObject = {
                'coffee': document.getElementById(coffee + "_title").innerHTML,
                'sugar': document.getElementById(coffee + "_sugar").value,
                'milk': document.getElementById(coffee + "_milk").value
            };
            localStorage.setItem(Math.floor(Math.random() * (1000000 - 0) + 0), JSON.stringify(orderObject));

        }
    </script>
</head>
<body>
<div class="container">
    <div class="row">
        <%! String[] coffee = {"Late", "Espresso", "Mocachino", "Coffee"}; %>
        <% for (int i = 0; i < coffee.length; i++) { %>

        <form class="order">
            <h2 id="<%=getString(coffee[i], "title")%>">
                <%= coffee[i] %>
            </h2>

            <label for="sugar"> Sugar: </label>
            <input id="<%=getString(coffee[i], "sugar")%>" name="sugar" type="number" min="0" max="3" value="1"/>

            <label for="milk">Milk: </label>
            <input id="<%=getString(coffee[i], "milk")%>" name="milk" type="number" min="0" max="2" value="1">

            <input type="submit" value="Order" onclick="toLocal('<%= coffee[i] %>')"/>
        </form>

        <% } %>

        <a href="checkout.jsp">GO TO BAG</a>

        <%!
            String getString(String coffeeType, String sufix) {
                String out = coffeeType + "_" + sufix;
                return out;
            }
        %>
    </div>
</div>
</body>
</html>
