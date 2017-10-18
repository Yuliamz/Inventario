package co.edu.uptc.inventario.persistencia.entity;

import java.util.Date;
import javax.persistence.*;

/**
 * @generated @author daperador
 */
@Entity
@Table(name = "Tarifa")//, schema="${schema}")
@NamedQueries({
    @NamedQuery(name = "Tarifa.obtenerTodos", query = "select e from Tarifa e"),
    @NamedQuery(name = "Tarifa.obtenerPorProducto", query = "select e from Tarifa e where e.producto.id=:idProducto and (e.fechaFinal is null or current_date() between e.fechaInicio and e.fechaFinal) order by e.fechaInicio desc")
})
public class Tarifa {

    @Id
    //@Column(name = "Tarifa_id")
    @GeneratedValue(generator = "TarifaGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "TarifaGen", sequenceName = "Tarifa_SEQ", allocationSize = 1)
    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @generated 1-1-false
     */
    @Temporal(TemporalType.DATE)
    //@Column(name = "fechaInicio")
    private Date fechaInicio;

    /**
     * @generated 1-1-false
     */
    @Temporal(TemporalType.DATE)
    //@Column(name = "fechaFinal")
    private Date fechaFinal;

    /**
     * @generated 1-1-false
     */
    //@Column(name = "valor")
    private Double valor;

    /**
     * @generated 1-1-false
     */
    //@Column(name = "iva")
    private Double iva;

    /**
     * @generated 0-1-false
     */
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER)
    private Producto producto;

    /**
     * @generated
     */
    public Date getFechaInicio() {
        return this.fechaInicio;
    }

    /**
     * @generated
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @generated
     */
    public Date getFechaFinal() {
        return this.fechaFinal;
    }

    /**
     * @generated
     */
    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    /**
     * @generated
     */
    public Double getValor() {
        return this.valor;
    }

    /**
     * @generated
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }

    /**
     * @generated
     */
    public Double getIva() {
        return this.iva;
    }

    /**
     * @generated
     */
    public void setIva(Double iva) {
        this.iva = iva;
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
