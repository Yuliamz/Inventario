package co.edu.uptc.inventario.persistencia.entity;


import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.*;

/**
  *  @generated
  *  @author daperador
  */
@Entity
@Table(name="Factura")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Factura.obtenerTodos", query="select e from Factura e")
})
public class Factura {

	@Id
    //@Column(name = "Factura_id")
    @GeneratedValue(generator = "FacturaGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "FacturaGen", sequenceName = "Factura_SEQ",allocationSize = 1)
	private Long id;

	public Long getId(){
		return this.id;
	}

	public void setId(Long id){
		this.id=id;
	}
    
    /**
    * @generated
    * 1-1-false
    */
    @Temporal(TemporalType.DATE)
    //@Column(name = "fechaVencimiento")
    private Date fechaVencimiento;
    
    /**
    * @generated
    * 1-1-false
    */
    @Temporal(TemporalType.DATE)
    //@Column(name = "fechaEmision")
    private Date fechaEmision;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "numero")
    private String numero;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "precioTotal")
    private Double precioTotal;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "estado")
    private EstadoFactura estado;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "descuento")
    private Double descuento;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "tipo")
    private TipoFactura tipo;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "iva")
    private Double iva;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "ordenCompra")
    private String ordenCompra;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "remision")
    private String remision;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "saldo")
    private Double saldo;
    
    
    /**
    * @generated
    * 1--1-true 
    */
    //@OneToMany(cascade={},fetch=javax.persistence.FetchType.LAZY)
    //private List<DetalleFactura> detalleFactura;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private TipoPago tipoPago;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Persona persona;
    
    
    /**
    * @generated
    */
    public Date getFechaVencimiento() {
        return this.fechaVencimiento;
    }
    
    /**
    * @generated
    */
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    /**
    * @generated
    */
    public Date getFechaEmision() {
        return this.fechaEmision;
    }
    
    /**
    * @generated
    */
    public void setFechaEmision(Date fechaEmision) {
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
	public TipoPago getTipoPago() {
	    return this.tipoPago;
	}
	
	/**
	* @generated
	*/
	public void setTipoPago(TipoPago tipoPago) {
	    this.tipoPago = tipoPago;
	}
	
	/*public List<DetalleFactura> getDetalleFactura(){
		if(detalleFactura!=null){
			detalleFactura=new ArrayList<DetalleFactura>(); 
		}
		return this.detalleFactura;
	}
	
	public void setDetalleFactura(List<DetalleFactura> detalleFactura){
		this.detalleFactura=detalleFactura;
	}*/
	
	/**
	* @generated
	*/
	public Persona getPersona() {
	    return this.persona;
	}
	
	/**
	* @generated
	*/
	public void setPersona(Persona persona) {
	    this.persona = persona;
	}
	
}
