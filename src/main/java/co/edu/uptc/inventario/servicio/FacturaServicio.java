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
@Path("/Factura")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FacturaServicio {
	@EJB
    private FacturaLogica logica;

	
	/**
	* retorna una lista con los Factura que se encuentran en la base de datos
	* @return retorna una lista de FacturaDTO
	* @generated
	*/
	@GET
	public List<FacturaDTO> obtenerTodosFacturas(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento Factura
	* @return Factura del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public FacturaDTO obtenerFactura(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de Factura
	 * @param dto Factura a guardar
	 * @return Factura con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public FacturaDTO guardarFactura(FacturaDTO dto){
	    if(dto.getId()!=null){
	        logica.actualizar(dto);
	        return dto;
	    }else{
	        return logica.guardar(dto);
	    }
	}
	
	
	/**
	 * elimina el registro Factura con el identificador dado
	 * @param id identificador del Factura
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarFactura(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
