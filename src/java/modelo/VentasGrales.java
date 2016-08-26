/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 *
 * @author CASA555
 */
@Entity
@Table
@NamedQueries(@NamedQuery(name="VentasGrales.getAll", query="SELECT e FROM VentasGrales e"))
public class VentasGrales {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private String codVenta;
    @Column
    private float precio;
    @Column
    private String codVehiculo;
    @Column
    private String cliente;

    public VentasGrales(String codVenta, float precio, String codVehiculo, String cliente) {
        this.codVenta = codVenta;
        this.precio = precio;
        this.codVehiculo = codVehiculo;
        this.cliente = cliente;
    }

    public VentasGrales() {
    }

    public String getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(String codVenta) {
        this.codVenta = codVenta;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getCodVehiculo() {
        return codVehiculo;
    }

    public void setCodVehiculo(String codVehiculo) {
        this.codVehiculo = codVehiculo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
}
