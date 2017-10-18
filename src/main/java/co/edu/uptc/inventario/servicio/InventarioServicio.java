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
@Path("/Inventario")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class InventarioServicio {
	@EJB
    private InventarioLogica logica;

	
	/**
	* retorna una lista con los Inventario que se encuentran en la base de datos
	* @return retorna una lista de InventarioDTO
	* @generated
	*/
	@GET
	public List<InventarioDTO> obtenerTodosInventarios(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Inventario
	* @return Inventario del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public InventarioDTO obtenerInventario(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Inventario
	 * @param dto Inventario a guardar
	 * @return Inventario con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public InventarioDTO guardarInventario(InventarioDTO dto){
	    if(dto.getId()!=null){
	        logica.actualizar(dto);
	        return dto;
	    }else{
	        return logica.guardar(dto);
	    }
	}
	
	
	/**
	 * elimina el registro Inventario con el identificador dado
	 * @param id identificador del Inventario
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarInventario(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
