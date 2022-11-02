/*
 * @author Luis Cordón
 * @date 1-11-2022
 * Clase madre. 
 */
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Producto implements Acciones2{
    Scanner teclado = new Scanner(System.in);
    protected float precio;
    protected int serie;
    protected String marca;
    protected Calendar fechafab;
    protected int ar;
    protected String productito;

    public Producto() {
    }

    public Producto(float precio, int serie, String marca, int ar, int year, int month, int day, String productito) {
        this.precio = precio;
        this.serie = serie;
        this.marca = marca;
        this.fechafab = new GregorianCalendar(year, month, day);
        this.ar = ar;
        this.productito = productito;
    }

    /**
     * @return float return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return int return the serie
     */
    public int getSerie() {
        return serie;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(int serie) {
        this.serie = serie;
    }

    /**
     * @return String return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return Calendar return the fechafab
     */
    public Calendar getFechafab() {
        return fechafab;
    }

    /**
     * @param fechafab the fechafab to set
     */
    public void setFechafab(Calendar fechafab) {
        this.fechafab = fechafab;
    }

    /**
     * @return int return the ar
     */
    public int getAr() {
        return ar;
    }

    /**
     * @param ar the ar to set
     */
    public void setAr(int ar) {
        this.ar = ar;
    }
    
    /**
     * @return String return the marca
     */
    public String getProductito() {
        return productito;
    }

    /**
     * @param marca the marca to set
     */
    public void setProductito(String productito) {
        this.productito = productito;
    }

    
    /** 
     * @return String
     */
    public String toString() {
        return "\n" +
            "producto: " + getProductito() + 
            " \nprecio: " + getPrecio() + 
            " \nlikes: " + getMarca() + 
            " \ncomentarios: " + getSerie() + 
            " \nhashtags: " + getAr() +
            "\n";
    }

    
    /** 
     * @return String
     */
    public String llamar() {
        String numero;
        System.out.println("¿Qué número desea llamar?");
        numero = teclado.nextLine();
        return "llamando al número "+numero+" ...";
    }

    
    /** 
     * @return String
     */
    public String fotografiar() {
        String foto;
        System.out.println("¿Qué desea fotografiar?");
        foto = teclado.nextLine();
        return "fotografiando "+foto+" ...";
    }

    
    /** 
     * @return String
     */
    public String navegarEnInternet() {
        String SitioWeb;
        System.out.println("¿Qué sitio web desea visitar?");
        SitioWeb = teclado.nextLine();
        return "visitando el sitio web "+SitioWeb+" ...";
    }

    
    /** 
     * @return String
     */
    public String reproducirVideo() {
        String video;
        System.out.println("¿Qué video desea reproducir?");
        video = teclado.nextLine();
        return "reproduciendo "+video+" ...";
    }

    
    /** 
     * @return String
     */
    public String jugar() {
        String juego;
        System.out.println("¿Qué juego desea jugar?");
        juego = teclado.nextLine();
        return "jugando "+juego+" ...";
    }

    
    /** 
     * @return String
     */
    public String portar() {
        return "*porta el producto* XD";
    }

}