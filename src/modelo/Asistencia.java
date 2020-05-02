/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Admin
 */
public class Asistencia {
    
    private Date fechaRegistro;
    
    @ManyToOne //Llave foranea (relacion de muchos a muchos
    @JoinColumn(name = "participante_id")
    private Participante participante;
    
    @ManyToOne //Llave foranea (relacion de muchos a muchos
    @JoinColumn(name = "curso_id")
    private Curso curso;
    
    
    @Column(name = "estado",nullable = false,length = 15 )
    private String estado;
    
    @Column(name = "comentario",nullable = false,length = 200 )
    private String comentario;
    
    @Column(name = "isContento",nullable = false,length = 1 )
    private boolean isContento;
    
    @Column(name = "isCansado",nullable = false,length = 1 )
    private boolean isCansado;
    
    @Column(name = "isFrustrado",nullable = false,length = 1 )
    private boolean isFrustrado;
    
    @Column(name = "isHambriento",nullable = false,length = 1 )
    private boolean isHambriento;
    
    @Column(name = "isDesepcionado",nullable = false,length = 1 )
    private boolean isDesepcionado;
    
    @Column(name = "isEnamorado",nullable = false,length = 1 )
    private boolean isEnamorado;

    public Asistencia() {
    }

    public Asistencia(Date fechaRegistro, Participante participante, Curso curso, String estado, String comentario, boolean isContento, boolean isCansado, boolean isFrustrado, boolean isHambriento, boolean isDesepcionado, boolean isEnamorado) {
        this.fechaRegistro = fechaRegistro;
        this.participante = participante;
        this.curso = curso;
        this.estado = estado;
        this.comentario = comentario;
        this.isContento = isContento;
        this.isCansado = isCansado;
        this.isFrustrado = isFrustrado;
        this.isHambriento = isHambriento;
        this.isDesepcionado = isDesepcionado;
        this.isEnamorado = isEnamorado;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public boolean isIsContento() {
        return isContento;
    }

    public void setIsContento(boolean isContento) {
        this.isContento = isContento;
    }

    public boolean isIsCansado() {
        return isCansado;
    }

    public void setIsCansado(boolean isCansado) {
        this.isCansado = isCansado;
    }

    public boolean isIsFrustrado() {
        return isFrustrado;
    }

    public void setIsFrustrado(boolean isFrustrado) {
        this.isFrustrado = isFrustrado;
    }

    public boolean isIsHambriento() {
        return isHambriento;
    }

    public void setIsHambriento(boolean isHambriento) {
        this.isHambriento = isHambriento;
    }

    public boolean isIsDesepcionado() {
        return isDesepcionado;
    }

    public void setIsDesepcionado(boolean isDesepcionado) {
        this.isDesepcionado = isDesepcionado;
    }

    public boolean isIsEnamorado() {
        return isEnamorado;
    }

    public void setIsEnamorado(boolean isEnamorado) {
        this.isEnamorado = isEnamorado;
    }

    @Override
    public String toString() {
        return "Asistencia{" + "fechaRegistro=" + fechaRegistro + ", participante=" + participante + ", curso=" + curso + ", estado=" + estado + ", comentario=" + comentario + ", isContento=" + isContento + ", isCansado=" + isCansado + ", isFrustrado=" + isFrustrado + ", isHambriento=" + isHambriento + ", isDesepcionado=" + isDesepcionado + ", isEnamorado=" + isEnamorado + '}';
    }
    
    
    
    
    
    
     
    
}
