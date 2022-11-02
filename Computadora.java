/*
 * @author Luis Cordón
 * @date 1-11-2022
 * Vista. 
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
public class Computadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Carrito compras = new Carrito();
        Acciones2 cliente = new Producto();
        String menu = "Bienvenido a Electrónica Latinoamericana. Escoga una opción\n=================================\n "+
        "\t1. Comprar producto\n"+
        "\t2. Probar producto \n"+
        "\t3. Quitar producto\n"+
        "\t4. Ver factura\n"+
        "\t5. Salir\n" +
        "=================================\n";
        float precio;
        int serie, ar, year, month, day;
        String marca, productito;
        int opcion = 1;
        while (opcion>=1 && opcion<5){
            try{
                System.out.println(menu);
                System.out.println("Ingrese una opción");
                opcion = teclado.nextInt();
                switch(opcion){
                    case 1:
                        try {
                            System.out.println("¿Qué producto desea comprar?\n");
                            System.out.println("1: Smartphone, 2: Celular, 3: Teléfono, 4: Laptop, 5: Desktop, 6: SmartTV, 7: Smartwatch, 8: Camara, 9: Tablet\n");
                            int tipoCompra = teclado.nextInt();
                            teclado.nextLine();
                            System.out.println("Ingrese la marca: ");
                            marca = teclado.nextLine(); 
                            System.out.println("Ingrese la serie ");
                            serie = teclado.nextInt();
                            System.out.println("Ingrese el código ");
                            ar = teclado.nextInt();
                            System.out.println("Ingrese el precio ");
                            precio = teclado.nextInt();
                            System.out.println("Ingrese el año en que se fabricó: ");
                            year = teclado.nextInt();
                            System.out.println("Ingrese el mes en que se fabricó: ");
                            month = teclado.nextInt();
                            System.out.println("Ingrese el día en que se fabricó: ");
                            day = teclado.nextInt();
                            teclado.nextLine();
                            switch(tipoCompra){
                                case 1: 
                                    productito = "Smartphone";
                                    compras.agregarSmartphone(precio, serie, marca, ar, year, month, day, productito);
                                    break;
                                case 2: 
                                    productito = "Celular";
                                    compras.agregarCelular(precio, serie, marca, ar, year, month, day, productito);
                                    break;
                                case 3:
                                    productito = "Teléfono";
                                    compras.agregarTelefono(precio, serie, marca, ar, year, month, day, productito);
                                    break;
                                case 4: 
                                    productito = "Laptop";
                                    compras.agregarLaptop(precio, serie, marca, ar, year, month, day, productito);
                                    break;
                                case 5: 
                                    productito = "Desktop";
                                    compras.agregarDesktop(precio, serie, marca, ar, year, month, day, productito);
                                    break;
                                case 6: 
                                    productito = "SmartTV";
                                    compras.agregarSmartTV(precio, serie, marca, ar, year, month, day, productito);
                                    break;
                                case 7: 
                                    productito = "Smartwatch";
                                    compras.agregarSmartwatch(precio, serie, marca, ar, year, month, day, productito);
                                    break;
                                case 8: 
                                    productito = "Cámara";
                                    compras.agregarCamara(precio, serie, marca, ar, year, month, day, productito);
                                    break;
                                case 9: 
                                    productito = "Tablet";
                                    compras.agregarTablet(precio, serie, marca, ar, year, month, day, productito);
                                    break;
                            }
                        } catch (Exception e){
                            System.out.println("Verifique que no ingresó otro carácter donde iba un número");
                        }
                        break;
                    case 2:
                        try {
                            System.out.println("¿Qué producto desea probar?\n");
                            System.out.println("1: Smartphone, 2: Celular, 3: Teléfono, 4: Laptop, 5: Desktop, 6: SmartTV, 7: Smartwatch, 8: Camara, 9: Tablet\n");
                            int tipoProbar = teclado.nextInt(); 
                            teclado.nextLine();
                            switch(tipoProbar){
                                case 1: 
                                    System.out.println("¿Qué función desea probar?\n");
                                    System.out.println("1: Hacer llamadas, 2: Tomar fotografias, 3: Navegar por internet, 4: Reproducir videos, 5: Portar el producto\n");
                                    int tipoSmartphone = teclado.nextInt(); 
                                    teclado.nextLine();
                                    switch(tipoSmartphone){
                                        case 1:
                                            System.out.println(cliente.llamar());
                                            break;
                                        case 2:
                                            System.out.println(cliente.fotografiar());
                                            break;
                                        case 3:
                                            System.out.println(cliente.navegarEnInternet());
                                            break;
                                        case 4:
                                            System.out.println(cliente.reproducirVideo());
                                            break;
                                        case 5:
                                            System.out.println(cliente.portar());
                                            break;
                                    }
                                    break;
                                case 2: 
                                    System.out.println("¿Qué función desea probar?\n");
                                    System.out.println("1: Hacer llamadas, 2: Portar el producto\n");
                                    int tipoCelular = teclado.nextInt(); 
                                    teclado.nextLine();
                                    switch(tipoCelular){
                                        case 1:
                                            System.out.println(cliente.llamar());
                                            break;
                                        case 2:
                                            System.out.println(cliente.portar());
                                            break;
                                    }
                                    break;
                                case 3: 
                                    System.out.println("¿Qué función desea probar?\n");
                                    System.out.println("1: Hacer llamadas\n");
                                    int tipoTelefono = teclado.nextInt(); 
                                    teclado.nextLine();
                                    switch(tipoTelefono){
                                        case 1:
                                            System.out.println(cliente.llamar());
                                            break;
                                    }
                                    break;
                                case 4: 
                                    System.out.println("¿Qué función desea probar?\n");
                                    System.out.println("1: Ejecutar videojuegos, 2: Navegar por internet, 3: Reproducir videos, 4: Portar el producto\n");
                                    int tipoLaptop = teclado.nextInt(); 
                                    teclado.nextLine();
                                    switch(tipoLaptop){
                                        case 1:
                                            System.out.println(cliente.jugar());
                                            break;
                                        case 2:
                                            System.out.println(cliente.navegarEnInternet());
                                            break;
                                        case 3:
                                            System.out.println(cliente.reproducirVideo());
                                            break;
                                        case 4:
                                            System.out.println(cliente.portar());
                                            break;
                                    }
                                    break;
                                case 5: 
                                    System.out.println("¿Qué función desea probar?\n");
                                    System.out.println("1: Ejecutar videojuegos, 2: Navegar por internet, 3: Reproducir videos\n");
                                    int tipoDesktop = teclado.nextInt(); 
                                    teclado.nextLine();
                                    switch(tipoDesktop){
                                        case 1:
                                            System.out.println(cliente.jugar());
                                            break;
                                        case 2:
                                            System.out.println(cliente.navegarEnInternet());
                                            break;
                                        case 3:
                                            System.out.println(cliente.reproducirVideo());
                                            break;
                                    }
                                    break;
                                case 6: 
                                    System.out.println("¿Qué función desea probar?\n");
                                    System.out.println("1: Navegar por internet, 2: Reproducir videos\n");
                                    int tipoSmartTV = teclado.nextInt(); 
                                    teclado.nextLine();
                                    switch(tipoSmartTV){
                                        case 1:
                                            System.out.println(cliente.navegarEnInternet());
                                            break;
                                        case 2:
                                            System.out.println(cliente.reproducirVideo());
                                            break;
                                    }
                                    break;
                                case 7: 
                                    System.out.println("¿Qué función desea probar?\n");
                                    System.out.println("1: Hacer llamadas, 2: Tomar fotografias, 3: Portar el producto\n");
                                    int tipoSmartwatch = teclado.nextInt(); 
                                    teclado.nextLine();
                                    switch(tipoSmartwatch){
                                        case 1:
                                            System.out.println(cliente.llamar());
                                            break;
                                        case 2:
                                            System.out.println(cliente.fotografiar());
                                            break;
                                        case 3:
                                            System.out.println(cliente.portar());
                                            break;
                                    }
                                    break;
                                case 8: 
                                    System.out.println("¿Qué función desea probar?\n");
                                    System.out.println("1: Tomar fotografias, 2: Reproducir videos, 3: Portar el producto\n");
                                    int tipoCamara = teclado.nextInt(); 
                                    teclado.nextLine();
                                    switch(tipoCamara){
                                        case 1:
                                            System.out.println(cliente.fotografiar());
                                            break;
                                        case 2:
                                            System.out.println(cliente.reproducirVideo());
                                            break;
                                        case 3:
                                            System.out.println(cliente.portar());
                                            break;
                                    }
                                    break;
                                case 9: 
                                    System.out.println("¿Qué función desea probar?\n");
                                    System.out.println("1: Tomar fotografias, 2: Navegar por internet, 3: Reproducir videos, 4: Portar el producto\n");
                                    int tipoTablet = teclado.nextInt(); 
                                    teclado.nextLine();
                                    switch(tipoTablet){
                                        case 1:
                                            System.out.println(cliente.fotografiar());
                                            break;
                                        case 2:
                                            System.out.println(cliente.navegarEnInternet());
                                            break;
                                        case 3:
                                            System.out.println(cliente.reproducirVideo());
                                            break;
                                        case 4:
                                            System.out.println(cliente.portar());
                                            break;
                                    }     
                            }
                        } catch (Exception e){
                            System.out.println("Verifique que no ingresó otro carácter donde iba un número");
                        }
                        break;
                    case 3:
                        int numeroProducto;
                        System.out.println("¿Qué producto desea quitar?");
                        numeroProducto = teclado.nextInt();
                        compras.quitarProducto(numeroProducto);
                        break;
                    case 4:
                        System.out.print(compras.comprasExistentes());
                        break;
                    default:
                        System.out.print(compras.comprasExistentes());
                        System.out.println("¡Vuelva pronto! :D");
                        break;
                }
            }
            catch (Exception e){
                teclado.nextLine();
                System.out.println("\nDebe ingresar un número\n");
                opcion = 1;
            }
        }
    }
}