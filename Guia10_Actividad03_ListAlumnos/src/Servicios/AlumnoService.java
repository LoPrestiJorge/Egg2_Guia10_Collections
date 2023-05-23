/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoService {
    
    static Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    
    
    //Método para cargar datos de forma manual por el usuario. Tiene que recibir la lista como parámetro donde se va alojar cada clase Alumno con sus atributos.
    public void cargarDatos(ArrayList <Alumno> listaAlumnos){
        String respuesta;
        do {
            Alumno alumno = new Alumno();
            System.out.println("Ingrese el nombre del estudiante: ");
            alumno.setNombre(entrada.next());
            
            //Forma para agregar las notas en la lista creada en la clase alumno
            System.out.println("Ingrese las 3 notas del alumno: ");
            ArrayList<Integer> notas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                notas.add(entrada.nextInt());
            }
            
            alumno.setNotas(notas); //Asi se agrega las notas en la lista de la clase Alumnos.
            
            listaAlumnos.add(alumno); //Asíse agrega la clase alumnos en una lista para mayor facilidad.
            
            System.out.println("¿Desea ingresar otro alumno? S/N");
            
            respuesta = entrada.next();
            
        } while (!respuesta.equalsIgnoreCase("N"));      
    }

      public static double notaFinal(ArrayList <Alumno> listaAlumnos){
          System.out.println("Ingrese el nombre del estudiante para calcular su promedio: ");
          String nombre = entrada.next();
          double sumaNotas = 0;
          double promedio =0;
          
          Iterator it = listaAlumnos.iterator();
          while (it.hasNext()) {
              Alumno alumnoAux = (Alumno) it.next();
              if(alumnoAux.getNombre().equals(nombre)){
                  for (Integer notas : alumnoAux.getNotas()) {
                      sumaNotas += notas;
                  }
                  promedio = sumaNotas / alumnoAux.getNotas().size(); //asi se divide la suma total de las notas divido por la cantidad de notas
              }
          }
          return promedio;
      }
           
}
