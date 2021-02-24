import java.util.*;
public class LL {
    public static LinkedList<LinkedList<Integer>>insiemeDiInsiemi(int n){

        int c, b = 0;
        LinkedList<LinkedList<Integer>> l = new LinkedList<LinkedList<Integer>>();

        for(int i = 0; i<n;i++) {
            LinkedList<Integer> a = new LinkedList<Integer>();
            for(int j = 0; j<n;j++) {
                c = (int)(Math.random()* (b+1));
                a.add(c) ;
            }
            b++;
            l.add(a);}
        return l;}


    public static void stampa(LinkedList<LinkedList<Integer>> a) {
        int n = 1;
        for(int i = 0;i<a.size();i++) {
            LinkedList<Integer> c = a.get(i);
            System.out.println("Lista "+n+": ");
            n++;
            for(int j = 0;j<c.size();j++) {
                System.out.println(c.get(j));}
        }
    }
}
