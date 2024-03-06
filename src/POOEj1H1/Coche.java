package POOEj1H1;

 class Coche extends Vehiculo {

    int numPuertas;

    public Coche() {
    }

    @Override
    public String vidaUtil() {

        return "Vida útil coche 10 años";
    }

    public String tipoVehiculo() {

        switch (this.numPuertas) {

            case 5:
                return "Multiusos";

            case 7:

                return "Berlina";

            case 3:

                return "Microcoche";

            default:
                throw new AssertionError();
        }

    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
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
