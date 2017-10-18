package co.edu.uptc.inventario.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author daperador
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductoDTO {

    public ProductoDTO(){
        //constructor base
    }
    
    public ProductoDTO(Long id){
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
    private String nombre;
    
    /**
    * @generated
    */
    private String descripcion;
    
    /**
    * @generated
    */
    private String codigo;
    
    
    /**
    * @generated
    */
    private TipoProductoDTO tipoProducto;
    
    /**
    * @generated
    */
    private TiendaDTO tienda;
    
    /**
    * @generated
    */
    private MarcaDTO marca;
    
    /**
    * @generated
    */
    private TarifaDTO tarifa;
    
    /**
    * @generated
    */
    private UnidadMedidaDTO unidadMedida;
    
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
	public UnidadMedidaDTO getUnidadMedida() {
	    return this.unidadMedida;
	}
	
	/**
	* @generated
	*/
	public void setUnidadMedida(UnidadMedidaDTO unidadMedida) {
	    this.unidadMedida = unidadMedida;
	}
	/**
	* @generated
	*/
	public MarcaDTO getMarca() {
	    return this.marca;
	}
	
	/**
	* @generated
	*/
	public void setMarca(MarcaDTO marca) {
	    this.marca = marca;
	}
	/**
	* @generated
	*/
	public TiendaDTO getTienda() {
	    return this.tienda;
	}
	
	/**
	* @generated
	*/
	public void setTienda(TiendaDTO tienda) {
	    this.tienda = tienda;
	}
	/**
	* @generated
	*/
	public TarifaDTO getTarifa() {
	    return this.tarifa;
	}
	
	/**
	* @generated
	*/
	public void setTarifa(TarifaDTO tarifa) {
	    this.tarifa = tarifa;
	}
	/**
	* @generated
	*/
	public TipoProductoDTO getTipoProducto() {
	    return this.tipoProducto;
	}
	
	/**
	* @generated
	*/
	public void setTipoProducto(TipoProductoDTO tipoProducto) {
	    this.tipoProducto = tipoProducto;
	}
	
}
