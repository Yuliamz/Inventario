package co.edu.uptc.inventario.persistencia.entity;


import javax.persistence.*;

/**
  *  @generated
  *  @author daperador
  */
@Entity
@Table(name="TipoProducto")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="TipoProducto.obtenerTodos", query="select e from TipoProducto e")
})
public class TipoProducto {

	@Id
    //@Column(name = "TipoProducto_id")
    @GeneratedValue(generator = "TipoProductoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "TipoProductoGen", sequenceName = "TipoProducto_SEQ",allocationSize = 1)
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
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private GrupoProducto grupoProducto;
    
    
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
	public GrupoProducto getGrupoProducto() {
	    return this.grupoProducto;
	}
	
	/**
	* @generated
	*/
	public void setGrupoProducto(GrupoProducto grupoProducto) {
	    this.grupoProducto = grupoProducto;
	}
	
}
