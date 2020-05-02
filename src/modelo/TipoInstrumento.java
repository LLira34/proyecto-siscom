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
 * Descripción: Mapeo de tabla tipo_instrumento que mandará a llamar los datos de la base de datos
 *              estos serán los tipos de instrumento con los que se evaluará al alumno o participante
 * @author Juan Paulino Cruz Mejía
 */
@Entity
@Table (name = "tipo_instrumento")
public class TipoInstrumento {
    @Id
    @GeneratedValue
    private Integer id;
    
    @Column (name = "nombre", nullable = false, length = 200)
    private String nombre;
    
    @Column (name = "descripcion", nullable = false, length = 200)
    private String descripcion;
    
    @Column (name = "ponderacion", nullable = false, length = 4)
    private int ponderacion;
    
    @Column (name = "activo", nullable = false)
    private Boolean activo;
    
    

    public TipoInstrumento() {
    }

    public TipoInstrumento(Integer id, String nombre, String descripcion, int ponderacion, Boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ponderacion = ponderacion;
        this.activo = activo;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(int ponderacion) {
        this.ponderacion = ponderacion;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.descripcion);
        hash = 79 * hash + Objects.hashCode(this.ponderacion);
        hash = 79 * hash + Objects.hashCode(this.activo);
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
        final Participante other = (Participante) obj;
        if (!Objects.equals(this.nombre, this.nombre)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, this.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.ponderacion, this.ponderacion)) {
            return false;
        }
        if (!Objects.equals(this.activo, this.activo)) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "TipoInstrumento{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", ponderacion=" + ponderacion + ", activo=" + activo + '}';
    }

   
    
    
}
