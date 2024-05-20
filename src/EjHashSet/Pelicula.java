/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjHashSet;

import java.util.Objects;

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
        if (prestada) {
            return "Pelicula{" + "titulo=" + titulo + ", descripcion=" + descripcion + ", disponible=no"+'}';
        } else {
            return "Pelicula{" + "titulo=" + titulo + ", descripcion=" + descripcion + ", disponible=Si" + '}';

        }
    }

    public Pelicula(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelicula other = (Pelicula) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.descripcion, other.descripcion);
    }

}
