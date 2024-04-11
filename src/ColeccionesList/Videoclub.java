package ColeccionesList;

import java.util.ArrayList;

public class Videoclub {

    private ArrayList<Pelicula> listaPeliculas;

    private String nombre;

    public Videoclub() {

        listaPeliculas = new ArrayList<Pelicula>();
    }

    public Videoclub(String nombre) {

        this.nombre = nombre;
        this.listaPeliculas = new ArrayList<Pelicula>();
    }

    public void insertarPelicula(Pelicula p) {

        if (!this.listaPeliculas.contains(p)) {

            this.listaPeliculas.add(p);

        }

    }

    public Pelicula buscarPorTitulo(String titulo) {

        Pelicula pel = null;

        for (Pelicula p : this.listaPeliculas) {

            if (p.getTitulo().equals(titulo)) {

                pel = p;

            }

        }
        return pel;
    }

    public void mostrarPeliculas() {

        for (Pelicula p : this.listaPeliculas) {

            System.out.println(p);
        }

    }

    public boolean eliminarPorTitulo(String titulo) {

        for (Pelicula p : this.listaPeliculas) {

            if (p.getTitulo().equals(titulo)) {

                this.listaPeliculas.remove(p);
                return true;
            }

        }
        return false;
    }
    
}
