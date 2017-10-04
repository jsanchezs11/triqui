/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sala_04
 */
@WebServlet(urlPatterns = {"/ControladorServlet"})
public class ControladorServlet extends HttpServlet {


     
  

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
      //  processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String num1=request.getParameter("num1");
        String num2=request.getParameter("num2");
        String num3=request.getParameter("num3");
        String num4=request.getParameter("num4");
        String num5=request.getParameter("num5");
        String num6=request.getParameter("num6");
        String num7=request.getParameter("num7");
        String num8=request.getParameter("num8");
        String num9=request.getParameter("num9");
        request.getRequestDispatcher("index.jsp").forward(request, response);
        //processRequest(request, response);
    }


}
