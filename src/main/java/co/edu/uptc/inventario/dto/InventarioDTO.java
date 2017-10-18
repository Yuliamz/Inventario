package co.edu.uptc.inventario.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author daperador
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InventarioDTO {

    public InventarioDTO(){
        //constructor base
    }
    
    public InventarioDTO(Long id){
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
    private Integer cantidadExistencia;
    
    /**
    * @generated
    */
    private Double valorUnitarioExistencia;
    
    /**
    * @generated
    */
    private Double valorTotalExistencia;
    
    
    /**
    * @generated
    */
    private ProductoDTO producto;
    
    /**
    * @generated
    */
    public Integer getCantidadExistencia() {
        return this.cantidadExistencia;
    }
    
    /**
    * @generated
    */
    public void setCantidadExistencia(Integer cantidadExistencia) {
        this.cantidadExistencia = cantidadExistencia;
    }
    /**
    * @generated
    */
    public Double getValorUnitarioExistencia() {
        return this.valorUnitarioExistencia;
    }
    
    /**
    * @generated
    */
    public void setValorUnitarioExistencia(Double valorUnitarioExistencia) {
        this.valorUnitarioExistencia = valorUnitarioExistencia;
    }
    /**
    * @generated
    */
    public Double getValorTotalExistencia() {
        return this.valorTotalExistencia;
    }
    
    /**
    * @generated
    */
    public void setValorTotalExistencia(Double valorTotalExistencia) {
        this.valorTotalExistencia = valorTotalExistencia;
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
