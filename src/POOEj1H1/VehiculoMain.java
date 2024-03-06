package POOEj1H1;

import java.util.Scanner;

public class VehiculoMain {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Qué deseas crear coche(co) o camión (ca)");

        String tipo = tec.nextLine();
        
        Vehiculo v1=null;

        switch (tipo) {
            case "co":
                
                v1=new Coche();
                v1.setMatricula(tec.nextLine());
                v1.setKm(tec.nextDouble());
                v1.setAnnoMatricula(tec.nextDouble());
                ((Coche)v1).setNumPuertas(tec.nextInt());
                System.out.println(((Coche)v1).vidaUtil());
                System.out.println("Tipo Coche "+((Coche)v1).tipoVehiculo());
                
                break;

            case "ca":
                
                v1=new Camion();
                
                v1=new Camion();
                v1.setMatricula(tec.nextLine());
                v1.setKm(tec.nextDouble());
                v1.setAnnoMatricula(tec.nextDouble());
                ((Camion)v1).setTonelaje(tec.nextDouble());
                ((Camion)v1).setAltura(tec.nextDouble());
                System.out.println(((Camion)v1).vidaUtil());
                
                
                break;
                
            default:
                System.out.println("Introduce un valor válido");;
        }
        
        
    }

}
