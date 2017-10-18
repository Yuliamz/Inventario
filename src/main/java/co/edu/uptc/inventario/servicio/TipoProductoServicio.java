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
@Path("/TipoProducto")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TipoProductoServicio {
	@EJB
    private TipoProductoLogica logica;

	
	/**
	* retorna una lista con los TipoProducto que se encuentran en la base de datos
	* @return retorna una lista de TipoProductoDTO
	* @generated
	*/
	@GET
	public List<TipoProductoDTO> obtenerTodosTipoProductos(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento TipoProducto
	* @return TipoProducto del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public TipoProductoDTO obtenerTipoProducto(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de TipoProducto
	 * @param dto TipoProducto a guardar
	 * @return TipoProducto con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public TipoProductoDTO guardarTipoProducto(TipoProductoDTO dto){
	    if(dto.getId()!=null){
	        logica.actualizar(dto);
	        return dto;
	    }else{
	        return logica.guardar(dto);
	    }
	}
	
	
	/**
	 * elimina el registro TipoProducto con el identificador dado
	 * @param id identificador del TipoProducto
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarTipoProducto(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
