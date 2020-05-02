/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * Descripcion
 * Clase que modela las entidades de la república mexicana.
 * @author Gabriel Barrón Rodríguez
 * @author gbarron@utng.edu.mx
 * @version 1.0
 */
@Entity
@Table (name = "entidad")
public class Entidad {
    
    @Id
    @GeneratedValue
    private Integer id;
    
    @Column (name="nombre", nullable = false, length = 50)
    private String nombre;
    
    @Column (name="alias", nullable = false, length = 5)
    private String alias;
    
    @Column (name="activo", nullable = false)
    private Boolean activo;

    /**
     * Constructor default
     */
    public Entidad() {
    }

    public Entidad(Integer id, String nombre, String alias, Boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.alias = alias;
        this.activo = activo;
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Entidad other = (Entidad) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mi Entidad{" + "id=" + id + ", nombre=" + nombre + ", alias=" + alias + ", activo=" + activo + '}';
    }
    
    
    
}
