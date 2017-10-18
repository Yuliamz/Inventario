package co.edu.uptc.inventario.persistencia;

import co.edu.uptc.inventario.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.Stateless;

/**
  *  @generated
  *  @author daperador
  */
@Stateless
public class InventarioDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Inventario> obtenerTodos(){
		return em.createNamedQuery("Inventario.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Inventario obtener(Long id){
		return em.find(Inventario.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Inventario guardar(Inventario entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Inventario.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Inventario entidad){
		em.merge(entidad);
	}
	
	
}
