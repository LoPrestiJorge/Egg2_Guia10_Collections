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
package Servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PerroService {
    private ArrayList<String> nuevaLista;
    private Scanner entrada;
    
    public PerroService(){
        this.nuevaLista = new ArrayList<>(); //Crea el espacio en memoria del Lista
        this.entrada = new Scanner(System.in).useDelimiter("\n"); //Cuando se invoca la clase, habilita el flujo de datos
    }
    
    public void cargarDatos(){
       boolean bandera = true;
        do {

            System.out.println("Ingrese el nombre de la raza del perro: ");
            String raza = entrada.nextLine();
            nuevaLista.add(raza);
            System.out.println("¿Quiere seguir agregando razas? Escriba Si/No)");
            String opcion = entrada.nextLine();
            if (opcion.equalsIgnoreCase("no")) {
                bandera = false;
            }

        } while (bandera == true);
        
    }
    public void mostrarDatos(){
        
        //Es un tipo de for que sirve para mostrar de una forma mas eficiente.
        for (String aux : nuevaLista){
            System.out.println(aux);
        }
    }
 
//-------------------------------------------------------------------------
//funcion para recorrer la lista.
    public void recorrerLista(){
        System.out.println("Ingrese el nombre de una raza de perro para verificar si está en la lista: ");
        String opcion = entrada.nextLine();
        int cont = 0;
        
        //Creamos y llamamos la clase iterator 
        Iterator<String> it = nuevaLista.iterator();
        while (it.hasNext()) {
            String aux = it.next();  //necesitamos otra variable para que atrape al dato para luego compararlo con la variable opción.
            if(aux.equals(opcion)){
                it.remove();
                cont++;             
            }          
        }
        if(cont != 0){
            System.out.println("La nueva lista queda así: ");
            mostrarDatos();
        }else {
            System.out.println("No se ha encontrado la raza que ingresaste en la lista. ");
            System.out.println("La lista queda así: ");
            mostrarDatos();
        }
    }
}
