package co.edu.uptc.inventario.persistencia.entity;


import javax.persistence.*;

/**
  *  @generated
  *  @author daperador
  */
@Entity
@Table(name="Marca")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Marca.obtenerTodos", query="select e from Marca e")
})
public class Marca {

	@Id
    //@Column(name = "Marca_id")
    @GeneratedValue(generator = "MarcaGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "MarcaGen", sequenceName = "Marca_SEQ",allocationSize = 1)
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
