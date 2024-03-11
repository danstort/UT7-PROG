package POOEj1H2;


import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Multimedia {
    
    protected String titulo;
    protected String autor;
   
    protected int duracion;
    
    //para crear una excecion es como una clase independiente

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public Multimedia() {
    }

    public Multimedia(String titulo, String autor, int duracion) throws excepcion {
        this.titulo = titulo;
        this.autor = autor;
        if (duracion<0){
            throw new excepcion();
        }
        this.duracion = duracion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Multimedia other = (Multimedia) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }

   

    @Override
    public String toString() {
        return "Multimedia{" + "titulo=" + titulo + ", autor=" + autor + ", duracion=" + duracion + '}';
    }
    
}
 enum Formato {
        wav, mp3, mp4;
    }
