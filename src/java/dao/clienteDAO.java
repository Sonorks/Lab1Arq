/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Cliente;

/**
 *
 * @author CASA555
 */
@Stateless
public class clienteDAO implements clienteDAOLocal {
    @PersistenceContext
    private EntityManager em;
    @Override
    public void addCliente(Cliente cliente) {
        em.persist(cliente);
        em.flush();
    }
    
    @Override
    public void editCliente(Cliente cliente){
        em.merge(cliente);
        em.flush();
    }
    @Override
    public void deleteCliente(String cc){
        em.remove(getCliente(cc));
        em.flush();
    }
    @Override
    public Cliente getCliente(String cc){
        em.flush();
        return em.find(Cliente.class, cc);
    }
    @Override
    public List<Cliente> getAllClientes() {
        em.flush();
        return em.createNamedQuery("Cliente.getAll").getResultList();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
