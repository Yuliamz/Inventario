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
public class TarifaLogica {
	@EJB
    private TarifaDAO persistencia;

	private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

	
	/**
	* retorna una lista con los Tarifa que se encuentran en la base de datos
	* @return retorna una lista de TarifaDTO
	* @generated
	*/
	public List<TarifaDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @param id identificador del elemento Tarifa
	* @return Tarifa del id dado
	* @generated
	*/
	public TarifaDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
        
	public TarifaDTO obtenerPorProducto(Long id){
		return convertirEntidad(persistencia.obtenerPorProducto(id));
	}
	
	
	/**
	 * almacena la informacion de Tarifa
	 * @param dto Tarifa a guardar
	 * @return Tarifa con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public TarifaDTO guardar(TarifaDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Tarifa con el identificador dado
	 * @param id identificador del Tarifa
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * actualiza la informacion de Tarifa
	 * @param dto Tarifa a guardar
	 * @return Tarifa con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public void actualizar(TarifaDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	public Tarifa convertirDTO(TarifaDTO dto){
		if(dto==null)return null;
		Tarifa entidad=new Tarifa();
		entidad.setId(dto.getId());
			if(dto.getFechaInicio()!=null){
				try {
					entidad.setFechaInicio(fecha.parse(dto.getFechaInicio()));
				} catch (ParseException ex) {
		            throw new RuntimeException("Error al convertir la fecha FechaInicio " + dto.getFechaInicio());
		        }
			}
			if(dto.getFechaFinal()!=null){
				try {
					entidad.setFechaFinal(fecha.parse(dto.getFechaFinal()));
				} catch (ParseException ex) {
		            throw new RuntimeException("Error al convertir la fecha FechaFinal " + dto.getFechaFinal());
		        }
			}
			entidad.setValor(dto.getValor());
			entidad.setIva(dto.getIva());
		
			if(dto.getProducto()!=null){
				entidad.setProducto(new Producto());
				entidad.getProducto().setId(dto.getProducto().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public List<Tarifa> convertirDTO(List<TarifaDTO> dtos){
		List<Tarifa> entidades=new ArrayList<Tarifa>();
		for(TarifaDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	public TarifaDTO convertirEntidad(Tarifa entidad){
		TarifaDTO dto=new TarifaDTO();
		dto.setId(entidad.getId());
			if(entidad.getFechaInicio()!=null){
				dto.setFechaInicio(fecha.format(entidad.getFechaInicio()));
			}
			if(entidad.getFechaFinal()!=null){
				dto.setFechaFinal(fecha.format(entidad.getFechaFinal()));
			}
			dto.setValor(entidad.getValor());
			dto.setIva(entidad.getIva());
		
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
	public List<TarifaDTO> convertirEntidad(List<Tarifa> entidades){
		List<TarifaDTO> dtos=new ArrayList<TarifaDTO>();
		for(Tarifa entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
