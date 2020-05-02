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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Descripción Modelas a las ciudades de la republica mexicana.
 *
 * @author Gabriel Barrón Rodríguez.
 * @author gbarron@utng.edu.mx
 * @version 1.0
 */
@Entity
@Table(name = "ciudad")
public class Ciudad {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "alias", nullable = false, length = 5)
    private String alias;

    @Column(name = "activo", nullable = false)
    private Boolean activo;

    @ManyToOne //Clave foranea
    @JoinColumn(name = "entidad_id")
    private Entidad entidad;

    public Ciudad() {
    }

    public Ciudad(Integer id, String nombre, String alias, Boolean activo, Entidad entidad) {
        this.id = id;
        this.nombre = nombre;
        this.alias = alias;
        this.activo = activo;
        this.entidad = entidad;
    }

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

    public Entidad getEntidad() {
        return entidad;
    }

    public void setEntidad(Entidad entidad) {
        this.entidad = entidad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.alias);
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
        final Ciudad other = (Ciudad) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.alias, other.alias)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "id=" + id + ", nombre=" + nombre + ", alias=" + alias + ", activo=" + activo + ", entidad=" + entidad + '}';
    }
    
    
}
