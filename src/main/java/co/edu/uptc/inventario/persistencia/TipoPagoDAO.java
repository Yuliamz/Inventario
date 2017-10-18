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
public class TipoPagoDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<TipoPago> obtenerTodos(){
		return em.createNamedQuery("TipoPago.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public TipoPago obtener(Long id){
		return em.find(TipoPago.class, id);
	}
	
	
	/**
	* @generated
	*/
	public TipoPago guardar(TipoPago entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(TipoPago.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(TipoPago entidad){
		em.merge(entidad);
	}
	
	
}
