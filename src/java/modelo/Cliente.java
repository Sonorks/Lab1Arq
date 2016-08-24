/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author CASA555
 */
@Entity
@Table
@NamedQueries(@NamedQuery(name="Cliente.getAll", query="SELECT e FROM Cliente e"))
public class Cliente implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private String cc;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String telefono;

    public Cliente(String cc, String nombre, String apellido, String telefono) {
        this.cc = cc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Cliente() {
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
