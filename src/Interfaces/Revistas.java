package Interfaces;

class Revistas extends Libro{

    public int numero;

    public Revistas(int numero, String código, String titulo, int annoPublicacion) {
        super(código, titulo, annoPublicacion);
        this.numero = numero;
    }

    public Revistas() {
    }

    @Override
    public String toString() {
        return "Revistas{" + super.toString() +"numero=" + numero + '}';
    }

    public int getNumero() {
        return numero;
    }

    
    public int getnumero(){
    
        return this.numero;
        
    }
    
    public void setnumero(int numero){
    
        this.numero=numero;
        
    }
    
}
