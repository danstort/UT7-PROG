package POOEj1H2;

import java.util.Scanner;

public class mainMultimedia {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Indica que dispositivo deseas crear película (p) o disco (d) :");
        char tipo = teclado.nextLine().charAt(0);
        String titulo = teclado.nextLine();
        String autor = teclado.nextLine();

        System.out.println("Elegir formato: \n"
                + "wav\n"
                + "mp3\n"
                + "mp4");

        String formato = teclado.nextLine();
        Formato taudio = null;

        if (formato.equals("wav")) {
            taudio = Formato.wav;

        } else if (formato.equals("mp3")) {
            taudio = Formato.mp3;

        } else if (formato.equals("mp4")) {

            taudio = Formato.mp4;

        }
        int duracion = teclado.nextInt();
        String actor = teclado.nextLine();
        String actriz = teclado.nextLine();

        switch (tipo) {
            case 'p':

                Pelicula p1 = new Pelicula();
                p1.setTitulo(titulo);
                p1.setAutor(autor);
                p1.setFormato(taudio);
                p1.setDuracion(duracion);
                p1.setActor(autor);
                System.out.println("La actriz principal de la pelicula "+p1.getTitulo()+" es "+p1.getActriz());
                
                
                break;
            case 'd':
                
                Disco d1 = new Disco();
                
                
                break;
        }

    }

}
