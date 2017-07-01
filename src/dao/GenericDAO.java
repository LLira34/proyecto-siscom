package dao;

import java.io.Serializable;
import java.util.List;
import utils.SiscomException;

/**
 * 
 * @author gbarron
 * @param <T> Objeto a guardar
 * @param <ID> Identificador
 */
public interface GenericDAO<T, ID extends Serializable> {

    T create() throws SiscomException;

    void saveOrUpdate(T entity) throws SiscomException;

    T get(ID id) throws SiscomException;

    void delete(ID id) throws SiscomException;

    List<T> findAll() throws SiscomException;
}
