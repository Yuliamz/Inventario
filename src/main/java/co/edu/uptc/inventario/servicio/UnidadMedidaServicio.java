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
@Path("/UnidadMedida")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UnidadMedidaServicio {
	@EJB
    private UnidadMedidaLogica logica;

	
	/**
	* retorna una lista con los UnidadMedida que se encuentran en la base de datos
	* @return retorna una lista de UnidadMedidaDTO
	* @generated
	*/
	@GET
	public List<UnidadMedidaDTO> obtenerTodosUnidadMedidas(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento UnidadMedida
	* @return UnidadMedida del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public UnidadMedidaDTO obtenerUnidadMedida(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de UnidadMedida
	 * @param dto UnidadMedida a guardar
	 * @return UnidadMedida con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public UnidadMedidaDTO guardarUnidadMedida(UnidadMedidaDTO dto){
	    if(dto.getId()!=null){
	        logica.actualizar(dto);
	        return dto;
	    }else{
	        return logica.guardar(dto);
	    }
	}
	
	
	/**
	 * elimina el registro UnidadMedida con el identificador dado
	 * @param id identificador del UnidadMedida
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarUnidadMedida(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
