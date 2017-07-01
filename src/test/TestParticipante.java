package test;

import dao.impl.GenericDAOImplHibernate;
import dao.impl.ParticipanteDAOImplHibernate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Participante;
import utils.SiscomException;

/**
 *
 * @author gbarron
 */
public class TestParticipante {

    public static void main(String[] args) {

        try {
            GenericDAOImplHibernate<Participante, Integer> dao;
            dao = new ParticipanteDAOImplHibernate();

//        Participante part = new Participante();
//        //pardao = new ParticipanteDAOImplHibernate();t.setId(3);
//        part.setNombre("Juan Gabriel");
//        part.setApellidos("Barrón Rodríguez");
//        part.setEmail("gbarroa@utng.edu.mx");
//        part.setCiudad("Guanajuato");
//        part.setEstado(false);
//        part.setNivel(11);
//        part.setPassword("12345");
//        part.setRol("estudiante");
//        try {
//            dao.saveOrUpdate(part);
//        } catch (SiscomException ex) {
//            Logger.getLogger(TestParticipante.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            List<Participante> lista = dao.findAll();
//            for(Participante p: lista) {
//                System.out.println("Nombre " + p.getNombre());
//            }
//        part.setId(1);
//        dao.delete(1);
//        } catch (SiscomException ex) {
//            Logger.getLogger(TestHibernate.class.getName()).log(Level.SEVERE, null, ex);
//            List<Participante> lista = dao.findAll();
//            for(Participante p: lista) {
//                System.out.println("Nombre " + p.getNombre());
//            }
//        part.setId(1);
//        dao.delete(1);
//        } catch (SiscomException ex) {
//            Logger.getLogger(TestParticipante.class.getName()).log(Level.SEVERE, null, ex);
            List<Participante> participantes = dao.findAll();

            for (Participante participante : participantes) {
                System.out.println(participante);
            }
        } catch (SiscomException ex) {
            Logger.getLogger(TestParticipante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
