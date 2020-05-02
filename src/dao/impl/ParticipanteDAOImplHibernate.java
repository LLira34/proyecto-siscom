/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.ParticipanteDAO;
import java.util.List;
import modelo.Participante;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author gbarron
 */
public class ParticipanteDAOImplHibernate extends GenericDAOImplHibernate<Participante, Integer> implements ParticipanteDAO{
    
    public List<Participante> login (String email, String password){
        
        String select = "from Participante where email ='" + email + "' and " +
                "password='" + password + "'";
        
        Session sesion = sessionFactory.getCurrentSession();
        sesion.beginTransaction();
        Query query = sesion.createQuery(select);
        List<Participante> lista = query.list();
        sesion.getTransaction().commit();
        return lista;
    } 
    
}
