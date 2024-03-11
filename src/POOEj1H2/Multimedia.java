package POOEj1H2;

import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Multimedia {

    protected String titulo;
    protected String autor;
    protected Formato formato;
    protected int duracion;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDuracion(int duracion) throws excepcion{
        if (duracion<0){
            throw new excepcion();
        }
        this.duracion = duracion;
    }

    
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) throws excepcion{
        this.formato = formato;
    }
    
    public Multimedia() {
    }

    public Multimedia(String titulo, String autor, Formato formato, int duracion) throws excepcion{
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
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

