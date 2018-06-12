/**
 * Esta clase contiene los atributos y metodos de un registro.
 * @author Arturo Herrera
 * @version 1.0
 */
package app;

import java.util.ArrayList;

public class Registro {
    
    private ArrayList<Producto> lista = new ArrayList();

    private int maxPorciento, minPorciento;
    
    /**
     * Metodo que regresa la lista/registro de productos
     * @return lista Regresa la lista
     */
    public ArrayList<Producto> getLista() {
       
        return lista;
    }
    
    /**
     * Metodo para agregar productos al registro
     * @param p El producto a agregar a la lista
     */
    public void nuevoProducto(Producto p){
    
        lista.add(p);
    }
    
    /**
     * Metodo para remover un producto del registro
     * @param p Producto a eliminar de la lista
     */
    public void eliminarProducto(Producto p){
    
        lista.remove(p);
    }
    
    /**
     * Metodo para buscar un producto en el registro ,por su nombre
     * @param nombreBuscar Recive el nombre del producto
     * @return Regresa el producto buscado
     */
    public Producto buscar(String nombreBuscar){
    
        for(Producto p : lista){
        
            if(p.getNombre().equals(nombreBuscar))
                return p;
        }
        
        return null;
    }
    
    /**
     * Metodo para actualizar un producto
     * @param nomProducto Producto a buscar para actualizar
     * @param nuevoNombre Nuevo nombre del producto
     * @param nuevaDescripcion Nueva descripcion del producto
     * @param nuevoMax Nuevo valor maximo permitido del producto
     * @param porcMax Nuevo porcentaje para establecer producto alto
     * @param porcMin Nuevo porcentaje para establecer producto bajo
     */
    public void actualizarProducto(String nomProducto, String nuevoNombre, String nuevaDescripcion, int nuevoMax, double porcMax, double porcMin){
        
        Producto p = buscar(nomProducto);
        
        if(p != null){
            p.setNombre(nuevoNombre);
            p.setDescripcion(nuevaDescripcion);
            p.setInvMaximo(nuevoMax);
            p.setPorcMax(porcMax);
            p.setPorcMin(porcMin);
        }
            
    }
    
    /**
     * Metodo para establecer el estado del dictamen que indica producto alto y bajo
     * @param nombre Recibe un nombre para buscar un producto
     */
    public void regla(String nombre){
    
        Producto p = buscar(nombre);
        
        if( p.getPorcMax() >= p.getStock() * 100 / p.getInvMaximo() )
            p.setDictamen(false);
        
        if( p.getPorcMin() <= p.getStock() * 100 / p.getInvMaximo() )
            p.setDictamen(true);
        
    }
    
    /**
     * Metodo para añadir mas producto al registro
     * @param nombre Nombre del producto al que se desea agregar mas producto
     * @param cantidad Cantidad que se agrega
     * @return Indicador de estado en el agregado de producto
     */
    public boolean masProducto(String nombre, int cantidad){
        
        Producto p = buscar(nombre);
        
        if(p.getStock() + cantidad <= p.getInvMaximo()){
            p.setStock( p.getStock() + cantidad );
            return true;
        }else{
            return false;
        }
        
    }
    
    
    /**
     * Metodo para restar cantidad de producto
     * @param nombre Nombre del producto al que se restara cantidad
     * @param cantidad Cantidad a restar
     * @return Indicador de estado en el agregado de producto
     */
    public boolean menosProducto(String nombre, int cantidad){
        
        Producto p = buscar(nombre);
         
        if(cantidad <= p.getStock()){
           p.setStock( p.getStock() - cantidad );
           return true;
        }else{
            return false;
        }
        
    }
}
