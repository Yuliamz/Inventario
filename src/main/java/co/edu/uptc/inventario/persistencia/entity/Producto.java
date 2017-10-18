package co.edu.uptc.inventario.persistencia.entity;


import javax.persistence.*;

/**
  *  @generated
  *  @author daperador
  */
@Entity
@Table(name="Producto")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Producto.obtenerTodos", query="select e from Producto e")
})
public class Producto {

	@Id
    //@Column(name = "Producto_id")
    @GeneratedValue(generator = "ProductoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ProductoGen", sequenceName = "Producto_SEQ",allocationSize = 1)
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
    
    //@Column(name = "nombre")
    private String nombre;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "descripcion")
    private String descripcion;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "codigo")
    private String codigo;
    
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private TipoProducto tipoProducto;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private UnidadMedida unidadMedida;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Marca marca;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Tarifa tarifa;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Tienda tienda;
    
    
    /**
    * @generated
    */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
    * @generated
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
    * @generated
    */
    public String getDescripcion() {
        return this.descripcion;
    }
    
    /**
    * @generated
    */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
    * @generated
    */
    public String getCodigo() {
        return this.codigo;
    }
    
    /**
    * @generated
    */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
	
	/**
	* @generated
	*/
	public Marca getMarca() {
	    return this.marca;
	}
	
	/**
	* @generated
	*/
	public void setMarca(Marca marca) {
	    this.marca = marca;
	}
	
	/**
	* @generated
	*/
	public UnidadMedida getUnidadMedida() {
	    return this.unidadMedida;
	}
	
	/**
	* @generated
	*/
	public void setUnidadMedida(UnidadMedida unidadMedida) {
	    this.unidadMedida = unidadMedida;
	}
	
	/**
	* @generated
	*/
	public Tarifa getTarifa() {
	    return this.tarifa;
	}
	
	/**
	* @generated
	*/
	public void setTarifa(Tarifa tarifa) {
	    this.tarifa = tarifa;
	}
	
	/**
	* @generated
	*/
	public TipoProducto getTipoProducto() {
	    return this.tipoProducto;
	}
	
	/**
	* @generated
	*/
	public void setTipoProducto(TipoProducto tipoProducto) {
	    this.tipoProducto = tipoProducto;
	}
	
	/**
	* @generated
	*/
	public Tienda getTienda() {
	    return this.tienda;
	}
	
	/**
	* @generated
	*/
	public void setTienda(Tienda tienda) {
	    this.tienda = tienda;
	}
	
}
