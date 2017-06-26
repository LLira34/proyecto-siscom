/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.GenericDAO;
import dao.ParticipanteDAO;
import dao.impl.GenericDAOImplHibernate;
import dao.impl.ParticipanteDAOImplHibernate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Participante;
import utils.BussinessException;

/**
 *
 * @author gbarron
 */
public class TestHibernate {

    public static void main(String[] args) {

        GenericDAOImplHibernate<Participante, Integer> dao;
        dao = new ParticipanteDAOImplHibernate();

        Participante part = new Participante();
        part.setId(3);
        part.setNombre("Juan Gabriel");
        part.setApellidos("Barrón Rodríguez");
        part.setEmail("gbarroa@utng.edu.mx");
        part.setCiudad("Guanajuato");
        part.setEstado(false);
        part.setNivel(11);
        part.setPassword("12345");
        part.setRol("estudiante");
        try {
            dao.saveOrUpdate(part);
        } catch (BussinessException ex) {
            Logger.getLogger(TestHibernate.class.getName()).log(Level.SEVERE, null, ex);
        }

//            List<Participante> lista = dao.findAll();
//            for(Participante p: lista) {
//                System.out.println("Nombre " + p.getNombre());
//            }
//        part.setId(1);
//        dao.delete(1);
//        } catch (BussinessException ex) {
//            Logger.getLogger(TestHibernate.class.getName()).log(Level.SEVERE, null, ex);
    }
}

