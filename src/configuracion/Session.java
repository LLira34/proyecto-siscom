/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracion;

import java.util.List;
import modelo.Curso;

/**
 * Clase que almacenará la información importante de un usuario en particular.
 * Ésta clase utilizar el patrón Singleton
 * @author Gabriel Barrón Rodríguez.
 * @version 1.0
 */
public class Session {
    private static Session instance;//Instancia singleton
            
    private static String nombre; //Nombre completo de Usuario
    private static List<Curso> cursos; //Lista de cursos de usuario
    
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
