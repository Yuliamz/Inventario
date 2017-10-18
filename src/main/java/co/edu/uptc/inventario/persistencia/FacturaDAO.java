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
public class FacturaDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Factura> obtenerTodos(){
		return em.createNamedQuery("Factura.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Factura obtener(Long id){
		return em.find(Factura.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Factura guardar(Factura entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Factura.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Factura entidad){
		em.merge(entidad);
	}
	
	
}
