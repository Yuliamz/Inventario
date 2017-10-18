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
public class MarcaLogica {
	@EJB
    private MarcaDAO persistencia;


	
	/**
	* retorna una lista con los Marca que se encuentran en la base de datos
	* @return retorna una lista de MarcaDTO
	* @generated
	*/
	public List<MarcaDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @param id identificador del elemento Marca
	* @return Marca del id dado
	* @generated
	*/
	public MarcaDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * almacena la informacion de Marca
	 * @param dto Marca a guardar
	 * @return Marca con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public MarcaDTO guardar(MarcaDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Marca con el identificador dado
	 * @param id identificador del Marca
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de Marca
	 * @param dto Marca a guardar
	 * @return Marca con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(MarcaDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	public Marca convertirDTO(MarcaDTO dto){
		if(dto==null)return null;
		Marca entidad=new Marca();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
		
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public List<Marca> convertirDTO(List<MarcaDTO> dtos){
		List<Marca> entidades=new ArrayList<Marca>();
		for(MarcaDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	public MarcaDTO convertirEntidad(Marca entidad){
		MarcaDTO dto=new MarcaDTO();
		dto.setId(entidad.getId());
			dto.setNombre(entidad.getNombre());
		
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	public List<MarcaDTO> convertirEntidad(List<Marca> entidades){
		List<MarcaDTO> dtos=new ArrayList<MarcaDTO>();
		for(Marca entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
