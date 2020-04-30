<%-- 
    Document   : ForTestJsp
    Created on : 28/04/2020, 06:48:30 PM
    Author     : jcmar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
    </head>
    <body>
         <%for(int i=0; i<999; i++){%>
         <div style="float:left; background-color:#<%=Integer.toHexString(i)%>;"> - <%=i%> - </div>
        <%}%>
    </body>
</html>
