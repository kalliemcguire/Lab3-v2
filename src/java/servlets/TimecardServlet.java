/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import database.EmployeeDA;
import domain.Employee;
import domain.PayrollSystem;
import domain.Timecard;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TimecardServlet extends HttpServlet {

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
              
        HttpSession session = request.getSession();
 
        PayrollSystem.initialize();
        PayrollSystem.initCheck();
        String option = request.getParameter("option");
        System.out.println("TimecardServlet option = " + option);
        
        String url = "/success.jsp";
        
        if (option.equals("edit")) {
            url = "/timecard.jsp";
        }
        
        if (option.equals("list")) {
            Employee employee = (Employee)session.getAttribute("employee");
            System.out.println("employee: " + employee);
            //System.out.println shows in glassfish server section of output
            ArrayList<Timecard> timecards = Timecard.getEmployeeTimecards(employee.getEmployeeId());
            System.out.println("Employee Id of employee logged in " + employee.getEmployeeId());
            session.setAttribute("timecards", timecards);
            System.out.println("timecards" + timecards);
            url = "/timecardList.jsp";
            //can use cart.jsp as an example for timecardList.jsp
        }
        
        if (option.equals("add")) {
            //add timecard button
        }
        
        if (option.equals("return")) {
            url = "/login.jsp";
        }
        
        getServletContext().getRequestDispatcher(url).forward(request, response);
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
