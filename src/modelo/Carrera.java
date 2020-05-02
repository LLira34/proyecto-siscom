/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "carrera")
public class Carrera {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false, length = 30, name = "nombre")
    private String nombre;
    @Column(nullable = false, length = 20, name = "nivel")
    private String nivel;
    @Column(nullable = false, length = 10, name = "alias")
    private String alias;
    @Column(nullable = false, name = "activo")
    private boolean activo;

 public Carrera() {
    }

    public Carrera(int id, String nombre, String nivel, String alias, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.alias = alias;
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Carrera{" + "id=" + id + ", nombre=" + nombre + ", nivel=" + nivel + ", alias=" + alias + ", activo=" + activo + '}';
    }
 
 
 
}
