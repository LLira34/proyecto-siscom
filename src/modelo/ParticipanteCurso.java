/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "participante_curso")
public class ParticipanteCurso implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "participante_id")
    private Participante participanteId;

    @Id
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso cursoId;
    
    
    @ManyToOne
    @JoinColumn(name = "grupo_id")
    private Grupo grupoId;
    

    @Column(nullable = false, length = 50, name = "fecha_registro")
    private Date fechaRegistro;

    @Column(nullable = false, length = 15, name = "activo")
    private boolean activo;

    public ParticipanteCurso() {
    }

    public ParticipanteCurso(Participante participanteId, Curso cursoId, Grupo grupoId, Date fechaRegistro, boolean activo) {
        this.participanteId = participanteId;
        this.cursoId = cursoId;
        this.grupoId = grupoId;
        this.fechaRegistro = fechaRegistro;
        this.activo = activo;
    }

    public Participante getParticipanteId() {
        return participanteId;
    }

    public void setParticipanteId(Participante participanteId) {
        this.participanteId = participanteId;
    }

    public Curso getCursoId() {
        return cursoId;
    }

    public void setCursoId(Curso cursoId) {
        this.cursoId = cursoId;
    }

    public Grupo getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(Grupo grupoId) {
        this.grupoId = grupoId;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.participanteId);
        hash = 47 * hash + Objects.hashCode(this.cursoId);
        hash = 47 * hash + Objects.hashCode(this.grupoId);
        hash = 47 * hash + Objects.hashCode(this.fechaRegistro);
        hash = 47 * hash + (this.activo ? 1 : 0);
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
        final ParticipanteCurso other = (ParticipanteCurso) obj;
        if (this.activo != other.activo) {
            return false;
        }
        if (!Objects.equals(this.participanteId, other.participanteId)) {
            return false;
        }
        if (!Objects.equals(this.cursoId, other.cursoId)) {
            return false;
        }
        if (!Objects.equals(this.grupoId, other.grupoId)) {
            return false;
        }
        if (!Objects.equals(this.fechaRegistro, other.fechaRegistro)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ParticipanteCurso{" + "participanteId=" + participanteId + ", cursoId=" + cursoId + ", grupoId=" + grupoId + ", fechaRegistro=" + fechaRegistro + ", activo=" + activo + '}';
    }
    
    
    
    

  
 

}
