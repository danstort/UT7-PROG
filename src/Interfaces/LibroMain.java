package Interfaces;

import java.util.Scanner;

public class LibroMain {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        Libro l1;
        
        System.out.println("Quieres crear un libro (l) o una revista (r)");
        
        char tipo = tec.nextLine().charAt(0);

        if (tipo == 'l') {

            l1 = new Libros();
            l1.setCódigo(tec.nextLine());
            l1.setTitulo(tec.nextLine());
            l1.setAnnoPublicacion(tec.nextInt());

            System.out.println("Deseas prestar el libro (s/n)");
            tec.nextLine();
            
            if (tec.nextLine().charAt(0) == 's') {

                ((Libros) l1).prestar();

            }
            
            String stado;
            if (((Libros) l1).prestado()==true) {
                
                stado="Prestado";
            } else{
                
                stado="Disponible";
                
            }
            
            System.out.println("Año publicación: "+l1.getAnnoPublicacion());
            System.out.println("Código: "+l1.getCódigo());
            System.out.println(stado);
            System.out.println(((Libros)l1).toString());
            
            
               
        } else if (tipo == 'r') {
            
            l1= new Revistas();
            
            l1.setCódigo(tec.nextLine());
            l1.setTitulo(tec.nextLine());
            l1.setAnnoPublicacion(tec.nextInt());
            
            ((Revistas)l1).setnumero(tec.nextInt());
            
            System.out.println("Año publicación: "+l1.getAnnoPublicacion());
            System.out.println("Código: "+l1.getCódigo());
            System.out.println(((Revistas)l1).toString());
        }

    }

}
