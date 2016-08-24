/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.ejb.Local;
import modelo.Vehiculo;

/**
 *
 * @author CASA555
 */
@Local
public interface vehiculoDAOLocal {

    void addVehiculo(Vehiculo Vehiculo);

    void editVehiculo(Vehiculo vehiculo);

    void deleteVehiculo(String CodVehiculo);

    Vehiculo getVehiculo(String vehiculo);

    List<Vehiculo> getAllVehiculos();
    
}
