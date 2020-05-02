/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.impl.EntidadDAOImplHibernate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Entidad;
import utils.SiscomException;

/**
 *
 * @author gbarron
 */
public class TestEntidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            EntidadDAOImplHibernate dao = new EntidadDAOImplHibernate();
            
            Entidad entidad = new Entidad();
            entidad.setNombre("VERACRUZ");
            entidad.setAlias("VERA");
            entidad.setActivo(Boolean.TRUE);
            //dao.saveOrUpdate(entidad);
            
            entidad.setId(3);
            //dao.saveOrUpdate(entidad);
            //dao.delete(3);
            
            List<Entidad> entidades = dao.findAll();
            
            for (Entidad e: entidades){
                System.out.println(e);
            }
            
        } catch (SiscomException ex) {
            Logger.getLogger(TestEntidad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
