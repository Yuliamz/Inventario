package co.edu.uptc.inventario.persistencia.entity;


import javax.persistence.*;

/**
  *  @generated
  *  @author daperador
  */
@Entity
@Table(name="Tienda")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Tienda.obtenerTodos", query="select e from Tienda e")
})
public class Tienda {

	@Id
    //@Column(name = "Tienda_id")
    @GeneratedValue(generator = "TiendaGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "TiendaGen", sequenceName = "Tienda_SEQ",allocationSize = 1)
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
