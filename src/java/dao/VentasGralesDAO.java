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
import modelo.VentasGrales;

/**
 *
 * @author CASA555
 */
@Stateless
public class VentasGralesDAO implements VentasGralesDAOLocal {
    @PersistenceContext
    private EntityManager em;
    @Override
    public void addVentasGrales(VentasGrales ventas){
        em.persist(ventas);
        em.flush();
    }
    @Override
    public void editVentasGrales(VentasGrales ventas){
        em.merge(ventas);
        em.flush();
    }
    @Override
    public void deleteVentasGrales(String codVenta){
        em.flush();
        em.remove(getVentasGrales(codVenta));
    }
    @Override
    public VentasGrales getVentasGrales(String codVenta){
        em.flush();
        return em.find(VentasGrales.class, codVenta);
    }
    @Override
    public List<VentasGrales> getAllVentasGrales(){
        em.flush();
        return em.createNamedQuery("VentasGrales.getAll").getResultList();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
