package ColeccionesList;

import java.util.Objects;

public class Pelicula {

    
    String titulo;
    String descripcion;
    boolean prestada;

    public Pelicula(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prestada = false;
    }

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
        String disponibilidad=this.prestada?"No":"Si";
        
        return "Pelicula{" + "titulo=" + titulo + ", descripcion=" + descripcion + ", disponible=" + disponibilidad + '}';
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
