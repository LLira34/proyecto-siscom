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
 * @author gbarron
 */
@Entity
@Table(name="materia")
public class Materia {
    @Id
    @GeneratedValue
    private Integer id;
    
    @Column(name="nombre", nullable = false)
    private String nombre;
    @Column(name="nivel_educativo")
    private String nivelEduativo;
    @Column(name="grado")
    private Byte grado;
    @Column(name="horas_semana")
    private Byte horasSemana;
    @Column(name="objetivo")
    private String objetivo;
    @Column(name="competencia")
    private String competencia;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="duracion")
    private Byte duracion;
    @Column(name="estado")
    private boolean estado;
    @Column(name="tipo")
    private String tipo;

    public Materia() {
    }

    public Materia(Integer id, String nombre, String nivelEduativo, Byte grado, Byte horasSemana, String objetivo, String competencia, String descripcion, Byte duracion, boolean estado, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.nivelEduativo = nivelEduativo;
        this.grado = grado;
        this.horasSemana = horasSemana;
        this.objetivo = objetivo;
        this.competencia = competencia;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.estado = estado;
        this.tipo = tipo;
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

    public String getNivelEduativo() {
        return nivelEduativo;
    }

    public void setNivelEduativo(String nivelEduativo) {
        this.nivelEduativo = nivelEduativo;
    }

    public Byte getGrado() {
        return grado;
    }

    public void setGrado(Byte grado) {
        this.grado = grado;
    }

    public Byte getHorasSemana() {
        return horasSemana;
    }

    public void setHorasSemana(Byte horasSemana) {
        this.horasSemana = horasSemana;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getCompetencia() {
        return competencia;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Byte getDuracion() {
        return duracion;
    }

    public void setDuracion(Byte duracion) {
        this.duracion = duracion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Materia{" + "id=" + id + ", nombre=" + nombre + ", nivelEduativo=" + nivelEduativo + ", grado=" + grado + ", horasSemana=" + horasSemana + ", objetivo=" + objetivo + ", competencia=" + competencia + ", descripcion=" + descripcion + ", duracion=" + duracion + ", estado=" + estado + ", tipo=" + tipo + '}';
    }
    
    
}
