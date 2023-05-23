/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package Servicios;

import Entidades.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisService {
    private static Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    
    HashSet<Pais> paises = new HashSet();
    
    public void cargarPaises(){
        String respuesta; 
        do {
            System.out.println("Ingrese el nombre de un pais: ");
            paises.add(new Pais(entrada.next()));
            
            System.out.println("¿Quiere seguir agregando paises? S/N: ");
            respuesta = entrada.next();
            
            
        } while (!respuesta.equalsIgnoreCase("N"));
       
        paises.forEach((lugar) -> System.out.println(lugar)); //método funcional
    }

public void ordenarPaises(){
        ArrayList <Pais> paisesLista = new ArrayList(paises);
        ArrayList<String> nombresLista = new ArrayList();        
        System.out.println("Los paises ordenados alfabeticamente: ");
        for (Pais pais : paisesLista) {
            nombresLista.add(pais.getNombre());
        
    }
      Collections.sort(nombresLista);      
         
      for (String aux : nombresLista) {
          System.out.println(aux);
        
    }
  }
     
public void eliminarPais(){
    System.out.println("Ingrese el nombre del pais para eliminar: ");
    String opcion = entrada.next();
    int cont = 0;
    
    Iterator<Pais> it = paises.iterator();
    while (it.hasNext()) {
        String aux = it.next().getNombre();
        if (aux.equals(opcion)) {
            it.remove();
            cont++;
        }
        
    }
    if (cont != 0) {
        System.out.println("El pais que eliminaste es: "+opcion);
        System.out.println("-------------------------------");
        System.out.println("La nueva lista queda así: ");
        //ordenarPaises();
        paises.forEach((lugar) -> System.out.println(lugar));
    } else {
        System.out.println("No se ha encontrado el pais que ingresaste en la lista. ");
        System.out.println("La lista queda así: ");
        //ordenarPaises();
        paises.forEach((lugar) -> System.out.println(lugar));
    }

    
}
    
}
