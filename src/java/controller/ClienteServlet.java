/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.clienteDAO;
import dao.clienteDAOLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Cliente;

/**
 *
 * @author CASA555
 */
public class ClienteServlet extends HttpServlet {

    @EJB
    private clienteDAOLocal clienteDAO;
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
        Cliente cliente = null;
        String action = request.getParameter("action");
        String ClienteCc= request.getParameter("ClienteCc");
        String ClienteNombre = request.getParameter("ClienteNombre");
        String ClienteApellido = request.getParameter("ClienteApellido");
        String ClienteTelefono = request.getParameter("ClienteTelefono");
        System.out.println(ClienteCc);
        System.out.println(ClienteNombre);
        System.out.println(ClienteApellido);
        System.out.println(ClienteTelefono);
        cliente = new Cliente(ClienteCc, ClienteNombre,ClienteApellido,ClienteTelefono);
        if("Add".equalsIgnoreCase(action)){
            clienteDAO.addCliente(cliente);
        }
        else if("Edit".equalsIgnoreCase(action)){
            clienteDAO.editCliente(cliente);
        }
        else if("Delete".equalsIgnoreCase(action)){
            clienteDAO.deleteCliente(ClienteCc);
        }
        else if("Search".equalsIgnoreCase(action)){
            clienteDAO.getCliente(ClienteCc);
        }
        request.setAttribute("Cliente",cliente);
        request.setAttribute("allClientes",clienteDAO.getAllClientes());
        request.getRequestDispatcher("cliente.jsp").forward(request,response);
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
