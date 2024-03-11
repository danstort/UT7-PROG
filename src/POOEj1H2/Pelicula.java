package POOEj1H2;

class Pelicula extends Multimedia {

    private String actor;
    private String actriz;
    

    public Pelicula() {
    }

    public Pelicula(String actor, String actriz) {
        this.actor = actor;
        this.actriz = actriz;
    }

    public Pelicula(String actor, String actriz, String titulo, String autor, Formato formato, int duracion) throws excepcion {
        super(titulo, autor, formato, duracion);
        this.actor = actor;
        this.actriz = actriz;
    }

    public String getActor() {
        return actor;
    }

    public String getActriz() {
        return actriz;
    }

    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    

    


    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setActriz(String actriz) {
        this.actriz = actriz;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "actor=" + actor + ", actriz=" + actriz + '}';
    }

    

    
    
}
