
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author gbarron
 */
@Entity
@Table(name="participante") 
public class Participante implements Serializable{
    
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    
    @Column(name="nombre", nullable = false, length = 50)
    private String nombre;
    @Column(name="apellidos", nullable = false, length = 100)
    private String apellidos;
    @Column(name="email", nullable = false, length = 150, unique = true)
    private String email;
    @Column(name="password", nullable = false, length = 15)
    private String password;
    @Column(name="nivel", nullable = false)
    private int nivel;
    @Column(name="ciudad", nullable = false)
    private String ciudad;
    @Column(name="estado")
    private boolean estado;
    @Column(name="rol")
    private String rol;
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Curso> curso = new ArrayList<>();

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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

//    public List<Curso> getCursos() {
 //       return curso;
 //   }

    @Override
    public String toString() {
        return "Participante{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", password=" + password + ", nivel=" + nivel + ", ciudad=" + ciudad + ", estado=" + estado + ", rol=" + rol + ", cursos=" + curso + '}';
    }

    
}
