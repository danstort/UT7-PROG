package POOEj1H2;


import java.util.Scanner;

public class mainMultimedia {

    public static void main(String[] args) throws excepcion{

        try {
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
            switch (tipo) {
                case 'p':
                    teclado.nextLine();
                    String actor = teclado.nextLine();
                    String actriz = teclado.nextLine();
                    Pelicula p1 = new Pelicula();
                    p1.setTitulo(titulo);
                    p1.setAutor(autor);
                    p1.setFormato(taudio);
                    p1.setDuracion(duracion);
                    p1.setActor(actor);
                    p1.setActriz(actriz);
                    System.out.println("La actriz principal de la pelicula " + p1.getTitulo() + " es " + p1.getActriz());

                    break;
                case 'd':

                    teclado.nextLine();
                    String genero = teclado.nextLine();
                    System.out.println(genero);
                    Estilo estilo = null;

                    if (genero.equalsIgnoreCase("rock")) {

                        estilo = Estilo.rock;

                    } else if (genero.equalsIgnoreCase("pop")) {

                        estilo = Estilo.pop;
                    } else if (genero.equalsIgnoreCase("soul")) {

                        estilo = Estilo.soul;
                    } else if (genero.equalsIgnoreCase("blues")) {

                        estilo = Estilo.blues;
                    } else if (genero.equalsIgnoreCase("clásica")) {

                        estilo = Estilo.clásica;
                    }

                    Disco d1 = new Disco();
                    d1.setTitulo(titulo);
                    d1.setAutor(autor);
                    d1.setFormato(taudio);
                    d1.setDuracion(duracion);
                    d1.setEstilo(estilo);

                    System.out.println("El género del disco " + d1.getTitulo() + " es " + d1.getEstilo());
                    break;

            }
        } catch (excepcion e) {
            System.out.println("La duración no puede ser inferior a 0");
        }
    }
}
