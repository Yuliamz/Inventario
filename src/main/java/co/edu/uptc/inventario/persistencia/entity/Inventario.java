package co.edu.uptc.inventario.persistencia.entity;


import javax.persistence.*;

/**
  *  @generated
  *  @author daperador
  */
@Entity
@Table(name="Inventario")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Inventario.obtenerTodos", query="select e from Inventario e")
})
public class Inventario {

	@Id
    //@Column(name = "Inventario_id")
    @GeneratedValue(generator = "InventarioGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "InventarioGen", sequenceName = "Inventario_SEQ",allocationSize = 1)
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
