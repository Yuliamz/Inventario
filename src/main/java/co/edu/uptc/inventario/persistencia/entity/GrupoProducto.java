package co.edu.uptc.inventario.persistencia.entity;


import javax.persistence.*;

/**
  *  @generated
  *  @author daperador
  */
@Entity
@Table(name="GrupoProducto")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="GrupoProducto.obtenerTodos", query="select e from GrupoProducto e")
})
public class GrupoProducto {

	@Id
    //@Column(name = "GrupoProducto_id")
    @GeneratedValue(generator = "GrupoProductoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "GrupoProductoGen", sequenceName = "GrupoProducto_SEQ",allocationSize = 1)
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
    
	
}
