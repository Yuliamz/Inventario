package co.edu.uptc.inventario.persistencia.entity;


import javax.persistence.*;

/**
  *  @generated
  *  @author daperador
  */
@Entity
@Table(name="Persona")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Persona.obtenerTodos", query="select e from Persona e")
})
public class Persona {

	@Id
    //@Column(name = "Persona_id")
    @GeneratedValue(generator = "PersonaGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "PersonaGen", sequenceName = "Persona_SEQ",allocationSize = 1)
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
    
    //@Column(name = "apellido")
    private String apellido;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "razonSocial")
    private String razonSocial;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "telefono")
    private String telefono;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "direccion")
    private String direccion;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "documento")
    private String documento;
    
    
    
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
    public String getApellido() {
        return this.apellido;
    }
    
    /**
    * @generated
    */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    /**
    * @generated
    */
    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    /**
    * @generated
    */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
    /**
    * @generated
    */
    public String getTelefono() {
        return this.telefono;
    }
    
    /**
    * @generated
    */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    /**
    * @generated
    */
    public String getDireccion() {
        return this.direccion;
    }
    
    /**
    * @generated
    */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    /**
    * @generated
    */
    public String getDocumento() {
        return this.documento;
    }
    
    /**
    * @generated
    */
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
	
}
