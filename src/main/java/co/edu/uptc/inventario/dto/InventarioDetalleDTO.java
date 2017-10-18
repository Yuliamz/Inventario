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
public class InventarioDetalleDTO {

    public InventarioDetalleDTO(){
        //constructor base
    }
    
    public InventarioDetalleDTO(Long id){
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
    private String fecha;
    
    /**
    * @generated
    */
    private Integer cantidadEntrada;
    
    /**
    * @generated
    */
    private Double valorUnitarioEntrada;
    
    /**
    * @generated
    */
    private Double valorTotalEntrada;
    
    /**
    * @generated
    */
    private Integer cantidadSalida;
    
    /**
    * @generated
    */
    private Double valorUnitarioSalida;
    
    /**
    * @generated
    */
    private Double valorTotalSalida;
    
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
    public String getFecha() {
        return this.fecha;
    }
    
    /**
    * @generated
    */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    /**
    * @generated
    */
    public Integer getCantidadEntrada() {
        return this.cantidadEntrada;
    }
    
    /**
    * @generated
    */
    public void setCantidadEntrada(Integer cantidadEntrada) {
        this.cantidadEntrada = cantidadEntrada;
    }
    /**
    * @generated
    */
    public Double getValorUnitarioEntrada() {
        return this.valorUnitarioEntrada;
    }
    
    /**
    * @generated
    */
    public void setValorUnitarioEntrada(Double valorUnitarioEntrada) {
        this.valorUnitarioEntrada = valorUnitarioEntrada;
    }
    /**
    * @generated
    */
    public Double getValorTotalEntrada() {
        return this.valorTotalEntrada;
    }
    
    /**
    * @generated
    */
    public void setValorTotalEntrada(Double valorTotalEntrada) {
        this.valorTotalEntrada = valorTotalEntrada;
    }
    /**
    * @generated
    */
    public Integer getCantidadSalida() {
        return this.cantidadSalida;
    }
    
    /**
    * @generated
    */
    public void setCantidadSalida(Integer cantidadSalida) {
        this.cantidadSalida = cantidadSalida;
    }
    /**
    * @generated
    */
    public Double getValorUnitarioSalida() {
        return this.valorUnitarioSalida;
    }
    
    /**
    * @generated
    */
    public void setValorUnitarioSalida(Double valorUnitarioSalida) {
        this.valorUnitarioSalida = valorUnitarioSalida;
    }
    /**
    * @generated
    */
    public Double getValorTotalSalida() {
        return this.valorTotalSalida;
    }
    
    /**
    * @generated
    */
    public void setValorTotalSalida(Double valorTotalSalida) {
        this.valorTotalSalida = valorTotalSalida;
    }
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
