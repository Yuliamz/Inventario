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
public class TiendaLogica {
	@EJB
    private TiendaDAO persistencia;


	
	/**
	* retorna una lista con los Tienda que se encuentran en la base de datos
	* @return retorna una lista de TiendaDTO
	* @generated
	*/
	public List<TiendaDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @param id identificador del elemento Tienda
	* @return Tienda del id dado
	* @generated
	*/
	public TiendaDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * almacena la informacion de Tienda
	 * @param dto Tienda a guardar
	 * @return Tienda con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public TiendaDTO guardar(TiendaDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Tienda con el identificador dado
	 * @param id identificador del Tienda
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de Tienda
	 * @param dto Tienda a guardar
	 * @return Tienda con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(TiendaDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	public Tienda convertirDTO(TiendaDTO dto){
		if(dto==null)return null;
		Tienda entidad=new Tienda();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
		
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public List<Tienda> convertirDTO(List<TiendaDTO> dtos){
		List<Tienda> entidades=new ArrayList<Tienda>();
		for(TiendaDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	public TiendaDTO convertirEntidad(Tienda entidad){
		TiendaDTO dto=new TiendaDTO();
		dto.setId(entidad.getId());
			dto.setNombre(entidad.getNombre());
		
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	public List<TiendaDTO> convertirEntidad(List<Tienda> entidades){
		List<TiendaDTO> dtos=new ArrayList<TiendaDTO>();
		for(Tienda entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
