/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package guia10_actividad06_tienda;

import Service.TiendaService;
import java.util.Scanner;

public class Guia10_Actividad06_Tienda {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        TiendaService ts = new TiendaService();
        System.out.println("Ingrese una cantidad estimativa de clase de productos para agregar a la lista");
        int cantidad = entrada.nextInt();
        for (int i = 0; i < cantidad; i++) {
            ts.CargarDatos();
        }
        
        System.out.println("Productos mostrados: ");
        ts.mostrarProductos();
        
        System.out.println("----------------------");
        System.out.println("Modificar precio: ");
        ts.modificarPrecio();
        
        System.out.println("----------------------");
        System.out.println("Productos mostrados: ");
        ts.mostrarProductos();
        
        System.out.println("----------------------");
        System.out.println("Eliminar producto:  ");
        ts.eliminarProductos();
        
        System.out.println("----------------------");
        System.out.println("Productos mostrados: ");
        ts.mostrarProductos();

    }
    
}
