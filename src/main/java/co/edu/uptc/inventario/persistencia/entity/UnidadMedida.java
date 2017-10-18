package co.edu.uptc.inventario.persistencia.entity;


import javax.persistence.*;

/**
  *  @generated
  *  @author daperador
  */
@Entity
@Table(name="UnidadMedida")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="UnidadMedida.obtenerTodos", query="select e from UnidadMedida e")
})
public class UnidadMedida {

	@Id
    //@Column(name = "UnidadMedida_id")
    @GeneratedValue(generator = "UnidadMedidaGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "UnidadMedidaGen", sequenceName = "UnidadMedida_SEQ",allocationSize = 1)
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
    
    //@Column(name = "abreviatura")
    private String abreviatura;
    
    
    
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
    public String getAbreviatura() {
        return this.abreviatura;
    }
    
    /**
    * @generated
    */
    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }
    
	
}
