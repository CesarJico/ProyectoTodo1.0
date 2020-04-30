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
        //variables 
       int a = 10;
       int b = 50;
       
        
        request.setAttribute("a",a);
        request.setAttribute("b", b);
        char opc = '+';
       switch(opc){
           case '+':
                request.setAttribute("mensaje", "Opreación suma");
                request.setAttribute("opc","+");   
                RequestDispatcher rdSuma = request.getRequestDispatcher("/suma.jsp");
                rdSuma.forward(request, response);
                break;
           case '-':
                request.setAttribute("mensaje", "Opreación resta");
                request.setAttribute("opc","-");   
                RequestDispatcher rdResta = request.getRequestDispatcher("/resta.jsp");
                rdResta.forward(request, response);
                break;
       }
    }
    
}
