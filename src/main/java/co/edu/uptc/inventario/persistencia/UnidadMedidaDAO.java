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
public class UnidadMedidaDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<UnidadMedida> obtenerTodos(){
		return em.createNamedQuery("UnidadMedida.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public UnidadMedida obtener(Long id){
		return em.find(UnidadMedida.class, id);
	}
	
	
	/**
	* @generated
	*/
	public UnidadMedida guardar(UnidadMedida entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(UnidadMedida.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(UnidadMedida entidad){
		em.merge(entidad);
	}
	
	
}
