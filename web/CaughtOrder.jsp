<%@ page import="java.util.List" %>
<%@ page import="com.vahtakiss.classes.Beverage" %><%--
  Created by IntelliJ IDEA.
  User: Tony
  Date: 06.08.2016
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>YouOrder</title>
    <link rel="stylesheet" href="css/caughtOrder.css"/>
</head>
<body>
    <% List<Beverage> list = (List<Beverage>) request.getAttribute("orderList"); %>
    <div id="content">
        <table class="coffeeOrderList">
            <%    for (int i = 0; i < list.size(); i++) { %>
                <%--<tr>--%>
                    <%--<td><strong>Type: <%= list.get(i).getType()%></strong></td>--%>
                    <%--<td>Sugar: <%= list.get(i).getSugar()%></td>--%>
                    <%--<td>Milk: <%= list.get(i).getMilk()%></td>--%>
                <%--</tr>--%>
            <% } %>
        </table>
    </div>
</body>
</html>
