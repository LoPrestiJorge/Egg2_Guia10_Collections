
package guia10_actividad04_cine;

import Servicios.PeliculaService;

public class Guia10_Actividad04_Cine {

    public static void main(String[] args) {
        PeliculaService ps = new PeliculaService();
        ps.cargarPeliculas();
        ps.mostrarPeliculas();
        System.out.println("-----------------------");
        ps.duracionMayor();
        System.out.println("-----------------------");        
        ps.ordenarPelisMayor();
        System.out.println("-----------------------");
        ps.ordenarPelisMenor();
        System.out.println("-----------------------");
        ps.ordenarPelisTitulo();
        System.out.println("-----------------------");
        ps.ordenarPelisDirector();
        System.out.println("-----------------------");
        

    }
    
}
