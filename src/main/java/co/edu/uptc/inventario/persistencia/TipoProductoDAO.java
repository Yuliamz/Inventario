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
public class TipoProductoDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<TipoProducto> obtenerTodos(){
		return em.createNamedQuery("TipoProducto.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public TipoProducto obtener(Long id){
		return em.find(TipoProducto.class, id);
	}
	
	
	/**
	* @generated
	*/
	public TipoProducto guardar(TipoProducto entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(TipoProducto.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(TipoProducto entidad){
		em.merge(entidad);
	}
	
	
}
