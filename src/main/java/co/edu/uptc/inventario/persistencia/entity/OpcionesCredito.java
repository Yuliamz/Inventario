package co.edu.uptc.inventario.persistencia.entity;


import javax.persistence.*;

/**
  *  @generated
  *  @author daperador
  */
@Entity
@Table(name="OpcionesCredito")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="OpcionesCredito.obtenerTodos", query="select e from OpcionesCredito e")
})
public class OpcionesCredito {

	@Id
    //@Column(name = "OpcionesCredito_id")
    @GeneratedValue(generator = "OpcionesCreditoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "OpcionesCreditoGen", sequenceName = "OpcionesCredito_SEQ",allocationSize = 1)
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
    
    //@Column(name = "vigenciaDias")
    private Integer vigenciaDias;
    
    
    
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
    public Integer getVigenciaDias() {
        return this.vigenciaDias;
    }
    
    /**
    * @generated
    */
    public void setVigenciaDias(Integer vigenciaDias) {
        this.vigenciaDias = vigenciaDias;
    }
    
	
}
