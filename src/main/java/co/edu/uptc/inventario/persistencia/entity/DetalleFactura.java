package co.edu.uptc.inventario.persistencia.entity;


import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;

/**
  *  @generated
  *  @author daperador
  */
@Entity
@Table(name="DetalleFactura")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="DetalleFactura.obtenerTodos", query="select e from DetalleFactura e")
})
public class DetalleFactura {

	@Id
    //@Column(name = "DetalleFactura_id")
    @GeneratedValue(generator = "DetalleFacturaGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "DetalleFacturaGen", sequenceName = "DetalleFactura_SEQ",allocationSize = 1)
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
    
    //@Column(name = "cantidad")
    private Integer cantidad;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "precioUnidad")
    private Double precioUnidad;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "descuento")
    private Double descuento;
    
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Producto producto;
    
    
    /**
    * @generated
    */
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    /**
    * @generated
    */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    /**
    * @generated
    */
    public Double getPrecioUnidad() {
        return this.precioUnidad;
    }
    
    /**
    * @generated
    */
    public void setPrecioUnidad(Double precioUnidad) {
        this.precioUnidad = precioUnidad;
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
