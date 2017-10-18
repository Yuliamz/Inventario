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
@Path("/DetalleFactura")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DetalleFacturaServicio {
	@EJB
    private DetalleFacturaLogica logica;

	
	/**
	* retorna una lista con los DetalleFactura que se encuentran en la base de datos
	* @return retorna una lista de DetalleFacturaDTO
	* @generated
	*/
	@GET
	public List<DetalleFacturaDTO> obtenerTodosDetalleFacturas(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento DetalleFactura
	* @return DetalleFactura del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public DetalleFacturaDTO obtenerDetalleFactura(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de DetalleFactura
	 * @param dto DetalleFactura a guardar
	 * @return DetalleFactura con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public DetalleFacturaDTO guardarDetalleFactura(DetalleFacturaDTO dto){
	    if(dto.getId()!=null){
	        logica.actualizar(dto);
	        return dto;
	    }else{
	        return logica.guardar(dto);
	    }
	}
	
	
	/**
	 * elimina el registro DetalleFactura con el identificador dado
	 * @param id identificador del DetalleFactura
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarDetalleFactura(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
