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
        <h1>${saludo}</h1>
         <%//for(int i=0; i<999; i++){%>
        <!-- <div style="float:left; background-color:#<%//=Integer.toHexString(i)%>;"> - <%//=i%> - </div>-->
        <%//}%>
        
        <%if(request.getAttribute("opc").equals("+")){%>
            <h1>La suma de ${a}+${b} es ${a+b}</h1>
        <%}%>
    </body>
</html>
