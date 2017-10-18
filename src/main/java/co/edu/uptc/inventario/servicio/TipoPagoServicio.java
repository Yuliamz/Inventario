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
@Path("/TipoPago")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TipoPagoServicio {
	@EJB
    private TipoPagoLogica logica;

	
	/**
	* retorna una lista con los TipoPago que se encuentran en la base de datos
	* @return retorna una lista de TipoPagoDTO
	* @generated
	*/
	@GET
	public List<TipoPagoDTO> obtenerTodosTipoPagos(){
		return logica.obtenerTodos();
	}
	
	/**
	* @param id identificador del elemento TipoPago
	* @return TipoPago del id dado
	* @generated
	*/
	@GET
	@Path("/{id}")
	public TipoPagoDTO obtenerTipoPago(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	 * almacena la informacion de TipoPago
	 * @param dto TipoPago a guardar
	 * @return TipoPago con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	@POST
	public TipoPagoDTO guardarTipoPago(TipoPagoDTO dto){
	    if(dto.getId()!=null){
	        logica.actualizar(dto);
	        return dto;
	    }else{
	        return logica.guardar(dto);
	    }
	}
	
	
	/**
	 * elimina el registro TipoPago con el identificador dado
	 * @param id identificador del TipoPago
	 * @generated 
	 */
	@DELETE
	@Path("/{id}")
	public void borrarTipoPago(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
}
