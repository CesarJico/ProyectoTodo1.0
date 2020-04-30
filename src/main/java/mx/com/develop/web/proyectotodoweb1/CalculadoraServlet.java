/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop.web.proyectotodoweb1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jcesar
 */
@WebServlet(name = "CalculadoraServlet", urlPatterns = {"/calculadoraServlet.do"})
public class CalculadoraServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //variables  ?a=10&b=45&opc=suma
       //int a = 10;
       Integer a = Integer.parseInt(request.getParameter("a"));
       //int b = 50;
       Integer b = Integer.parseInt(request.getParameter("b"));
        request.setAttribute("a",a);
        request.setAttribute("b",b);
        //String opc = "+";
        String opc = request.getParameter("opc");//opción suma
        //System.out.println(opc);
        switch(opc){
            case "suma":
                 request.setAttribute("mensaje", "Opreación suma");
                 request.setAttribute("opc","+");   
                 RequestDispatcher rdSuma = request.getRequestDispatcher("/suma.jsp");
                 rdSuma.forward(request, response);
                 break;
            case "resta":
                 request.setAttribute("mensaje", "Opreación resta");
                 request.setAttribute("opc","-");   
                 RequestDispatcher rdResta = request.getRequestDispatcher("/resta.jsp");
                 rdResta.forward(request, response);
                 break;
            case "multiplicacion":
                 request.setAttribute("mensaje", "Opreación multiplicación");
                 request.setAttribute("opc","*");   
                 RequestDispatcher rdMultiplicacion = request.getRequestDispatcher("/multiplicacion.jsp");
                 rdMultiplicacion.forward(request, response);
                 break;
            case "division":
                 request.setAttribute("mensaje", "Opreación división");
                 request.setAttribute("opc","/");   
                 RequestDispatcher rdDivision = request.getRequestDispatcher("/division.jsp");
                 rdDivision.forward(request, response);
                 break;
        }
    }
    
}
