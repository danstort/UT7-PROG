package Interfaces;

public abstract class Libro {


    protected String código;
    protected String titulo;
    protected int annoPublicacion;
    

    public Libro(String código, String titulo, int annoPublicacion) {
        this.código = código;
        this.titulo = titulo;
        this.annoPublicacion = annoPublicacion;
    }

    public Libro() {
    }

    
    public String getCódigo() {
        return código;
    }

    public void setCódigo(String código) {
        this.código = código;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnnoPublicacion() {
        return annoPublicacion;
    }

    public void setAnnoPublicacion(int annoPublicacion) {
        this.annoPublicacion = annoPublicacion;
    }

    @Override
    public String toString() {
        return "Libro{" + "c\u00f3digo=" + código + ", titulo=" + titulo + ", annoPublicacion=" + annoPublicacion + '}';
    }

    
    
    

}
