/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjHashSet;

/**
 *
 * @author danie
 */
public class Pelicula {
    
    String titulo;
    String descripcion;
    boolean prestada;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isPrestada() {
        return prestada;
    }

    public void setPrestada(boolean prestada) {
        this.prestada = prestada;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", descripcion=" + descripcion + ", prestada=" + prestada + '}';
    }
    
    
    
    
    
}
