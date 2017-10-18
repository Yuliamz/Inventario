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
public class InventarioDetalleDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<InventarioDetalle> obtenerTodos(){
		return em.createNamedQuery("InventarioDetalle.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public InventarioDetalle obtener(Long id){
		return em.find(InventarioDetalle.class, id);
	}
	
	
	/**
	* @generated
	*/
	public InventarioDetalle guardar(InventarioDetalle entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(InventarioDetalle.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(InventarioDetalle entidad){
		em.merge(entidad);
	}
	
	
}
