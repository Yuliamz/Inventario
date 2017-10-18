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
public class OpcionesCreditoLogica {
	@EJB
    private OpcionesCreditoDAO persistencia;


	
	/**
	* retorna una lista con los OpcionesCredito que se encuentran en la base de datos
	* @return retorna una lista de OpcionesCreditoDTO
	* @generated
	*/
	public List<OpcionesCreditoDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @param id identificador del elemento OpcionesCredito
	* @return OpcionesCredito del id dado
	* @generated
	*/
	public OpcionesCreditoDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * almacena la informacion de OpcionesCredito
	 * @param dto OpcionesCredito a guardar
	 * @return OpcionesCredito con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public OpcionesCreditoDTO guardar(OpcionesCreditoDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro OpcionesCredito con el identificador dado
	 * @param id identificador del OpcionesCredito
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de OpcionesCredito
	 * @param dto OpcionesCredito a guardar
	 * @return OpcionesCredito con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(OpcionesCreditoDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	public OpcionesCredito convertirDTO(OpcionesCreditoDTO dto){
		if(dto==null)return null;
		OpcionesCredito entidad=new OpcionesCredito();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
			entidad.setVigenciaDias(dto.getVigenciaDias());
		
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public List<OpcionesCredito> convertirDTO(List<OpcionesCreditoDTO> dtos){
		List<OpcionesCredito> entidades=new ArrayList<OpcionesCredito>();
		for(OpcionesCreditoDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	public OpcionesCreditoDTO convertirEntidad(OpcionesCredito entidad){
		OpcionesCreditoDTO dto=new OpcionesCreditoDTO();
		dto.setId(entidad.getId());
			dto.setNombre(entidad.getNombre());
			dto.setVigenciaDias(entidad.getVigenciaDias());
		
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	public List<OpcionesCreditoDTO> convertirEntidad(List<OpcionesCredito> entidades){
		List<OpcionesCreditoDTO> dtos=new ArrayList<OpcionesCreditoDTO>();
		for(OpcionesCredito entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
