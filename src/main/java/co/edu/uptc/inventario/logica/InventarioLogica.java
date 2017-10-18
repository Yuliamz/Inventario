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
public class InventarioLogica {
	@EJB
    private InventarioDAO persistencia;


	
	/**
	* retorna una lista con los Inventario que se encuentran en la base de datos
	* @return retorna una lista de InventarioDTO
	* @generated
	*/
	public List<InventarioDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @param id identificador del elemento Inventario
	* @return Inventario del id dado
	* @generated
	*/
	public InventarioDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * almacena la informacion de Inventario
	 * @param dto Inventario a guardar
	 * @return Inventario con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public InventarioDTO guardar(InventarioDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Inventario con el identificador dado
	 * @param id identificador del Inventario
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de Inventario
	 * @param dto Inventario a guardar
	 * @return Inventario con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(InventarioDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	public Inventario convertirDTO(InventarioDTO dto){
		if(dto==null)return null;
		Inventario entidad=new Inventario();
		entidad.setId(dto.getId());
			entidad.setCantidadExistencia(dto.getCantidadExistencia());
			entidad.setValorUnitarioExistencia(dto.getValorUnitarioExistencia());
			entidad.setValorTotalExistencia(dto.getValorTotalExistencia());
		
			if(dto.getProducto()!=null){
				entidad.setProducto(new Producto());
				entidad.getProducto().setId(dto.getProducto().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public List<Inventario> convertirDTO(List<InventarioDTO> dtos){
		List<Inventario> entidades=new ArrayList<Inventario>();
		for(InventarioDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	public InventarioDTO convertirEntidad(Inventario entidad){
		InventarioDTO dto=new InventarioDTO();
		dto.setId(entidad.getId());
			dto.setCantidadExistencia(entidad.getCantidadExistencia());
			dto.setValorUnitarioExistencia(entidad.getValorUnitarioExistencia());
			dto.setValorTotalExistencia(entidad.getValorTotalExistencia());
		
			if(entidad.getProducto()!=null){
				dto.setProducto(
					new ProductoDTO(
						entidad.getProducto().getId()));
			}
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	public List<InventarioDTO> convertirEntidad(List<Inventario> entidades){
		List<InventarioDTO> dtos=new ArrayList<InventarioDTO>();
		for(Inventario entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
