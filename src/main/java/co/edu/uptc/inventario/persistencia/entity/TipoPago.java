package co.edu.uptc.inventario.persistencia.entity;


import javax.persistence.*;

/**
  *  @generated
  *  @author daperador
  */
@Entity
@Table(name="TipoPago")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="TipoPago.obtenerTodos", query="select e from TipoPago e")
})
public class TipoPago {

	@Id
    //@Column(name = "TipoPago_id")
    @GeneratedValue(generator = "TipoPagoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "TipoPagoGen", sequenceName = "TipoPago_SEQ",allocationSize = 1)
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
    
    //@Column(name = "efectivo")
    private Double efectivo;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "tarjeta")
    private Double tarjeta;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "cheque")
    private Double cheque;
    
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private OpcionesCredito opcionesCredito;
    
    
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
	public OpcionesCredito getOpcionesCredito() {
	    return this.opcionesCredito;
	}
	
	/**
	* @generated
	*/
	public void setOpcionesCredito(OpcionesCredito opcionesCredito) {
	    this.opcionesCredito = opcionesCredito;
	}
	
}
