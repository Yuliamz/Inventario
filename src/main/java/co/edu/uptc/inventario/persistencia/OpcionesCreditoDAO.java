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
public class OpcionesCreditoDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<OpcionesCredito> obtenerTodos(){
		return em.createNamedQuery("OpcionesCredito.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public OpcionesCredito obtener(Long id){
		return em.find(OpcionesCredito.class, id);
	}
	
	
	/**
	* @generated
	*/
	public OpcionesCredito guardar(OpcionesCredito entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(OpcionesCredito.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(OpcionesCredito entidad){
		em.merge(entidad);
	}
	
	
}
