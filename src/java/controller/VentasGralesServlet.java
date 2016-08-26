/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.VentasGralesDAOLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.VentasGrales;

/**
 *
 * @author CASA555
 */

public class VentasGralesServlet extends HttpServlet {

    @EJB
    private VentasGralesDAOLocal ventasGralesDAO;
    
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
        VentasGrales ventasGrales = null;
        String action = request.getParameter("action");
        String codVenta = request.getParameter("codVenta");
        String cliente = request.getParameter("cliente");
        String codVehiculo = request.getParameter("codVehiculo");
        String precioStr = request.getParameter("precio");
        float precio = Float.parseFloat(precioStr);
        ventasGrales = new VentasGrales(codVenta,precio,codVehiculo,cliente);
        if("Add".equalsIgnoreCase(action)){
            ventasGralesDAO.addVentasGrales(ventasGrales);
        }
        else if("Edit".equalsIgnoreCase(action)){
            ventasGralesDAO.editVentasGrales(ventasGrales);
        }
        else if("Delete".equalsIgnoreCase(action)){
            ventasGralesDAO.deleteVentasGrales(codVenta);
        }
        else if("Search".equalsIgnoreCase(action)){
            ventasGralesDAO.getVentasGrales(codVenta);
        }
       
        request.setAttribute("ventasGrales",ventasGrales);
        request.setAttribute("allVentasGrales",ventasGralesDAO.getAllVentasGrales());
        request.getRequestDispatcher("ventasGrales.jsp").forward(request,response);
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
