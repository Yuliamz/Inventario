package co.edu.uptc.inventario.persistencia.entity;


import java.util.Date;
import javax.persistence.*;

/**
  *  @generated
  *  @author daperador
  */
@Entity
@Table(name="InventarioDetalle")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="InventarioDetalle.obtenerTodos", query="select e from InventarioDetalle e")
})
public class InventarioDetalle {

	@Id
    //@Column(name = "InventarioDetalle_id")
    @GeneratedValue(generator = "InventarioDetalleGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "InventarioDetalleGen", sequenceName = "InventarioDetalle_SEQ",allocationSize = 1)
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
    //@Column(name = "fecha")
    private Date fecha;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "cantidadEntrada")
    private Integer cantidadEntrada;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "valorUnitarioEntrada")
    private Double valorUnitarioEntrada;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "valorTotalEntrada")
    private Double valorTotalEntrada;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "cantidadSalida")
    private Integer cantidadSalida;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "valorUnitarioSalida")
    private Double valorUnitarioSalida;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "valorTotalSalida")
    private Double valorTotalSalida;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "cantidadExistencia")
    private Integer cantidadExistencia;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "valorUnitarioExistencia")
    private Double valorUnitarioExistencia;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "valorTotalExistencia")
    private Double valorTotalExistencia;
    
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Producto producto;
    
    
    /**
    * @generated
    */
    public Date getFecha() {
        return this.fecha;
    }
    
    /**
    * @generated
    */
    public void setFecha(Date fecha) {
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
	public Producto getProducto() {
	    return this.producto;
	}
	
	/**
	* @generated
	*/
	public void setProducto(Producto producto) {
	    this.producto = producto;
	}
	
}
