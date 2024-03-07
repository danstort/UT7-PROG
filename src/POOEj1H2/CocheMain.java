package POOEj1H2;

import java.util.Scanner;

public class CocheMain {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        String matricula = tec.nextLine();

        System.out.println("Cambio automático (a) o cambio manual (m)");

        char tipo = tec.nextLine().charAt(0);

        switch (tipo) {
            case 'a':
                
                CocheCambioAutomatico a1 = new CocheCambioAutomatico();
                a1.setMatricula(matricula);
                a1.setVelocidad(60);
                System.out.println("Matrícula "+a1.getMatricula());
                System.out.println("Velocidad "+a1.getVelocidad());
                System.out.println("Marcha "+a1.cambiaMarcha());
                
                break;

            case 'm':

                CocheCambioManual am1 = new CocheCambioManual();
                am1.setMatricula(matricula);
                am1.setVelocidad(60);
                System.out.println("Matrícula "+am1.getMatricula());
                System.out.println("Velocidad "+am1.getVelocidad());
                System.out.println("Marcha "+am1.cambiaMarcha());
                
                break;
            default:
                System.out.println("Introduce un valor válido");
        }
    }

}
