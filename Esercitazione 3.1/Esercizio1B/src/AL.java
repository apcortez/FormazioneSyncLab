import java.util.*;
public class AL {

    /**
     ArrayList è uguale all'implementazione di LinkedList in questo caso
     cambia solo il modo di archiviazione.
     ArrayList usa un array dinamico per archiviare gli elementi
     LinkedList utilizza una doppia lista linkata all'archivio degli elementi
     **/

    public static ArrayList<Integer>creaRandom(int n,int max){

        ArrayList<Integer> l = new ArrayList<Integer>();
        int contatore =  0;
        while(contatore<n) {
            int numero = (int)(Math.random() * max-1);
            l.add(numero);
            contatore++;
        }

        return l;
    }


    public static void stampa(Iterator<Integer> i) {

        while(i.hasNext()) {
            System.out.print("<" + i.next() + ">,");
            ;
        }
    }


    public static void provaEx1() {
        ArrayList l = creaRandom(20,20);

        Iterator<Integer> i = l.iterator();
        stampa(i);

    }
}
