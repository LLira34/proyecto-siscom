/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.ParticipanteDAO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Participante;
import org.hibernate.Query;
import org.hibernate.Session;
import utils.SiscomException;

/**
 *
 * @author gbarron
 */
public class ParticipanteDAOImplHibernate extends GenericDAOImplHibernate<Participante, Integer> implements ParticipanteDAO {

    private final static Logger LOGGER = Logger.getLogger(GenericDAOImplHibernate.class.getName());

    public List<Participante> login(String email, String password) throws SiscomException {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        try {

            String strQuery = "SELECT p FROM Participante p where email ='"
                    + email + "' and password='" + password + "'";
            Query query = session.createQuery(strQuery);
            List<Participante> entities = query.list();
            return entities;
        } catch (javax.validation.ConstraintViolationException cve) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw new SiscomException(cve);
        } catch (org.hibernate.exception.ConstraintViolationException cve) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw new SiscomException(cve);
        } catch (RuntimeException ex) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw ex;
        } catch (Exception ex) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw new RuntimeException(ex);
        } finally {
            session.close();
        }
    }

}
