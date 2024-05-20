/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjHashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author danie
 */
public class Videoclub {

    HashSet<Pelicula> pelis = new HashSet<>();

    public void insertarPelicula(Pelicula p) {

        this.pelis.add(p);
    }

    public Pelicula buscarPorTitulo(String titulo) {

        Pelicula pel = null;

        for (Pelicula p : this.pelis) {

            if (p.getTitulo().equals(titulo)) {

                pel = p;

            }

        }
        return pel;
    }

    public void mostrarPeliculas() {

        for (Pelicula p : this.pelis) {

            System.out.println(p);
        }

    }

    public boolean eliminarPorTitulo(String titulo) {
        Iterator<Pelicula> iterator = this.pelis.iterator();

        while (iterator.hasNext()) {
            Pelicula p = iterator.next();

            if (p.getTitulo().equals(titulo)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

}
