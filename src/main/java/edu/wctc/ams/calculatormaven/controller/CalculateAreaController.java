/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.ams.calculatormaven.controller;

import edu.wctc.ams.calculatormaven.model.CalculateArea;
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
 * @author Alec
 */
@WebServlet(name = "CalculateArea", urlPatterns = {"/CalArea"})
public class CalculateAreaController extends HttpServlet {

    
    
    private CalculateArea ca;
    private final String NEXT_PAGE = "/Home.jsp";
    private final String LENGTH = "length";
    private final String WIDTH = "width";
    private final String FINALE = "result";
    private final String RESULT_RECT = "resultRect";
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ca = new CalculateArea();
        
//        PrintWriter out = response.getWriter();
//        out.println("<!DOCTYPE html>");
//        out.println("<html>"); 
//        out.println("<head>");
//        out.println("<title>Calculated Area!!</title>");            
//        out.println("</head>");  
        
        try {
            /* TODO output your page here. You may use following sample code. */
            String numberOne = request.getParameter("numberOne");
            String numberTwo = request.getParameter("numberTwo");
            double area = ca.getRectangularArea(numberOne, numberTwo);
            
//            out.println("<body>");
//            out.println("<h1>Results: </h1><br>");
//            out.println("with " + numberOne + " and " + numberTwo + ", the area is: " +  "!");
//            out.println("</body>");
//            request.setAttribute(LENGTH, numberOne);
//            request.setAttribute(WIDTH, numberTwo);
//            request.setAttribute(FINALE, area);
              request.setAttribute(RESULT_RECT, area);
           
        }
        catch(Exception nfe){
//            out.println(" ERROR " + nfe + ".");
            request.setAttribute(FINALE, nfe);
        }
        
        RequestDispatcher view = request.getRequestDispatcher(NEXT_PAGE);
        view.forward(request, response);
//        out.println("<br><br><a href=index.html>Click here to go back!</a>");
//        out.println("</html>");  
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
