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
@Path("/OpcionesCredito")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OpcionesCreditoServicio {
	@EJB
    private OpcionesCreditoLogica logica;

	
	/**
	* retorna una lista con los OpcionesCredito que se encuentran en la base de datos
	* @return retorna una lista de OpcionesCreditoDTO
	* @generated
	*/
	@GET
	public List<OpcionesCreditoDTO> obtenerTodosOpcionesCreditos(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento OpcionesCredito
	* @return OpcionesCredito del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public OpcionesCreditoDTO obtenerOpcionesCredito(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de OpcionesCredito
	 * @param dto OpcionesCredito a guardar
	 * @return OpcionesCredito con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public OpcionesCreditoDTO guardarOpcionesCredito(OpcionesCreditoDTO dto){
	    if(dto.getId()!=null){
	        logica.actualizar(dto);
	        return dto;
	    }else{
	        return logica.guardar(dto);
	    }
	}
	
	
	/**
	 * elimina el registro OpcionesCredito con el identificador dado
	 * @param id identificador del OpcionesCredito
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarOpcionesCredito(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
