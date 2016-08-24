/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.ejb.Local;
import modelo.Cliente;

/**
 *
 * @author CASA555
 */
@Local
public interface clienteDAOLocal {

    void addCliente(Cliente cliente);
    
    void editCliente(Cliente cliente);

    void deleteCliente(String cc);

    Cliente getCliente(String cc);

    List<Cliente> getAllClientes();
    
}
