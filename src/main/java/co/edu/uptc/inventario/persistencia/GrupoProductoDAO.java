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
public class GrupoProductoDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<GrupoProducto> obtenerTodos(){
		return em.createNamedQuery("GrupoProducto.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public GrupoProducto obtener(Long id){
		return em.find(GrupoProducto.class, id);
	}
	
	
	/**
	* @generated
	*/
	public GrupoProducto guardar(GrupoProducto entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(GrupoProducto.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(GrupoProducto entidad){
		em.merge(entidad);
	}
	
	
}
