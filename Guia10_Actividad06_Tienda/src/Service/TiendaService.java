/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class TiendaService {
    HashMap <String, Double> producto = new HashMap(); //creamos de forma global el mapa
    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    
    //Función para cargar los datos.
    public void CargarDatos(){
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = entrada.next();
        System.out.println("Ingrese el precio del producto: ");
        Double precio = entrada.nextDouble(); //tiene que ser Double con mayus para que aloje en el mapa
        producto.put(nombre, precio); //Asi se alojan las variables en la llave (nombre) y valor (precio).
    }
    
    //Función para modificar los precios de los productos.
    public void modificarPrecio(){
        System.out.println("Ingrese el nombre del producto que quiera modificar su precio: ");
        String nombre = entrada.next();
        System.out.println("Ingrese el nuevo valor del precio: ");
        Double precio = entrada.nextDouble();
        producto.replace(nombre, precio); //método del mapa para reemplazar los valores.       
    }
    
    //Función para eliminar el producto, recordá que para hacer eso en un mapa solo tenes que eliminar la llave.
    public void eliminarProductos(){
        System.out.println("Ingrese el nombre del producto que se quiera eliminar: ");
        String nombre = entrada.next();
        producto.remove(nombre);
    }
    
    //Función para mostrar los productos
    public void mostrarProductos() {
        for (Map.Entry<String, Double> producto : producto.entrySet()) {
            System.out.println("Producto: " + producto.getKey() + " precio: " + producto.getValue());
        }

    }

}
