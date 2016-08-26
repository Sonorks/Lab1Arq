/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.ejb.Local;
import modelo.VentasGrales;

/**
 *
 * @author CASA555
 */
@Local
public interface VentasGralesDAOLocal {
    void addVentasGrales(VentasGrales ventas);
    
    void editVentasGrales(VentasGrales ventas);

    void deleteVentasGrales(String codVenta);

    VentasGrales getVentasGrales(String codVenta);

    List<VentasGrales> getAllVentasGrales();
    
}
