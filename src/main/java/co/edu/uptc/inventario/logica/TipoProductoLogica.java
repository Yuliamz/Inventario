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
public class TipoProductoLogica {
	@EJB
    private TipoProductoDAO persistencia;


	
	/**
	* retorna una lista con los TipoProducto que se encuentran en la base de datos
	* @return retorna una lista de TipoProductoDTO
	* @generated
	*/
	public List<TipoProductoDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @param id identificador del elemento TipoProducto
	* @return TipoProducto del id dado
	* @generated
	*/
	public TipoProductoDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * almacena la informacion de TipoProducto
	 * @param dto TipoProducto a guardar
	 * @return TipoProducto con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public TipoProductoDTO guardar(TipoProductoDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro TipoProducto con el identificador dado
	 * @param id identificador del TipoProducto
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de TipoProducto
	 * @param dto TipoProducto a guardar
	 * @return TipoProducto con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(TipoProductoDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	public TipoProducto convertirDTO(TipoProductoDTO dto){
		if(dto==null)return null;
		TipoProducto entidad=new TipoProducto();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
		
			if(dto.getGrupoProducto()!=null){
				entidad.setGrupoProducto(new GrupoProducto());
				entidad.getGrupoProducto().setId(dto.getGrupoProducto().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public List<TipoProducto> convertirDTO(List<TipoProductoDTO> dtos){
		List<TipoProducto> entidades=new ArrayList<TipoProducto>();
		for(TipoProductoDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	public TipoProductoDTO convertirEntidad(TipoProducto entidad){
		TipoProductoDTO dto=new TipoProductoDTO();
		dto.setId(entidad.getId());
			dto.setNombre(entidad.getNombre());
		
			if(entidad.getGrupoProducto()!=null){
				dto.setGrupoProducto(
					new GrupoProductoDTO(
						entidad.getGrupoProducto().getId()));
			}
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	public List<TipoProductoDTO> convertirEntidad(List<TipoProducto> entidades){
		List<TipoProductoDTO> dtos=new ArrayList<TipoProductoDTO>();
		for(TipoProducto entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
