/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.impl.CursoDAOImplHibernate;
import dao.impl.GenericDAOImplHibernate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Curso;
import utils.SiscomException;

/**
 *
 * @author gbarron
 */
public class TestCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            GenericDAOImplHibernate<Curso,Integer> dao = new CursoDAOImplHibernate();
            
            List<Curso> cursos = dao.findAll();
            for(Curso c: cursos) {
                System.out.println(c);
            }
            
        } catch (SiscomException ex) {
            Logger.getLogger(TestCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
