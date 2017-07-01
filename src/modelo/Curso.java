/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author gbarron
 */
@Entity
@Table(name = "curso")
public class Curso {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="duracion")
    private Integer duracion;
    @Column(name="requerimientos")
    private String requerimientos;
    @Column(name="fecha_inicio")
    private String fechaInicio;
    @Column(name="fecha_fin")
    private String fechaFin;
    @Column(name="codigo")
    private String codigo;
    @Column(name="estado")
    private Boolean estado;
    @Column(name="bienvenida")
    private String bienvenida;
    @ManyToOne
    @JoinColumn(name="id_materia")
    private Materia materia;
    
    
    public Curso() {
    }

    public Curso(Integer id, String nombre, Integer duracion, String requerimientos, String fechaInicio, String fechaFin, String codigo, Boolean estado, String bienvenida) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.requerimientos = requerimientos;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.codigo = codigo;
        this.estado = estado;
        this.bienvenida = bienvenida;
//        this.materia = materia;
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

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getRequerimientos() {
        return requerimientos;
    }

    public void setRequerimientos(String requerimientos) {
        this.requerimientos = requerimientos;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getBienvenida() {
        return bienvenida;
    }

    public void setBienvenida(String bienvenida) {
        this.bienvenida = bienvenida;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Curso{" + "id=" + id + ", nombre=" + nombre + ", duracion=" + duracion + ", requerimientos=" + requerimientos + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", codigo=" + codigo + ", estado=" + estado + ", bienvenida=" + bienvenida + ", materia=" + materia + '}';
    }
    

}
