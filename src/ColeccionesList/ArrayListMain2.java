package ColeccionesList;

import java.util.ArrayList; // import the ArrayListMain class
import java.util.LinkedList; // import the ArrayListMain class

/**
 *
 * @author Mar�a Navarro Elbal
 */
public class ArrayListMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<String> listaString = new ArrayList<String>(20);
//        LinkedList<String> lista = new LinkedList<String>();
        for (int i = 0; i < 20; i++) {
            listaString.add("Cadena n�mero " + i);
        }
        System.out.println("La colecci�n tiene " + listaString.size() + " elementos");
   
//        for (String a: listaString){
//            System.out.println(a);
//        }
        System.out.println("LinkedList------------");
        LinkedList a = new LinkedList();
        a.add("Hola");
        a.addFirst ("Adi�s");
        
        a.add("Hasta Luego");
//        a.add(1);
        for (Object o: a){
            System.out.println(o);
        }
       
        System.out.println("ArrayList------------");
          ArrayList b = new ArrayList();
        b.add("Hola");
        b.add ("Adi�s");
        b.add("Hasta Luego");
        for (Object o: b){
            System.out.println(o);
        }
       
       

    }
   

}
