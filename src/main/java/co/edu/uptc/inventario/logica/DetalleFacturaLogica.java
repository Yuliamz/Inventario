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
public class DetalleFacturaLogica {
	@EJB
    private DetalleFacturaDAO persistencia;


	
	/**
	* retorna una lista con los DetalleFactura que se encuentran en la base de datos
	* @return retorna una lista de DetalleFacturaDTO
	* @generated
	*/
	public List<DetalleFacturaDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @param id identificador del elemento DetalleFactura
	* @return DetalleFactura del id dado
	* @generated
	*/
	public DetalleFacturaDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * almacena la informacion de DetalleFactura
	 * @param dto DetalleFactura a guardar
	 * @return DetalleFactura con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public DetalleFacturaDTO guardar(DetalleFacturaDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro DetalleFactura con el identificador dado
	 * @param id identificador del DetalleFactura
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de DetalleFactura
	 * @param dto DetalleFactura a guardar
	 * @return DetalleFactura con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(DetalleFacturaDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	public DetalleFactura convertirDTO(DetalleFacturaDTO dto){
		if(dto==null)return null;
		DetalleFactura entidad=new DetalleFactura();
		entidad.setId(dto.getId());
			entidad.setCantidad(dto.getCantidad());
			entidad.setPrecioUnidad(dto.getPrecioUnidad());
			entidad.setDescuento(dto.getDescuento());
		
			if(dto.getProducto()!=null){
				entidad.setProducto(new Producto());
				entidad.getProducto().setId(dto.getProducto().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public List<DetalleFactura> convertirDTO(List<DetalleFacturaDTO> dtos){
		List<DetalleFactura> entidades=new ArrayList<DetalleFactura>();
		for(DetalleFacturaDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	public DetalleFacturaDTO convertirEntidad(DetalleFactura entidad){
		DetalleFacturaDTO dto=new DetalleFacturaDTO();
		dto.setId(entidad.getId());
			dto.setCantidad(entidad.getCantidad());
			dto.setPrecioUnidad(entidad.getPrecioUnidad());
			dto.setDescuento(entidad.getDescuento());
		
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
	public List<DetalleFacturaDTO> convertirEntidad(List<DetalleFactura> entidades){
		List<DetalleFacturaDTO> dtos=new ArrayList<DetalleFacturaDTO>();
		for(DetalleFactura entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
