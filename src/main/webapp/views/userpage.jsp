<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: PavloSirenko
  Date: 31-Oct-19
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <title>User page!</title>
</head>
<%-- <body>
<div>
    <div align="center">
        <h2>Welcome to JavaChattt!</h2><br><br>
    </div>
</div>
    <div align="center">
        <h3>Here user page!</h3><br><br>
    </div> --%>
<body class="w3-light-grey">

<div class="w3-container w3-blue-grey w3-opacity w3-left-align">
    <h1>User Page!</h1>
</div>
<div class="w3-container w3-opacity w3-left-align ">
    <ul>
        <li><a href="/chats/generalchat.jsp"> GeneralGroup</a></li>
        <li><a href="/#"> PoliticGroup</a></li>
        <li><a href="/chats/funchat.jsp"> FunGroup</a></li>
    </ul>

</div>
<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-hover-green w3-round-large" onclick="location.href='/#'">Search User</button>
    <button class="w3-btn w3-hover-green w3-round-large" onclick="location.href='/#'">Your Personal Chats</button>
</div>
<div class="w3-container w3-center">

    </ul>
    <div >
        <h2>Personal info</h2>
        <label>Nick:
            <%
                List<String> nicks = (List<String>) request.getAttribute("userNicks");
                if (nicks != null && !nicks.isEmpty()) {
                    out.println("<ul class=\"w3-ul\">");
                    for (int count = 0; count < nicks.size(); count++) {
                        out.println("<li class=\"w3-hover-sand\">" + nicks.get(count)+ "</li>");
                    }
                    out.println("</ul>");
                }else out.println("<div class=\"w3-panel w3-red w3-display-container w3-card-4 w3-round\">\n" +"   \n" + "</div>");
            %>


        </label>
        <label>FirstName:
            <%
                List<String> firstNames = (List<String>) request.getAttribute("userFirstNames");
                if (firstNames != null && !firstNames.isEmpty()) {
                    out.println("<ul class=\"w3-ul\">");
                    for (int count = 0; count < firstNames.size(); count++) {
                        out.println("<li class=\"w3-hover-sand\">" + firstNames.get(count)+ "</li>");
                    }
                    out.println("</ul>");
                }else out.println("<div class=\"w3-panel w3-red w3-display-container w3-card-4 w3-round\">\n" +"   \n" + "</div>");
            %>

        </label>
        <label>LastName:
            <%
                List<String> lastnames = (List<String>) request.getAttribute("userLastNames");
                if (lastnames != null && !lastnames.isEmpty()) {
                    out.println("<ul class=\"w3-ul\">");
                    for (int count = 0; count < lastnames.size(); count++) {
                        out.println("<li class=\"w3-hover-sand\">" + lastnames.get(count)+ "</li>");
                    }
                    out.println("</ul>");
                }else out.println("<div class=\"w3-panel w3-red w3-display-container w3-card-4 w3-round\">\n" +"   \n" + "</div>");
            %>

        </label>
        <label>Email:
            <%
                List<String> emails = (List<String>) request.getAttribute("userEmails");
                if (emails != null && !emails.isEmpty()) {
                    out.println("<ul class=\"w3-ul\">");
                    for (int count = 0; count < emails.size(); count++) {
                        out.println("<li class=\"w3-hover-sand\">" + emails.get(count)+ "</li>");
                    }
                    out.println("</ul>");
                }else out.println("<div class=\"w3-panel w3-red w3-display-container w3-card-4 w3-round\">\n" +"   \n" + "</div>");
            %>

        </label>
        <label>Adress:
            <%
                List<String> adress = (List<String>) request.getAttribute("userAdress");
                if (adress != null && !adress.isEmpty()) {
                    out.println("<ul class=\"w3-ul\">");
                    for (int count = 0; count < adress.size(); count++) {
                        out.println("<li class=\"w3-hover-sand\">" + adress.get(count)+ "</li>");
                    }
                    out.println("</ul>");
                }else out.println("<div class=\"w3-panel w3-red w3-display-container w3-card-4 w3-round\">\n" + "\n" + "</div>");
            %>

        </label>

    </div>
</div>
<div>
    <div class="w3-container w3-opacity w3-center-align w3-padding">
        <button class="w3-btn w3-hover-green w3-round-large" onclick="location.href='/#'">Update personal info</button>
    </div>
</div>
</body>
</html>
