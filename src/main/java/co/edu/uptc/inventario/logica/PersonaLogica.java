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
public class PersonaLogica {
	@EJB
    private PersonaDAO persistencia;


	
	/**
	* retorna una lista con los Persona que se encuentran en la base de datos
	* @return retorna una lista de PersonaDTO
	* @generated
	*/
	public List<PersonaDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @param id identificador del elemento Persona
	* @return Persona del id dado
	* @generated
	*/
	public PersonaDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * almacena la informacion de Persona
	 * @param dto Persona a guardar
	 * @return Persona con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public PersonaDTO guardar(PersonaDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Persona con el identificador dado
	 * @param id identificador del Persona
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de Persona
	 * @param dto Persona a guardar
	 * @return Persona con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(PersonaDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	public Persona convertirDTO(PersonaDTO dto){
		if(dto==null)return null;
		Persona entidad=new Persona();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
			entidad.setApellido(dto.getApellido());
			entidad.setRazonSocial(dto.getRazonSocial());
			entidad.setTelefono(dto.getTelefono());
			entidad.setDireccion(dto.getDireccion());
			entidad.setDocumento(dto.getDocumento());
		
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public List<Persona> convertirDTO(List<PersonaDTO> dtos){
		List<Persona> entidades=new ArrayList<Persona>();
		for(PersonaDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	public PersonaDTO convertirEntidad(Persona entidad){
		PersonaDTO dto=new PersonaDTO();
		dto.setId(entidad.getId());
			dto.setNombre(entidad.getNombre());
			dto.setApellido(entidad.getApellido());
			dto.setRazonSocial(entidad.getRazonSocial());
			dto.setTelefono(entidad.getTelefono());
			dto.setDireccion(entidad.getDireccion());
			dto.setDocumento(entidad.getDocumento());
		
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	public List<PersonaDTO> convertirEntidad(List<Persona> entidades){
		List<PersonaDTO> dtos=new ArrayList<PersonaDTO>();
		for(Persona entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
