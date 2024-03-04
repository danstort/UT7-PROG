package Interfaces;

class Libros extends Libro{

    private boolean prestado = false;

    public boolean prestado() {
        return prestado;
    }

    public void devolver(){
        this.prestado=false;
    }
    
    
    public void prestar(){
        this.prestado=true;
    }

    @Override
    public String toString() {
        return "Libro{" + super.toString()+ "prestado=" + prestado + '}';
    }
    
    
}
