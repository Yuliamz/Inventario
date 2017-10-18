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
 * @author daperador
 * @generated
 */
@Stateless
@Path("/Tarifa")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TarifaServicio {

    @EJB
    private TarifaLogica logica;

    /**
     * retorna una lista con los Tarifa que se encuentran en la base de datos
     *
     * @return retorna una lista de TarifaDTO
     * @generated
     */
    @GET
    public List<TarifaDTO> obtenerTodosTarifas() {
        return logica.obtenerTodos();
    }

    /**
     * @param id identificador del elemento Tarifa
     * @return Tarifa del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public TarifaDTO obtenerTarifa(@PathParam("id") Long id) {
        return logica.obtener(id);
    }

    /**
     * almacena la informacion de Tarifa
     *
     * @param dto Tarifa a guardar
     * @return Tarifa con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public TarifaDTO guardarTarifa(TarifaDTO dto) {
        if (dto.getId() != null) {
            logica.actualizar(dto);
            return dto;
        } else {
            return logica.guardar(dto);
        }
    }

    /**
     * elimina el registro Tarifa con el identificador dado
     *
     * @param id identificador del Tarifa
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarTarifa(@PathParam("id") Long id) {
        logica.borrar(id);
    }
    
    @GET
    @Path("/producto/{id}")
    public TarifaDTO obtenerTarifaPorProducto(@PathParam("id") Long id) {
        return logica.obtenerPorProducto(id);
    }

}
