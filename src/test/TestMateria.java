package test;

import dao.impl.GenericDAOImplHibernate;
import dao.impl.MateriaDAOImplHibernate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Materia;
import utils.SiscomException;

/**
 *
 * @author gbarron
 */
public class TestMateria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            GenericDAOImplHibernate<Materia,Integer> dao = new MateriaDAOImplHibernate();
            
            List<Materia> materias = dao.findAll();
            for(Materia c: materias) {
                System.out.println(c);
            }
            
        } catch (SiscomException ex) {
            Logger.getLogger(TestMateria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
