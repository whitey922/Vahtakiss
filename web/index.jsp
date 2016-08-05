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
        function toLocal(coffee, id) {
            alert(coffee + " is added!!, id: " + id);
//            localStorage.clear();
            localStorage.setItem('id' + id + 'title', document.getElementById(coffee + "_title").innerHTML);
            localStorage.setItem('id' + id + 'sugar', document.getElementById(coffee + "_sugar").value);
            localStorage.setItem('id' + id + 'milk', document.getElementById(coffee + "_milk").value);

            console.log( localStorage.getItem('title'));
            console.log( localStorage.getItem('sugar'));
            console.log( localStorage.getItem('milk'));
        }
    </script>
</head>
<body>
<div class="container">
    <div class="row">
        <%
            int index = 0;
            String[] coffee = {"Late", "Espresso", "Mocachino", "Coffee"};
            for (int i = 0; i < coffee.length; i++) {
                out.print("<form class=\'order\'>");

                out.print("<h2 id=\'" + coffee[i] + "_title\'>" + coffee[i] + "</h2>");

                out.print("<label for=\'sugar\'>Sugar: </label>");
                out.print("<input id=\'" + coffee[i] + "_sugar\' name=\'sugar\' type=\'number\' min=\'0\' max=\'3\' value=\'1\'/>");

                out.print("<label for=\'milk\'>Milk: </label>");
                out.print("<input id=\'" + coffee[i] + "_milk\' name=\'milk\' type=\'number\' min=\'0\' max=\'2\' value=\'1\'>");

                out.print("<input type=\'submit\' value=\'Order\' onclick=\"toLocal('" + coffee[i] + "', '" + ++index + "')\"/>");

                out.print("</form>");
            }
        %>
    </div>
</div>
</body>
</html>
