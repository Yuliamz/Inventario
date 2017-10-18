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
@Path("/GrupoProducto")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GrupoProductoServicio {
	@EJB
    private GrupoProductoLogica logica;

	
	/**
	* retorna una lista con los GrupoProducto que se encuentran en la base de datos
	* @return retorna una lista de GrupoProductoDTO
	* @generated
	*/
	@GET
	public List<GrupoProductoDTO> obtenerTodosGrupoProductos(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento GrupoProducto
	* @return GrupoProducto del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public GrupoProductoDTO obtenerGrupoProducto(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de GrupoProducto
	 * @param dto GrupoProducto a guardar
	 * @return GrupoProducto con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public GrupoProductoDTO guardarGrupoProducto(GrupoProductoDTO dto){
	    if(dto.getId()!=null){
	        logica.actualizar(dto);
	        return dto;
	    }else{
	        return logica.guardar(dto);
	    }
	}
	
	
	/**
	 * elimina el registro GrupoProducto con el identificador dado
	 * @param id identificador del GrupoProducto
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarGrupoProducto(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
