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
@Path("/Tienda")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TiendaServicio {
	@EJB
    private TiendaLogica logica;

	
	/**
	* retorna una lista con los Tienda que se encuentran en la base de datos
	* @return retorna una lista de TiendaDTO
	* @generated
	*/
	@GET
	public List<TiendaDTO> obtenerTodosTiendas(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Tienda
	* @return Tienda del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public TiendaDTO obtenerTienda(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Tienda
	 * @param dto Tienda a guardar
	 * @return Tienda con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public TiendaDTO guardarTienda(TiendaDTO dto){
	    if(dto.getId()!=null){
	        logica.actualizar(dto);
	        return dto;
	    }else{
	        return logica.guardar(dto);
	    }
	}
	
	
	/**
	 * elimina el registro Tienda con el identificador dado
	 * @param id identificador del Tienda
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarTienda(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
