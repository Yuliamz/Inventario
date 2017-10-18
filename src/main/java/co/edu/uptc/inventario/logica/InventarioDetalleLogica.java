package co.edu.uptc.inventario.logica;

import co.edu.uptc.inventario.dto.*;
import co.edu.uptc.inventario.persistencia.*;
import co.edu.uptc.inventario.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
  *  @generated
  *  @author daperador
  */
@Stateless
public class InventarioDetalleLogica {
	@EJB
    private InventarioDetalleDAO persistencia;

	private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

	
	/**
	* retorna una lista con los InventarioDetalle que se encuentran en la base de datos
	* @return retorna una lista de InventarioDetalleDTO
	* @generated
	*/
	public List<InventarioDetalleDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @param id identificador del elemento InventarioDetalle
	* @return InventarioDetalle del id dado
	* @generated
	*/
	public InventarioDetalleDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * almacena la informacion de InventarioDetalle
	 * @param dto InventarioDetalle a guardar
	 * @return InventarioDetalle con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public InventarioDetalleDTO guardar(InventarioDetalleDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro InventarioDetalle con el identificador dado
	 * @param id identificador del InventarioDetalle
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de InventarioDetalle
	 * @param dto InventarioDetalle a guardar
	 * @return InventarioDetalle con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(InventarioDetalleDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	public InventarioDetalle convertirDTO(InventarioDetalleDTO dto){
		if(dto==null)return null;
		InventarioDetalle entidad=new InventarioDetalle();
		entidad.setId(dto.getId());
			if(dto.getFecha()!=null){
				try {
					entidad.setFecha(fecha.parse(dto.getFecha()));
				} catch (ParseException ex) {
		            throw new RuntimeException("Error al convertir la fecha Fecha " + dto.getFecha());
		        }
			}
			entidad.setCantidadEntrada(dto.getCantidadEntrada());
			entidad.setValorUnitarioEntrada(dto.getValorUnitarioEntrada());
			entidad.setValorTotalEntrada(dto.getValorTotalEntrada());
			entidad.setCantidadSalida(dto.getCantidadSalida());
			entidad.setValorUnitarioSalida(dto.getValorUnitarioSalida());
			entidad.setValorTotalSalida(dto.getValorTotalSalida());
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
	public List<InventarioDetalle> convertirDTO(List<InventarioDetalleDTO> dtos){
		List<InventarioDetalle> entidades=new ArrayList<InventarioDetalle>();
		for(InventarioDetalleDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	public InventarioDetalleDTO convertirEntidad(InventarioDetalle entidad){
		InventarioDetalleDTO dto=new InventarioDetalleDTO();
		dto.setId(entidad.getId());
			if(entidad.getFecha()!=null){
				dto.setFecha(fecha.format(entidad.getFecha()));
			}
			dto.setCantidadEntrada(entidad.getCantidadEntrada());
			dto.setValorUnitarioEntrada(entidad.getValorUnitarioEntrada());
			dto.setValorTotalEntrada(entidad.getValorTotalEntrada());
			dto.setCantidadSalida(entidad.getCantidadSalida());
			dto.setValorUnitarioSalida(entidad.getValorUnitarioSalida());
			dto.setValorTotalSalida(entidad.getValorTotalSalida());
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
	public List<InventarioDetalleDTO> convertirEntidad(List<InventarioDetalle> entidades){
		List<InventarioDetalleDTO> dtos=new ArrayList<InventarioDetalleDTO>();
		for(InventarioDetalle entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
