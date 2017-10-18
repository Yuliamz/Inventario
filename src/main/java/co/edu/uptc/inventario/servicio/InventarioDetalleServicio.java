package co.edu.uptc.inventario.servicio;

import co.edu.uptc.inventario.dto.*;
import co.edu.uptc.inventario.logica.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
  *  @author daperador
  *  @generated
  */
@Stateless
@Path("/InventarioDetalle")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class InventarioDetalleServicio {
	@EJB
    private InventarioDetalleLogica logica;

	
	/**
	* retorna una lista con los InventarioDetalle que se encuentran en la base de datos
	* @return retorna una lista de InventarioDetalleDTO
	* @generated
	*/
	@GET
	public List<InventarioDetalleDTO> obtenerTodosInventarioDetalles(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento InventarioDetalle
	* @return InventarioDetalle del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public InventarioDetalleDTO obtenerInventarioDetalle(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de InventarioDetalle
	 * @param dto InventarioDetalle a guardar
	 * @return InventarioDetalle con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public InventarioDetalleDTO guardarInventarioDetalle(InventarioDetalleDTO dto){
	    if(dto.getId()!=null){
	        logica.actualizar(dto);
	        return dto;
	    }else{
	        return logica.guardar(dto);
	    }
	}
	
	
	/**
	 * elimina el registro InventarioDetalle con el identificador dado
	 * @param id identificador del InventarioDetalle
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarInventarioDetalle(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
