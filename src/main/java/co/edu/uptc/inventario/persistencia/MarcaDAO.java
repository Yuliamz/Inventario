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
public class MarcaDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Marca> obtenerTodos(){
		return em.createNamedQuery("Marca.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Marca obtener(Long id){
		return em.find(Marca.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Marca guardar(Marca entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Marca.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Marca entidad){
		em.merge(entidad);
	}
	
	
}
