package POOEj1H1;

class ProfesorInterino extends Persona{
    
    String titulacion;
    int expDocencia;

    
    double calcularSueldo(){
    
        return 1000+200;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getExpDocencia() {
        return expDocencia;
    }

    public void setExpDocencia(int expDocencia) {
        this.expDocencia = expDocencia;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ProfesorInterino() {
    }

    public ProfesorInterino(String titulacion, int expDocencia) {
        this.titulacion = titulacion;
        this.expDocencia = expDocencia;
    }

    public ProfesorInterino(String titulacion, int expDocencia, String DNI, String nombre, int edad, String direccion) {
        super(DNI, nombre, edad, direccion);
        this.titulacion = titulacion;
        this.expDocencia = expDocencia;
    }

    
}
