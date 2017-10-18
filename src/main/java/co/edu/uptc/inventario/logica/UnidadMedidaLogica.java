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
public class UnidadMedidaLogica {
	@EJB
    private UnidadMedidaDAO persistencia;


	
	/**
	* retorna una lista con los UnidadMedida que se encuentran en la base de datos
	* @return retorna una lista de UnidadMedidaDTO
	* @generated
	*/
	public List<UnidadMedidaDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @param id identificador del elemento UnidadMedida
	* @return UnidadMedida del id dado
	* @generated
	*/
	public UnidadMedidaDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * almacena la informacion de UnidadMedida
	 * @param dto UnidadMedida a guardar
	 * @return UnidadMedida con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public UnidadMedidaDTO guardar(UnidadMedidaDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro UnidadMedida con el identificador dado
	 * @param id identificador del UnidadMedida
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de UnidadMedida
	 * @param dto UnidadMedida a guardar
	 * @return UnidadMedida con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(UnidadMedidaDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	public UnidadMedida convertirDTO(UnidadMedidaDTO dto){
		if(dto==null)return null;
		UnidadMedida entidad=new UnidadMedida();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
			entidad.setAbreviatura(dto.getAbreviatura());
		
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public List<UnidadMedida> convertirDTO(List<UnidadMedidaDTO> dtos){
		List<UnidadMedida> entidades=new ArrayList<UnidadMedida>();
		for(UnidadMedidaDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	public UnidadMedidaDTO convertirEntidad(UnidadMedida entidad){
		UnidadMedidaDTO dto=new UnidadMedidaDTO();
		dto.setId(entidad.getId());
			dto.setNombre(entidad.getNombre());
			dto.setAbreviatura(entidad.getAbreviatura());
		
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	public List<UnidadMedidaDTO> convertirEntidad(List<UnidadMedida> entidades){
		List<UnidadMedidaDTO> dtos=new ArrayList<UnidadMedidaDTO>();
		for(UnidadMedida entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
