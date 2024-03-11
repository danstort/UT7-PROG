package POOEj1H2;

class Disco extends Multimedia {

    Estilo estilo;

    public Estilo getEstilo() {
        return estilo;
    }

    @Override
    public String toString() {
        return super.toString() + " " + estilo;
    }

    public Disco() {
    }

    public Disco(Estilo estilo, String titulo, String autor, Formato formato, int duracion) throws excepcion {
        super(titulo, autor, formato, duracion);
        this.estilo = estilo;
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


    public void setEstilo(Estilo estilo) {
        this.estilo = estilo;
    }

}

enum Estilo {
    rock, pop, soul, blues, clásica;

}
