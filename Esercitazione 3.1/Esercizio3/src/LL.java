import java.util.*;
public class LL {
    public static LinkedList<Integer>creaRandomCrescente(int n){

        LinkedList<Integer> l = new LinkedList<Integer>();
        int c = (int)(Math.random()*100);
        int contatore = 0;
        while(contatore<n) {
            int d = (int)(Math.random() * 100);
            c = c + d;
            l.add(c);
            contatore++;
        }
        return l;
    }

    public static LinkedList<Integer>mergeOrdinato(Iterator<Integer>a,Iterator<Integer>b){

        LinkedList<Integer> merge = new LinkedList<Integer>();

        int contatore1 = 0;

        while(a.hasNext()) {
            merge.add(contatore1,a.next());
            contatore1++;
            if(!a.hasNext()) {
                while(b.hasNext()) {
                    merge.add(contatore1,b.next());
                    contatore1++;}
            }
        }
        Collections.sort(merge);
        return merge;

    }


    public static void provaEx3() {
        LinkedList<Integer> lista1;
        LinkedList<Integer> lista2;

        lista1 = creaRandomCrescente(10);
        lista2 = creaRandomCrescente(10);
        System.out.println("Lista 1 : ");

        for (int i = 0;i<lista1.size();i++)
            System.out.print(lista1.get(i) + " ");

        System.out.println();
        System.out.println("Lista 2 : ");

        for (int i = 0;i<lista2.size();i++)
            System.out.print(lista2.get(i) + " ");

        Iterator<Integer> a = lista1.iterator();
        Iterator<Integer> b = lista2.iterator();

        LinkedList<Integer> ordinata =mergeOrdinato(a,b);


        System.out.println();
        System.out.println("Lista concatenata ordinata : ");

        for (int i = 0;i<ordinata.size();i++)
            System.out.print(ordinata.get(i) + " ");


    }

}
