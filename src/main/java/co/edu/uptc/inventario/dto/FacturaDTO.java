package co.edu.uptc.inventario.dto;

import co.edu.uptc.inventario.persistencia.entity.TipoFactura;
import co.edu.uptc.inventario.persistencia.entity.EstadoFactura;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
  * @generated
  *  @author daperador
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacturaDTO {

    public FacturaDTO(){
        //constructor base
    }
    
    public FacturaDTO(Long id){
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
    private String fechaVencimiento;
    
    /**
    * @generated
    */
    private String fechaEmision;
    
    /**
    * @generated
    */
    private String numero;
    
    /**
    * @generated
    */
    private Double precioTotal;
    
    /**
    * @generated
    */
    private EstadoFactura estado;
    
    /**
    * @generated
    */
    private Double descuento;
    
    /**
    * @generated
    */
    private TipoFactura tipo;
    
    /**
    * @generated
    */
    private Double iva;
    
    /**
    * @generated
    */
    private String ordenCompra;
    
    /**
    * @generated
    */
    private String remision;
    
    /**
    * @generated
    */
    private Double saldo;
    
    
    /**
    * @generated
    */
    private PersonaDTO persona;
    
    /**
    * @generated
    */
    private TipoPagoDTO tipoPago;
    
    
    
    /**
    * @generated
    */
    /*private List<DetalleFacturaDTO> detalleFactura;
    
    public List<DetalleFacturaDTO> getDetalleFactura(){
    	if(this.detalleFactura==null){
    		detalleFactura=new ArrayList<DetalleFacturaDTO>();
    	}
    	return detalleFactura;
    }
    
    public void setDetalleFactura(List<DetalleFacturaDTO> detalleFactura){
    	this.detalleFactura=detalleFactura;
    }
    */
    
    /**
    * @generated
    */
    public String getFechaVencimiento() {
        return this.fechaVencimiento;
    }
    
    /**
    * @generated
    */
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    /**
    * @generated
    */
    public String getFechaEmision() {
        return this.fechaEmision;
    }
    
    /**
    * @generated
    */
    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    /**
    * @generated
    */
    public String getNumero() {
        return this.numero;
    }
    
    /**
    * @generated
    */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    /**
    * @generated
    */
    public Double getPrecioTotal() {
        return this.precioTotal;
    }
    
    /**
    * @generated
    */
    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }
    /**
    * @generated
    */
    public EstadoFactura getEstado() {
        return this.estado;
    }
    
    /**
    * @generated
    */
    public void setEstado(EstadoFactura estado) {
        this.estado = estado;
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
    public TipoFactura getTipo() {
        return this.tipo;
    }
    
    /**
    * @generated
    */
    public void setTipo(TipoFactura tipo) {
        this.tipo = tipo;
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
    public String getOrdenCompra() {
        return this.ordenCompra;
    }
    
    /**
    * @generated
    */
    public void setOrdenCompra(String ordenCompra) {
        this.ordenCompra = ordenCompra;
    }
    /**
    * @generated
    */
    public String getRemision() {
        return this.remision;
    }
    
    /**
    * @generated
    */
    public void setRemision(String remision) {
        this.remision = remision;
    }
    /**
    * @generated
    */
    public Double getSaldo() {
        return this.saldo;
    }
    
    /**
    * @generated
    */
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
	/**
	* @generated
	*/
	public PersonaDTO getPersona() {
	    return this.persona;
	}
	
	/**
	* @generated
	*/
	public void setPersona(PersonaDTO persona) {
	    this.persona = persona;
	}
	/**
	* @generated
	*/
	public TipoPagoDTO getTipoPago() {
	    return this.tipoPago;
	}
	
	/**
	* @generated
	*/
	public void setTipoPago(TipoPagoDTO tipoPago) {
	    this.tipoPago = tipoPago;
	}
	
}
