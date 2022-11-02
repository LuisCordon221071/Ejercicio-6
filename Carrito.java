/*
 * @author Luis Cordón
 * @date 1-11-2022
 * Controlador. 
 */
import java.util.ArrayList;
public class Carrito{
    private ArrayList<Producto> productos;

    public Carrito() {
        productos = new ArrayList<Producto>();
    }

    public void agregarSmartphone(float precio, int serie, String marca, int ar, int year, int month, int day, String productito){
        productos.add(new Smartphone(precio, serie, marca, ar, year, month, day, productito));
    }

    public void agregarCelular(float precio, int serie, String marca, int ar, int year, int month, int day, String productito){
        productos.add(new Celular(precio, serie, marca, ar, year, month, day, productito));
    }

    public void agregarTelefono(float precio, int serie, String marca, int ar, int year, int month, int day, String productito){
        productos.add(new Telefono(precio, serie, marca, ar, year, month, day, productito));
    }

    public void agregarLaptop(float precio, int serie, String marca, int ar, int year, int month, int day, String productito){
        productos.add(new Laptop(precio, serie, marca, ar, year, month, day, productito));
    }

    public void agregarDesktop(float precio, int serie, String marca, int ar, int year, int month, int day, String productito){
        productos.add(new Desktop(precio, serie, marca, ar, year, month, day, productito));
    }

    public void agregarSmartTV(float precio, int serie, String marca, int ar, int year, int month, int day, String productito){
        productos.add(new SmartTV(precio, serie, marca, ar, year, month, day, productito));
    }

    public void agregarSmartwatch(float precio, int serie, String marca, int ar, int year, int month, int day, String productito){
        productos.add(new Smartwatch(precio, serie, marca, ar, year, month, day, productito));
    }

    public void agregarCamara(float precio, int serie, String marca, int ar, int year, int month, int day, String productito){
        productos.add(new Camara(precio, serie, marca, ar, year, month, day, productito));
    }

    public void agregarTablet(float precio, int serie, String marca, int ar, int year, int month, int day, String productito){
        productos.add(new Tablet(precio, serie, marca, ar, year, month, day, productito));
    }

    public String comprasExistentes(){
        String result = "COMPRAS EXISTENTES\n======================\n";
        for (Producto producto : productos) {
            result = result + producto.toString();
        }
        return result+"\n======================\n";
    }

    public void quitarProducto(int numeroProducto){
        productos.remove(numeroProducto);
    }

}