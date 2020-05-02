package modelo;

import java.sql.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Descripcion Modela a todos los participantes de nuestra aplicación
 *
 * @author Gabriel Barrón Rodríguez.
 * @author gbarron@utng.edu.mx
 * @version 1.0
 */
@Entity
@Table(name = "participante")
public class Participante {

    @Id //Clave primaria
    @GeneratedValue
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "apellidos", nullable = false, length = 100)
    private String apellidos;

    @Column(name = "email", nullable = false, length = 150)
    private String email;

    @Column(name = "password", nullable = false, length = 15)
    private String password;

    @Column(name = "activo", nullable = false, length = 15)
    private Boolean activo;

    @Column (name="ultimo_acceso", nullable = false)
    private Date ultimoAcceso;
    
    @Column (name = "rol", nullable = false, length = 30)
    private String rol;

    @ManyToOne
    @JoinColumn (name="ciudad_id")
    private Ciudad ciudad;

    /**
     * Default
     */
    public Participante() {
    }

    /**
     * 
     * @param id
     * @param nombre
     * @param apellidos
     * @param email
     * @param password
     * @param activo
     * @param ultimoAcceso
     * @param rol
     * @param ciudad 
     */
    public Participante(Integer id, String nombre, String apellidos, String email, String password, Boolean activo, Date ultimoAcceso, String rol, Ciudad ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.password = password;
        this.activo = activo;
        this.ultimoAcceso = ultimoAcceso;
        this.rol = rol;
        this.ciudad = ciudad;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Date getUltimoAcceso() {
        return ultimoAcceso;
    }

    public void setUltimoAcceso(Date ultimoAcceso) {
        this.ultimoAcceso = ultimoAcceso;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.apellidos);
        hash = 79 * hash + Objects.hashCode(this.email);
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
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Participante{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", password=" + password + ", activo=" + activo + ", ultimoAcceso=" + ultimoAcceso + ", rol=" + rol + ", ciudad=" + ciudad + '}';
    }
    
    
    
    
}
