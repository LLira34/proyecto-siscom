package dao.impl;

import dao.UnidadDAO;
import java.util.List;
import modelo.Unidad;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author 
 */
public class UnidadDAOImplHibernate extends 
        GenericDAOImplHibernate<Unidad, Integer> implements UnidadDAO{
    
    public List<Unidad> lgin (String nombre){
        
        String select = "from Unidad where nombre = '"+nombre+"' ";
        
        Session sesion=sessionFactory.getCurrentSession();
        sesion.beginTransaction();
        Query query=sesion.createQuery(select);
        List<Unidad> lista = query.list();
        sesion.close();
        return lista;
    }
}
