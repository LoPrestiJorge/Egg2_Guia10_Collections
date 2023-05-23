/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaService {
    private static Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    
    
    ArrayList<Pelicula> listaPeliculas = new ArrayList();
    
    public void cargarPeliculas(){
        String opcion; 
        do {
        Pelicula pelicula = new Pelicula(); //se tienen que inicializar en cada vuelta una nueva pelicula del Objeto pelicula
        System.out.println("Ingrese el título de la pelicula: ");
        pelicula.setTitulo(entrada.next());
        System.out.println("Ingrese el nombre del director: ");
        pelicula.setDirector(entrada.next());
        System.out.println("Ingrese la duración en horas: ");
        pelicula.setHoras(entrada.nextInt());
        
        listaPeliculas.add(pelicula);
        
        System.out.println("¿quiere seguir agregando películas? S/N");
        opcion = entrada.next();
            
        } while (!opcion.equalsIgnoreCase("N"));
                     
    }
    
    //Método para mostrar la lista de clases.
    public void mostrarPeliculas(){
        System.out.println("La lista de peliculas: ");
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux);           
        }
        System.out.println("La cantidad de películas: "+listaPeliculas.size()); //opcional para mostrar la cantidad de peliculas
    }
    
    //Método para mostrar peliculas de una duración mayor a una hora.
    public void duracionMayor(){
        System.out.println("Lista de Peliculas que duran más de una hora: ");
        for (Pelicula pelicula : listaPeliculas) {
            if (pelicula.getHoras()> 1){
                System.out.println(pelicula);
            }
        }
    }
    
    //Método para ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
    
    public void ordenarPelisMayor() {
        Collections.sort(listaPeliculas, Pelicula.compararDuracion); //Así se ordena de menor a mayor usando el Comparator de la clase Pelicula.
        //ahora usamos este comando para ordenarlas de mayor a menor:
        Collections.reverse(listaPeliculas);
        System.out.println("Peliculas ordenadas de mayor a menor de acuerdo a su duración: ");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula.getTitulo() + " tiene una duración de " + pelicula.getHoras());

        }
    }
    
    //Método para ordenar las películas de acuerdo a su duración (de menor a mayor).
    public void ordenarPelisMenor(){
        Collections.sort(listaPeliculas, Pelicula.compararDuracion);
        System.out.println("Peliculas ordenadas de menor a mayor de acuerdo a su duración: ");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula.getTitulo()+ " tiene una duración de "+ pelicula.getHoras());           
        }
    }
    
    //Método para ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    public void ordenarPelisTitulo(){
        Collections.sort(listaPeliculas, Pelicula.compararTitulos);
        System.out.println("Peliculas ordenadas alfabeticamente según el título: ");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula.getTitulo());         
        }
    }
    
   //Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla. 
    public void ordenarPelisDirector(){
        Collections.sort(listaPeliculas, Pelicula.compararDirectores);
        System.out.println("Peliculas ordenadas alfabeticamente según el director: ");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula.getTitulo()+" de "+pelicula.getDirector());           
        }
    }
}
    

 

        

