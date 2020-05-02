package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author 
 */
@Entity
@Table(name = "unidad")
public class Unidad {
    @Id
    @GeneratedValue
    private Integer id;
    
    @Column (name = "nombre", nullable = false, length = 100)
    private String nombre;
    
    @Column (name = "descripcion", nullable = true)
    private String descripcion;
    
    @Column (name = "objetivo", nullable = true)
    private String objetivo;
    
    @Column (name = "horas_teoricas", nullable = false, length = 4)
    private Integer horasTeoricas;
    
    @Column (name = "horas_practicas", nullable = false, length = 4)
    private Integer horasPracticas;
    
    @ManyToOne
    @JoinColumn (name = "materia_id", nullable = false)
    private Materia materiaId;
    
    @Column (name = "activo")
    private Boolean activo;

    public Unidad() {
    }

    public Unidad(Integer id, String nombre, String descripcion, String objetivo, Integer horasTeoricas, Integer horasPracticas, Materia materiaId, Boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.objetivo = objetivo;
        this.horasTeoricas = horasTeoricas;
        this.horasPracticas = horasPracticas;
        this.materiaId = materiaId;
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

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Integer getHorasTeoricas() {
        return horasTeoricas;
    }

    public void setHorasTeoricas(Integer horasTeoricas) {
        this.horasTeoricas = horasTeoricas;
    }

    public Integer getHorasPracticas() {
        return horasPracticas;
    }

    public void setHorasPracticas(Integer horasPracticas) {
        this.horasPracticas = horasPracticas;
    }

    public Materia getMateriaId() {
        return materiaId;
    }

    public void setMateriaId(Materia materiaId) {
        this.materiaId = materiaId;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Unidad{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", objetivo=" + objetivo + ", horasTeoricas=" + horasTeoricas + ", horasPracticas=" + horasPracticas + ", materiaId=" + materiaId + ", activo=" + activo + '}';
    }
    
    
}
