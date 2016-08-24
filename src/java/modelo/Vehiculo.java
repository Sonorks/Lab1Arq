package modelo;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CASA555
 */
 @Entity
 @Table
 @NamedQueries(@NamedQuery(name="Vehiculo.getAll",query="SELECT e FROM Vehiculo e"))
public class Vehiculo implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column 
    private String cod;
    @Column 
    private String marca;
    @Column 
    private float precio;

    public Vehiculo() {
    }

    public Vehiculo(String cod, String marca, float precio) {
        this.cod = cod;
        this.marca = marca;
        this.precio = precio;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
