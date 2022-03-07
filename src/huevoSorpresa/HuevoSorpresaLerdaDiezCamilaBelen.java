package huevoSorpresa;

/**
 *
 * @author Camila Belén Lerda Díez
 *  
 */
public class HuevoSorpresaLerdaDiezCamilaBelen {

    /**
     * Método que devuelve el precio actual de un huevo sorpresa
     * @return- devuelve el precio del huevo sorpresa
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio-precio de un huevo sorpresa
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    private int unidades;//número de huevos que quedan 
    private double precio;//precio actual de un huevo sorpresa
    private String sorpresa;//nombre de la sorpresa que incluye huevo sorpresa
    private double precio_maxLerdaDiezCamilaBelen2122;//precio máximo que puede tener un huevo sorpresa

    /*Constructor por defecto*/

    /**
     *Constructor sin parámetros
     */

    public HuevoSorpresaLerdaDiezCamilaBelen() {
    }


    /*Constructor por parámetros*/

    /**
     * Constructor con cuatro parámetros
     * @param unidades-número de huevos
     * @param precio-precio actual de un huevo sorpresa
     * @param sorpresa-nombre de la sorpresa que incluye huevo sorpresa
     * @param precio_max-precio máximo que puede tener un huevo sorpresa
     */

    public HuevoSorpresaLerdaDiezCamilaBelen(int unidades, double precio, String sorpresa, double precio_max) {
        this.unidades = unidades;
        this.precio = precio;
        this.sorpresa = sorpresa;
        this.precio_maxLerdaDiezCamilaBelen2122 = precio_max;
    }


    /*Método que devuelve el número de huevos sorpresa que tiene la tienda*/

    /**
     *
     * @return unidades- devuelve el número de huevos sorpresa
     */

    public int obtenerUnidades() {
        return this.unidades;
    }

    /*Método que devuelve el precio que tiene cada huevo sorpresa*/

    /**
     *
     * @return precio- devuelve el precio actual de un huevo
     */

    public double obtenerPrecio() {
        return this.getPrecio();
    }


    /* Método que devuelve la sorpresa que tiene el huevo*/

    /**
     *
     * @return sorpresa- devuelve el nombre de la sorpresa
     */

    public String obtenerSorpresa() {
        return sorpresa;
    }

    /* Método que permite modificar la sorpresa del huevo*/

    /**
     * Constructor de un parámetro
     * @param sorpresa- devuelve el nombre nuevo de la sorpresa
     */

    public void modificarSorpresa(String sorpresa) {
        this.sorpresa = sorpresa;
    }


    /*Método que permite modificar el número de huevos sorpresa que tiene la tienda*/

    /**
     * Constructor de un parámetro
     * @param unidades- número de huevos sorpresa que existen actualmente en la tienda
     */

    public void modificarUnidades(int unidades) {
        this.unidades = unidades;
    }


    /*Método que permite sacar huevos sorpresa si se tiene suficiente dinero y hay 
suficientes unidades en la tienda*/

    /**
     * Constructor de tres parámetros
     * @param unidades-número de huevos sorpresa que existen actualmente en la tienda
     * @param dinero-importe del que dispone el comprador
     * @param sorpresaLerdaDiezCamilaBelen2122-nombre actual de la sorpresa
     * @throws Exception
     */

    public void sacarHuevosSorpresas(int unidades, double dinero, String sorpresaLerdaDiezCamilaBelen2122) throws Exception {
        if (dinero <= 0) {
            throw new Exception("Se necesita una cantidad de dinero positiva");
        }
        if (dinero < (unidades * getPrecio())) {
            throw new Exception("No tiene suficiente dinero");
        }
        if (unidades <= 0) {
            throw new Exception("Es necesario indicar una cantidad positiva de huevos sorpresa");
        }
        if (this.unidades <= unidades) {
            throw new Exception("No hay suficientes huevos sorpresa en la tienda");
        }
        this.modificarUnidades(this.obtenerUnidades() - unidades);
    }


    /*Método que permite aumentar el precio de venta de un huevo sorpresa, suma al precio actual 
    el aumento que se indica siempre que no se sobrepase el precio máximo de venta*/

    /**
     *
     * @param aumento-cantidad especulativa que dsipone el vendedor para sacarle de ganancia al huevo sorpresa que vende
     * @throws Exception
     */

    public void aumentarPrecio(double aumento) throws Exception {
        if (aumento <= 0) {
            throw new Exception("El aumento debe ser positivo");
        }
        if (getPrecio_maxLedaDiezCamilaBelen2122() < getPrecio() + aumento) {
            throw new Exception("No se puede superar el precio máximo");
        }
        setPrecio(getPrecio() + aumento);
    }

    /**
     * @return precio_maxLedaDiezCamilaBelen2122- precio máximo al que se puede vender el huevo
     */
    public double getPrecio_maxLedaDiezCamilaBelen2122() {
        return precio_maxLerdaDiezCamilaBelen2122;
    }

    /**
     * @param precio_maxLedaDiezCamilaBelen2122- precio máximo al que se puede vender el huevo
     */
    public void setPrecio_maxLedaDiezCamilaBelen2122(double precio_maxLedaDiezCamilaBelen2122) {
        this.precio_maxLerdaDiezCamilaBelen2122 = precio_maxLedaDiezCamilaBelen2122;
    }
}
