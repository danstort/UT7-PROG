package POOEj1H2;

public class Coche {

    protected String matricula;
    protected double velocidad;
    protected int marcha;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public Coche() {
    }

    public Coche(String matricula) {
        this.matricula = matricula;
        this.velocidad=0;
        this.marcha=0;
    }
    
    protected void acelerar(int a){
    
       this.velocidad=this.velocidad+a;
       
    }
   
    protected void frenar (int a){
    
       this.velocidad=this.velocidad-a;
       
    }
    
}
