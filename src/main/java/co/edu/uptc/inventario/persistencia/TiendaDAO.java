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
public class TiendaDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Tienda> obtenerTodos(){
		return em.createNamedQuery("Tienda.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Tienda obtener(Long id){
		return em.find(Tienda.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Tienda guardar(Tienda entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Tienda.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Tienda entidad){
		em.merge(entidad);
	}
	
	
}
