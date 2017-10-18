package co.edu.uptc.inventario.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author daperador
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DetalleFacturaDTO {

    public DetalleFacturaDTO(){
        //constructor base
    }
    
    public DetalleFacturaDTO(Long id){
        this.id=id;
    }

	private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	
    
    /**
    * @generated
    */
    private Integer cantidad;
    
    /**
    * @generated
    */
    private Double precioUnidad;
    
    /**
    * @generated
    */
    private Double descuento;
    
    
    /**
    * @generated
    */
    private ProductoDTO producto;
    
    /**
    * @generated
    */
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    /**
    * @generated
    */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    /**
    * @generated
    */
    public Double getPrecioUnidad() {
        return this.precioUnidad;
    }
    
    /**
    * @generated
    */
    public void setPrecioUnidad(Double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }
    /**
    * @generated
    */
    public Double getDescuento() {
        return this.descuento;
    }
    
    /**
    * @generated
    */
    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }
    
	/**
	* @generated
	*/
	public ProductoDTO getProducto() {
	    return this.producto;
	}
	
	/**
	* @generated
	*/
	public void setProducto(ProductoDTO producto) {
	    this.producto = producto;
	}
	
}
