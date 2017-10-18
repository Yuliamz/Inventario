package co.edu.uptc.inventario.logica;

import co.edu.uptc.inventario.dto.*;
import co.edu.uptc.inventario.persistencia.*;
import co.edu.uptc.inventario.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * @generated @author daperador
 */
@Stateless
public class ProductoLogica {

    @EJB
    private ProductoDAO persistencia;
    @EJB
    private MarcaLogica marcaLogica;
    @EJB
    private GrupoProductoLogica grupoProductoLogica;
    @EJB
    private TipoProductoLogica tipoProductoLogica;
    

    /**
     * retorna una lista con los Producto que se encuentran en la base de datos
     *
     * @return retorna una lista de ProductoDTO
     * @generated
     */
    public List<ProductoDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * @param id identificador del elemento Producto
     * @return Producto del id dado
     * @generated
     */
    public ProductoDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * almacena la informacion de Producto
     *
     * @param dto Producto a guardar
     * @return Producto con los cambios realizados por el proceso de guardar
     * @generated
     */
    public ProductoDTO guardar(ProductoDTO dto) {
        return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
    }

    /**
     * Elimina el registro Producto con el identificador dado
     *
     * @param id identificador del Producto
     * @generated
     */
    public void borrar(Long id) {
        persistencia.borrar(id);
    }

    /**
     * actualiza la informacion de Producto
     *
     * @param dto Producto a guardar
     * @return Producto con los cambios realizados por el proceso de guardar
     * @generated
     */
    public void actualizar(ProductoDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    /**
     * @generated
     */
    public Producto convertirDTO(ProductoDTO dto) {
        if (dto == null) {
            return null;
        }
        Producto entidad = new Producto();
        entidad.setId(dto.getId());
        entidad.setNombre(dto.getNombre());
        entidad.setDescripcion(dto.getDescripcion());
        entidad.setCodigo(dto.getCodigo());

        if (dto.getUnidadMedida() != null) {
            entidad.setUnidadMedida(new UnidadMedida());
            entidad.getUnidadMedida().setId(dto.getUnidadMedida().getId());
        }
        if (dto.getMarca() != null) {
            entidad.setMarca(new Marca());
            entidad.getMarca().setId(dto.getMarca().getId());
        }
        if (dto.getTarifa() != null) {
            entidad.setTarifa(new Tarifa());
            entidad.getTarifa().setId(dto.getTarifa().getId());
        }
        if (dto.getTienda() != null) {
            entidad.setTienda(new Tienda());
            entidad.getTienda().setId(dto.getTienda().getId());
        }
        if (dto.getTipoProducto() != null) {
            entidad.setTipoProducto(new TipoProducto());
            entidad.getTipoProducto().setId(dto.getTipoProducto().getId());
        }

        return entidad;
    }

    /**
     * @generated
     */
    public List<Producto> convertirDTO(List<ProductoDTO> dtos) {
        List<Producto> entidades = new ArrayList<Producto>();
        for (ProductoDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * @generated
     */
    public ProductoDTO convertirEntidad(Producto entidad) {
        ProductoDTO dto = new ProductoDTO();
        dto.setId(entidad.getId());
        dto.setNombre(entidad.getNombre());
        dto.setDescripcion(entidad.getDescripcion());
        dto.setCodigo(entidad.getCodigo());

        if (entidad.getTarifa() != null) {
            dto.setTarifa(
                    new TarifaDTO(
                            entidad.getTarifa().getId()));
        }
        if (entidad.getTienda() != null) {
            dto.setTienda(
                    new TiendaDTO(
                            entidad.getTienda().getId()));
        }
        if (entidad.getUnidadMedida() != null) {
            dto.setUnidadMedida(
                    new UnidadMedidaDTO(
                            entidad.getUnidadMedida().getId()));
        }
        if (entidad.getTipoProducto() != null) {
            dto.setTipoProducto(tipoProductoLogica.convertirEntidad(entidad.getTipoProducto()));
        }
        if (entidad.getMarca() != null) {
            dto.setMarca(marcaLogica.convertirEntidad(entidad.getMarca()));
        }

        return dto;
    }

    /**
     * @generated
     */
    public List<ProductoDTO> convertirEntidad(List<Producto> entidades) {
        List<ProductoDTO> dtos = new ArrayList<ProductoDTO>();
        for (Producto entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
