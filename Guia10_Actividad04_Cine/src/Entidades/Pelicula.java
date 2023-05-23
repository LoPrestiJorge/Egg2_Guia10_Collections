/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
 */
package Entidades;

import java.util.Comparator;

public class Pelicula {
    String titulo;
    String director;
    Integer horas; 

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer horas) {
        this.titulo = titulo;
        this.director = director;
        this.horas = horas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Titulo:" + titulo + ", Director:" + director + ", Horas:" + horas;
    }
    
    //Comparator para comparar duraciones 
    public static Comparator <Pelicula> compararDuracion = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getHoras().compareTo(p2.getHoras());
        }
    };
    
    //Comparator para comparar titulos
    public static Comparator<Pelicula> compararTitulos = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
    
    //Comparator para comparar directores
    public static Comparator <Pelicula> compararDirectores = new Comparator<Pelicula>(){
        @Override
        public int compare (Pelicula p1, Pelicula p2){
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };

            
}
