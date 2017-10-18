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
public class FacturaLogica {
	@EJB
    private FacturaDAO persistencia;

	private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

	
	/**
	* retorna una lista con los Factura que se encuentran en la base de datos
	* @return retorna una lista de FacturaDTO
	* @generated
	*/
	public List<FacturaDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @param id identificador del elemento Factura
	* @return Factura del id dado
	* @generated
	*/
	public FacturaDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * almacena la informacion de Factura
	 * @param dto Factura a guardar
	 * @return Factura con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public FacturaDTO guardar(FacturaDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Factura con el identificador dado
	 * @param id identificador del Factura
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de Factura
	 * @param dto Factura a guardar
	 * @return Factura con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(FacturaDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	public Factura convertirDTO(FacturaDTO dto){
		if(dto==null)return null;
		Factura entidad=new Factura();
		entidad.setId(dto.getId());
			if(dto.getFechaVencimiento()!=null){
				try {
					entidad.setFechaVencimiento(fecha.parse(dto.getFechaVencimiento()));
				} catch (ParseException ex) {
		            throw new RuntimeException("Error al convertir la fecha FechaVencimiento " + dto.getFechaVencimiento());
		        }
			}
			if(dto.getFechaEmision()!=null){
				try {
					entidad.setFechaEmision(fecha.parse(dto.getFechaEmision()));
				} catch (ParseException ex) {
		            throw new RuntimeException("Error al convertir la fecha FechaEmision " + dto.getFechaEmision());
		        }
			}
			entidad.setNumero(dto.getNumero());
			entidad.setPrecioTotal(dto.getPrecioTotal());
			entidad.setEstado(dto.getEstado());
			entidad.setDescuento(dto.getDescuento());
			entidad.setTipo(dto.getTipo());
			entidad.setIva(dto.getIva());
			entidad.setOrdenCompra(dto.getOrdenCompra());
			entidad.setRemision(dto.getRemision());
			entidad.setSaldo(dto.getSaldo());
		
			if(dto.getPersona()!=null){
				entidad.setPersona(new Persona());
				entidad.getPersona().setId(dto.getPersona().getId());
			}
			if(dto.getTipoPago()!=null){
				entidad.setTipoPago(new TipoPago());
				entidad.getTipoPago().setId(dto.getTipoPago().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public List<Factura> convertirDTO(List<FacturaDTO> dtos){
		List<Factura> entidades=new ArrayList<Factura>();
		for(FacturaDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	public FacturaDTO convertirEntidad(Factura entidad){
		FacturaDTO dto=new FacturaDTO();
		dto.setId(entidad.getId());
			if(entidad.getFechaVencimiento()!=null){
				dto.setFechaVencimiento(fecha.format(entidad.getFechaVencimiento()));
			}
			if(entidad.getFechaEmision()!=null){
				dto.setFechaEmision(fecha.format(entidad.getFechaEmision()));
			}
			dto.setNumero(entidad.getNumero());
			dto.setPrecioTotal(entidad.getPrecioTotal());
			dto.setEstado(entidad.getEstado());
			dto.setDescuento(entidad.getDescuento());
			dto.setTipo(entidad.getTipo());
			dto.setIva(entidad.getIva());
			dto.setOrdenCompra(entidad.getOrdenCompra());
			dto.setRemision(entidad.getRemision());
			dto.setSaldo(entidad.getSaldo());
		
			if(entidad.getTipoPago()!=null){
				dto.setTipoPago(
					new TipoPagoDTO(
						entidad.getTipoPago().getId()));
			}
			if(entidad.getPersona()!=null){
				dto.setPersona(
					new PersonaDTO(
						entidad.getPersona().getId()));
			}
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	public List<FacturaDTO> convertirEntidad(List<Factura> entidades){
		List<FacturaDTO> dtos=new ArrayList<FacturaDTO>();
		for(Factura entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
