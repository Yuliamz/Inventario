package co.edu.uptc.inventario.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author daperador
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TipoPagoDTO {

    public TipoPagoDTO(){
        //constructor base
    }
    
    public TipoPagoDTO(Long id){
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
    private Double efectivo;
    
    /**
    * @generated
    */
    private Double tarjeta;
    
    /**
    * @generated
    */
    private Double cheque;
    
    
    /**
    * @generated
    */
    private OpcionesCreditoDTO opcionesCredito;
    
    /**
    * @generated
    */
    public Double getEfectivo() {
        return this.efectivo;
    }
    
    /**
    * @generated
    */
    public void setEfectivo(Double efectivo) {
        this.efectivo = efectivo;
    }
    /**
    * @generated
    */
    public Double getTarjeta() {
        return this.tarjeta;
    }
    
    /**
    * @generated
    */
    public void setTarjeta(Double tarjeta) {
        this.tarjeta = tarjeta;
    }
    /**
    * @generated
    */
    public Double getCheque() {
        return this.cheque;
    }
    
    /**
    * @generated
    */
    public void setCheque(Double cheque) {
        this.cheque = cheque;
    }
    
	/**
	* @generated
	*/
	public OpcionesCreditoDTO getOpcionesCredito() {
	    return this.opcionesCredito;
	}
	
	/**
	* @generated
	*/
	public void setOpcionesCredito(OpcionesCreditoDTO opcionesCredito) {
	    this.opcionesCredito = opcionesCredito;
	}
	
}
