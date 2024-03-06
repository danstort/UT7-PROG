/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOEj1H1;

/**
 *
 * @author danie
 */
class Camion extends Vehiculo {

    double tonelaje;
    double altura;

    @Override
    public String vidaUtil() {

        return "Vida útil coche 5 años";
    }

    public double getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(double tonelaje) {
        this.tonelaje = tonelaje;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getAnnoMatricula() {
        return annoMatricula;
    }

    public void setAnnoMatricula(double annoMatricula) {
        this.annoMatricula = annoMatricula;
    }
    
    

}
