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
public class DetalleFacturaDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<DetalleFactura> obtenerTodos(){
		return em.createNamedQuery("DetalleFactura.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public DetalleFactura obtener(Long id){
		return em.find(DetalleFactura.class, id);
	}
	
	
	/**
	* @generated
	*/
	public DetalleFactura guardar(DetalleFactura entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(DetalleFactura.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(DetalleFactura entidad){
		em.merge(entidad);
	}
	
	
}
