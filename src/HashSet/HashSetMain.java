package HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author María Navarro Elbal
 */
public class HashSetMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<Alumno> l = new HashSet<>();

        Alumno a1 = new Alumno("alberto", 7);
        Alumno a2 = new Alumno("alberto", 6);
        Alumno a3 = new Alumno("alberto", 7);
        Alumno a4 = new Alumno("alberto", 7);
        Alumno a5 = new Alumno("alberto", 7);
        Alumno a6 = new Alumno("alberto", 8);

       
        l.add(a1);
        l.add(a2);
        l.add(a3);
        l.add(a4);
        l.add(a5);
        l.add(a6);
        for (Alumno a:l){
            System.out.println(a);
        }
        
        Iterator it = l.iterator();
        
        while(it.hasNext()){
            
            if(((Alumno)it.next()).getNombre().equals("Paco"))
                it.remove();;
        }
        
        
        
    }

}


