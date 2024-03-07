package POOEj1H1;

import java.util.Scanner;


public class PersonaMain {

    
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        
        char tipo = tec.nextLine().charAt(0);
        
        switch (tipo) {
            case 'f':
                
                Profesor p1=new Profesor();
                
                p1.setDNI(tec.nextLine());
                p1.setNombre(tec.nextLine());
                p1.setEdad(tec.nextInt());
                p1.setDireccion(tec.nextLine());
                p1.setTitulacion(tec.nextLine());
                tec.nextLine();
                p1.setAnnoTrab(tec.nextInt());
                
                
                
                System.out.println("Sueldo profesor "+p1.calcularSueldo());
                
                break;
                
            case 'i':
                
                ProfesorInterino pi1=new ProfesorInterino();
                pi1.setDNI(tec.nextLine());
                pi1.setNombre(tec.nextLine());
                pi1.setEdad(tec.nextInt());
                pi1.setDireccion(tec.nextLine());
                pi1.setTitulacion(tec.nextLine());
                tec.nextLine();
                pi1.setExpDocencia(tec.nextInt());
                
                System.out.println("Sueldo profesor "+pi1.calcularSueldo());
                
                
                break;
                
            case 'a':
                
                Alumno a1 = new Alumno();
                a1.setDNI(tec.nextLine());
                a1.setNombre(tec.nextLine());
                a1.setEdad(tec.nextInt());
                a1.setDireccion(tec.nextLine());
                a1.setCurso(tec.nextLine());
                tec.nextLine();
                a1.setMatricula(tec.nextInt());
                
                System.out.println("Precio matrícula "+a1.calcularMatricula());
                
                
                
                break;
                
            default:
                System.out.println("Introduce un valor válido");
        }
        
    }

}
