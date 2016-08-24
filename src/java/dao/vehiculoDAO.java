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
import modelo.Vehiculo;

/**
 *
 * @author CASA555
 */
@Stateless
public class vehiculoDAO implements vehiculoDAOLocal {
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public void addVehiculo(Vehiculo Vehiculo) {
        em.persist(Vehiculo);
        em.flush();
    }
    
    @Override
    public void editVehiculo(Vehiculo vehiculo) {
        em.merge(vehiculo);
        em.flush();
    }

    @Override
    public void deleteVehiculo(String CodVehiculo) {
        em.remove(getVehiculo(CodVehiculo));
        em.flush();
    }

    @Override
    public Vehiculo getVehiculo(String vehiculo) {
        em.flush();
        return em.find(Vehiculo.class, vehiculo);
    }

    @Override
    public List<Vehiculo> getAllVehiculos() {
        em.flush();
        return em.createNamedQuery("Vehiculo.getAll").getResultList();
    }
}
