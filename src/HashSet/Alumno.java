package HashSet;

import java.util.Objects;

class Alumno {

    private int edad;
    private String nombre;

    public Alumno(String nombre, int edad) {
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "edad=" + edad + ", nombre=" + nombre + '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean iguales = false;
        if (obj instanceof Alumno) {
            Alumno a = (Alumno) obj;
            iguales = a.nombre.equals(nombre) && a.edad == edad;

        }
        return iguales;
    }
   
    @Override
    public int hashCode(){
        return nombre.hashCode()+(int)edad*10000;
    }

    public String getNombre() {
        return nombre;
    }

   
    
    

}
