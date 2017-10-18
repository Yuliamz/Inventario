package co.edu.uptc.inventario.persistencia;

import co.edu.uptc.inventario.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.Stateless;

/**
 * @generated @author daperador
 */
@Stateless
public class TarifaDAO {

    @PersistenceContext
    private EntityManager em;

    /**
     * @generated
     */
    public List<Tarifa> obtenerTodos() {
        return em.createNamedQuery("Tarifa.obtenerTodos").getResultList();
    }

    /**
     * @generated
     */
    public Tarifa obtener(Long id) {
        return em.find(Tarifa.class, id);
    }
    public Tarifa obtenerPorProducto(Long id) {
        List<Tarifa> list = em.createNamedQuery("Tarifa.obtenerPorProducto").setParameter("idProducto", id).getResultList();
        if (!list.isEmpty()) {
            return list.get(0);
        }else{
            return null;
        }
    }

    /**
     * @generated
     */
    public Tarifa guardar(Tarifa entidad) {
        em.persist(entidad);
        return entidad;
    }

    /**
     * @generated
     */
    public void borrar(Long id) {
        em.remove(em.find(Tarifa.class, id));
    }

    /**
     * @generated
     */
    public void actualizar(Tarifa entidad) {
        em.merge(entidad);
    }

}
