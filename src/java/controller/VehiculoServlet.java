/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.vehiculoDAOLocal;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.console;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Vehiculo;

/**
 *
 * @author CASA555
 */
@MultipartConfig(fileSizeThreshold=1024*1024*10,maxFileSize=1024*1024*50,maxRequestSize=1024*1024*100,location="/")
public class VehiculoServlet extends HttpServlet {

    @EJB
    private vehiculoDAOLocal vehiculoDAO;
    
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
        Vehiculo vehiculo = null;
        float VehiculoPrecio=0;
        String action = request.getParameter("action");
        String VehiculoCod= request.getParameter("VehiculoCod");
        String PrecioStr = request.getParameter("vehiculoPrecio");
        VehiculoPrecio = Float.parseFloat(PrecioStr);
        String VehiculoMarca = request.getParameter("vehiculoMarca");
        System.out.println(VehiculoMarca);
        System.out.println(VehiculoCod);
        System.out.println(VehiculoPrecio);
        vehiculo = new Vehiculo(VehiculoCod,VehiculoMarca,VehiculoPrecio);
        if("Add".equalsIgnoreCase(action)){
            vehiculoDAO.addVehiculo(vehiculo);
        }
        else if("Edit".equalsIgnoreCase(action)){
            vehiculoDAO.editVehiculo(vehiculo);
        }
        else if("Delete".equalsIgnoreCase(action)){
            vehiculoDAO.deleteVehiculo(VehiculoCod);
        }
        else if("Search".equalsIgnoreCase(action)){
            vehiculoDAO.getVehiculo(VehiculoCod);
        }
        
        request.setAttribute("Vehiculo",vehiculo);
        request.setAttribute("allVehiculos",vehiculoDAO.getAllVehiculos());
        request.getRequestDispatcher("vehiculo.jsp").forward(request,response);
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
