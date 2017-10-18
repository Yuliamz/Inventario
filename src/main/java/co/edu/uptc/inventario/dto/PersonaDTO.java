package co.edu.uptc.inventario.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author daperador
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonaDTO {

    public PersonaDTO(){
        //constructor base
    }
    
    public PersonaDTO(Long id){
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
    private String apellido;
    
    /**
    * @generated
    */
    private String razonSocial;
    
    /**
    * @generated
    */
    private String telefono;
    
    /**
    * @generated
    */
    private String direccion;
    
    /**
    * @generated
    */
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
