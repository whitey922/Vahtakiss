<%--
  Created by IntelliJ IDEA.
  User: Yegorov
  Date: 04.08.2016
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Корзина</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
    <link rel="stylesheet" href="css/main.css"/>

</head>
<body>
<div class="container">
    <div class="row">
        <form action="" method="get">
            <table id="orderList">
                <tbody>

                </tbody>
            </table>
            <input type="submit" value="Send">
        </form>
    </div>
</div>

</body>
<script>
    /*Get list objects from localstorage and put in into form to send it to server*/
    $("#orderList tbody").append(
            "<tr>" + "" +
            "<td>" + "<input type='hidden' name='count' value="+localStorage.length+">"+"</td>" +
            "</tr>");
    for (var i in localStorage) {
        var ord = JSON.parse(localStorage[i]);
        $("#orderList tbody").append(
                "<tr>" + "" +
                "<td>" + "<input type='hidden' name='name' value="+ord.coffee+">" +ord.coffee+ "</td>" +
                "<td>" + "<input type='hidden' name='sugar' value="+ord.sugar+">" +ord.sugar+ "</td>" +
                "<td>" + "<input type='hidden' name='milk' value="+ord.milk+">" +ord.milk+ "</td>" +
                "</tr>");
    }

</script>
</html>
