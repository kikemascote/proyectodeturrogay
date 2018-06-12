/**
 * Esta clase contiene los atributos y metodos de un producto.
 * @author Arturo Herrera
 * @version 1.0
 */
package app;

/**
 *
 * @author Arturo
 */
public class Producto {
    
    private String nombre;
    private String descripcion;
    private int stock;
    private int invMaximo;
    private int invMinimo = 0;
    private double porcMax;
    private double porcMin;
    private boolean dictamen;
    
    /**
    *Método constructor parametrizado
    *@param nombre Nombre del producto
    *@param stock Cantidad de producto con la que se inicializa
    *@param max Cantidad maxima de producto permitida
    *@param porcMax Porcentaje para dictamen de producto maximo
    *@param porcMin Porcentaje para dictamen de producto minimo
    */
    public Producto(String nombre, int stock, int max, double porcMax, double porcMin){
        this.nombre = nombre;
        this.descripcion = "";
        this.stock = stock;
        this.invMaximo = max;
        this.invMinimo = 0;
        this.porcMax = porcMax;
        this.porcMin = porcMin;
    }
    
    /**
    *Método constructor parametrizado
    *@param nombre Nombre del producto
    *@param desc Descripción del producto
    *@param stock Cantidad de producto con la que se inicializa
    *@param max Cantidad maxima de producto permitida
    *@param porcMax Porcentaje para dictamen de producto maximo
    *@param porcMin Porcentaje para dictamen de producto minimo
    */
    public Producto(String nombre, String desc, int stock, int max, double porcMax, double porcMin){
        this.nombre = nombre;
        this.descripcion = desc;
        this.stock = stock;
        this.invMaximo = max;
        this.invMinimo = 0;
        this.porcMax = porcMax;
        this.porcMin = porcMin;
    }
    
    /**
     * Metodo para regresar el porcentaje maximo de un producto
     * @return porcMax Porcentaje maximo de un producto
     */
    public double getPorcMax() {
        return porcMax;
    }

    /**
     * Metodo para establecer el porcentaje maximo de un producto 
     * @param porcMax Porcentaje maximo de un producto
     */
    public void setPorcMax(double porcMax) {
        this.porcMax = porcMax;
    }

    /**
     * Metodo para regresar el porcentaje minimo de un producto
     * @return porcMin Porcentaje minimo de un producto.
     */
    public double getPorcMin() {
        return porcMin;
    }

    /**
     * Metodo para establecer el porcentaje minimo de un producto
     * @param porcMin Porcentaje minimo de un producto
     */
    public void setPorcMin(double porcMin) {
        this.porcMin = porcMin;
    }

    /**
     * Metodo que regresa el estado del dictamen
     * @return dictamen Estado del dictamen para determinar el producto alto o bajo
     */
    public boolean isDictamen() {
        return dictamen;
    }

    /**
     * Metodo para establecer el estado del dictamen
     * @param dictamen Estado del dictamen para determinar el producto alto o bajo
     */
    public void setDictamen(boolean dictamen) {
        this.dictamen = dictamen;
    }

    /**
     * Metodo para regresar el nombre del producto 
     * @return nombre Nombre de un producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para establecer el nombre del producto
     * @param nombre Nombre de un producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para regresar la descripcion de un producto
     * @return descripcion Descripcion de un producto
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Metodo para establecer la descripcion de un producto
     * @param descripcion Descripcion de un producto
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Metodo para regresar el stock de producto
     * @return stock Cantidad de producto en existencia
     */
    public int getStock() {
        return stock;
    }

    /**
     * Metodo para establecer la cantidad de producto en existencia
     * @param stock Cantidad de producto en existencia
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Metodo para regresar el inventario maximo permitido
     * @return invMaximo Inventario maximo permitido
     */
    public int getInvMaximo() {
        return invMaximo;
    }

    /**
     * Metodo para establecer el inventario maximo permitido
     * @param invMaximo Inventario maximo permitido
     */
    public void setInvMaximo(int invMaximo) {
        this.invMaximo = invMaximo;
    }

    /**
     * Metodo para regresar el inventario minimo permitido
     * @return invMinimo Inventario minimo permitido
     */
    public int getInvMinimo() {
        return invMinimo;
    }

    //NO SE USARA
    /**
     * Metodo para establecer el inventario minimo permitido Siempre estará en cero.
     * @param invMinimo Inventario minimo permitido.
     */
    public void setInvMinimo(int invMinimo) {
        this.invMinimo = invMinimo;
    }
    
    
    
}
