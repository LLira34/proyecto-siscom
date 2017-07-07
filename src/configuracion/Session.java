package configuracion;

import java.util.List;

/**
 * Clase que almacenará la información importante de un usuario en particular.
 * Ésta clase utilizar el patrón Singleton
 * @author Gabriel Barrón Rodríguez.
 * @version 1.0
 */
public class Session {
    
    private static Session instance;//Instancia singleton
            
    private String nombre; //Nombre completo de Usuario
    private int idCurso; //Clave del curso
    
    /**
     * Constructor privado.
     */
    private Session() {
        
    }
    
    /**
     *  Método que regresa una única instancia.
     * @return Instancia de session.
     */
    public static Session getInstance() {
        if (instance == null)
            instance = new Session();
        
        return instance;
    }
    
}
