package co.edu.uptc.inventario.logica;

import co.edu.uptc.inventario.dto.*;
import co.edu.uptc.inventario.persistencia.*;
import co.edu.uptc.inventario.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
  *  @generated
  *  @author daperador
  */
@Stateless
public class TipoPagoLogica {
	@EJB
    private TipoPagoDAO persistencia;


	
	/**
	* retorna una lista con los TipoPago que se encuentran en la base de datos
	* @return retorna una lista de TipoPagoDTO
	* @generated
	*/
	public List<TipoPagoDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @param id identificador del elemento TipoPago
	* @return TipoPago del id dado
	* @generated
	*/
	public TipoPagoDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * almacena la informacion de TipoPago
	 * @param dto TipoPago a guardar
	 * @return TipoPago con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public TipoPagoDTO guardar(TipoPagoDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro TipoPago con el identificador dado
	 * @param id identificador del TipoPago
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de TipoPago
	 * @param dto TipoPago a guardar
	 * @return TipoPago con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(TipoPagoDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	public TipoPago convertirDTO(TipoPagoDTO dto){
		if(dto==null)return null;
		TipoPago entidad=new TipoPago();
		entidad.setId(dto.getId());
			entidad.setEfectivo(dto.getEfectivo());
			entidad.setTarjeta(dto.getTarjeta());
			entidad.setCheque(dto.getCheque());
		
			if(dto.getOpcionesCredito()!=null){
				entidad.setOpcionesCredito(new OpcionesCredito());
				entidad.getOpcionesCredito().setId(dto.getOpcionesCredito().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public List<TipoPago> convertirDTO(List<TipoPagoDTO> dtos){
		List<TipoPago> entidades=new ArrayList<TipoPago>();
		for(TipoPagoDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	public TipoPagoDTO convertirEntidad(TipoPago entidad){
		TipoPagoDTO dto=new TipoPagoDTO();
		dto.setId(entidad.getId());
			dto.setEfectivo(entidad.getEfectivo());
			dto.setTarjeta(entidad.getTarjeta());
			dto.setCheque(entidad.getCheque());
		
			if(entidad.getOpcionesCredito()!=null){
				dto.setOpcionesCredito(
					new OpcionesCreditoDTO(
						entidad.getOpcionesCredito().getId()));
			}
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	public List<TipoPagoDTO> convertirEntidad(List<TipoPago> entidades){
		List<TipoPagoDTO> dtos=new ArrayList<TipoPagoDTO>();
		for(TipoPago entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
