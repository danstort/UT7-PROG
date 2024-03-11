package POOEj1H2;

class Disco extends Multimedia{
    
    enum Tipo{
    rock, pop, soul, blues, clásica;
    
    }
    
    Tipo estilo;

    public Tipo getEstilo() {
        return estilo;
    }

    @Override
    public String toString() {
        return super.toString() + " "+ estilo; 
    }

   
    
    
}
