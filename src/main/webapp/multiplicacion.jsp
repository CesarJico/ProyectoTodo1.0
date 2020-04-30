<%-- 
    Document   : multiplicacion
    Created on : 30/04/2020, 05:46:49 PM
    Author     : Jcesar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Multiplicación</title>
    </head>
    <body>
        <h1>${mensaje}</h1>
        <%if(request.getAttribute("opc").equals("*")){%>
            <h1>La operación de ${a}*${b} es ${a*b}</h1>
        <%}%>
    </body>
</html>
