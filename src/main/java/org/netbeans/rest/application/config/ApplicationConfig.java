
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;
import co.edu.uptc.inventario.servicio.*;

/**
 * Esta clase registra la informacion de las clases que van a ser utilizadas como servicios REST
 * @author daperador
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        addRestResourceClasses(resources);
        return resources;
    }
    
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(co.edu.uptc.inventario.servicio.DetalleFacturaServicio.class);
resources.add(co.edu.uptc.inventario.servicio.FacturaServicio.class);
resources.add(co.edu.uptc.inventario.servicio.GrupoProductoServicio.class);
resources.add(co.edu.uptc.inventario.servicio.InventarioDetalleServicio.class);
resources.add(co.edu.uptc.inventario.servicio.InventarioServicio.class);
resources.add(co.edu.uptc.inventario.servicio.MarcaServicio.class);
resources.add(co.edu.uptc.inventario.servicio.OpcionesCreditoServicio.class);
resources.add(co.edu.uptc.inventario.servicio.PersonaServicio.class);
resources.add(co.edu.uptc.inventario.servicio.ProductoServicio.class);
resources.add(co.edu.uptc.inventario.servicio.TarifaServicio.class);
resources.add(co.edu.uptc.inventario.servicio.TiendaServicio.class);
resources.add(co.edu.uptc.inventario.servicio.TipoPagoServicio.class);
resources.add(co.edu.uptc.inventario.servicio.TipoProductoServicio.class);
resources.add(co.edu.uptc.inventario.servicio.UnidadMedidaServicio.class);
    }
    
}

