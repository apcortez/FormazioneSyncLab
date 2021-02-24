import java.util.*;
public class LL {


    public static LinkedList<Integer> creaRandom(int n, int max){

        LinkedList<Integer> l = new LinkedList<Integer>();
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

        }
    }
    public static void provaEx1() {
        LinkedList l = creaRandom(20,20);

        Iterator<Integer> i = l.iterator();
        stampa(i);

    }



}
