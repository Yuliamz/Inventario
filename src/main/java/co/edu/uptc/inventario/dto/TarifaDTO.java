package co.edu.uptc.inventario.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
  * @generated
  *  @author daperador
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TarifaDTO {

    public TarifaDTO(){
        //constructor base
    }
    
    public TarifaDTO(Long id){
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
    private String fechaInicio;
    
    /**
    * @generated
    */
    private String fechaFinal;
    
    /**
    * @generated
    */
    private Double valor;
    
    /**
    * @generated
    */
    private Double iva;
    
    
    /**
    * @generated
    */
    private ProductoDTO producto;
    
    /**
    * @generated
    */
    public String getFechaInicio() {
        return this.fechaInicio;
    }
    
    /**
    * @generated
    */
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    /**
    * @generated
    */
    public String getFechaFinal() {
        return this.fechaFinal;
    }
    
    /**
    * @generated
    */
    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    /**
    * @generated
    */
    public Double getValor() {
        return this.valor;
    }
    
    /**
    * @generated
    */
    public void setValor(Double valor) {
        this.valor = valor;
    }
    /**
    * @generated
    */
    public Double getIva() {
        return this.iva;
    }
    
    /**
    * @generated
    */
    public void setIva(Double iva) {
        this.iva = iva;
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
