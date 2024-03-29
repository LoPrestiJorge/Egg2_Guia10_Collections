/*
1) Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

2)Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package guia10_actividad01_arraylist;

import Servicios.PerroService;
import java.util.Scanner;

public class Guia10_Actividad01_Arraylist {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        
        PerroService ps = new PerroService();
        ps.cargarDatos();
        ps.mostrarDatos();
        ps.recorrerLista();

    }
    
}
