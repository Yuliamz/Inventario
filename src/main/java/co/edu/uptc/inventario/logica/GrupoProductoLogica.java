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
public class GrupoProductoLogica {
	@EJB
    private GrupoProductoDAO persistencia;


	
	/**
	* retorna una lista con los GrupoProducto que se encuentran en la base de datos
	* @return retorna una lista de GrupoProductoDTO
	* @generated
	*/
	public List<GrupoProductoDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @param id identificador del elemento GrupoProducto
	* @return GrupoProducto del id dado
	* @generated
	*/
	public GrupoProductoDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * almacena la informacion de GrupoProducto
	 * @param dto GrupoProducto a guardar
	 * @return GrupoProducto con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public GrupoProductoDTO guardar(GrupoProductoDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro GrupoProducto con el identificador dado
	 * @param id identificador del GrupoProducto
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de GrupoProducto
	 * @param dto GrupoProducto a guardar
	 * @return GrupoProducto con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(GrupoProductoDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	public GrupoProducto convertirDTO(GrupoProductoDTO dto){
		if(dto==null)return null;
		GrupoProducto entidad=new GrupoProducto();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
		
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public List<GrupoProducto> convertirDTO(List<GrupoProductoDTO> dtos){
		List<GrupoProducto> entidades=new ArrayList<GrupoProducto>();
		for(GrupoProductoDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	public GrupoProductoDTO convertirEntidad(GrupoProducto entidad){
		GrupoProductoDTO dto=new GrupoProductoDTO();
		dto.setId(entidad.getId());
			dto.setNombre(entidad.getNombre());
		
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	public List<GrupoProductoDTO> convertirEntidad(List<GrupoProducto> entidades){
		List<GrupoProductoDTO> dtos=new ArrayList<GrupoProductoDTO>();
		for(GrupoProducto entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
