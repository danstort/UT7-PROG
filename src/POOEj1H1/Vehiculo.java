/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOEj1H1;

/**
 *
 * @author danielsotoortiz
 */
abstract class Vehiculo {
   
   protected String matricula; 
   protected double km;
   protected double annoMatricula;
   
   
   abstract public String vidaUtil();

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
