package ColeccionesList;

import java.util.Scanner;


public class VideoClubMain {

    
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        
        Videoclub v = new Videoclub();
        Pelicula p = new Pelicula(tec.nextLine(), tec.nextLine());        
        v.insertarPelicula(p);
        
        Pelicula p1 = new Pelicula(tec.nextLine(), tec.nextLine());        
        v.insertarPelicula(p1);
        
        System.out.println("Listado de peliculas");     
        v.mostrarPeliculas();
        
        System.out.println("Indicar título de la pelicula a eliminar");
        v.eliminarPorTitulo(tec.nextLine());
        System.out.println("Listado de peliculas");   
        
        v.mostrarPeliculas();
        
    }

}
