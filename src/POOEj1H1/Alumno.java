package POOEj1H1;

class Alumno extends Persona{

    String cicloFormativo;
    String curso;
    int matricula;
    
    double calcularMatricula(){
    
        return 7*50;
    }

    public String getCicloFormativo() {
        return cicloFormativo;
    }

    public void setCicloFormativo(String cicloFormativo) {
        this.cicloFormativo = cicloFormativo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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

    public Alumno() {
    }

    public Alumno(String cicloFormativo, String curso) {
        this.cicloFormativo = cicloFormativo;
        this.curso = curso;
    }

    public Alumno(String cicloFormativo, String curso, String DNI, String nombre, int edad, String direccion) {
        super(DNI, nombre, edad, direccion);
        this.cicloFormativo = cicloFormativo;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
    
    
}
