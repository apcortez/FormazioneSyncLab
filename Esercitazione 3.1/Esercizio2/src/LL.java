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
        System.out.println("Risultato creaRandom: ");
        for(int i = 0;i<l.size();i++)
            System.out.print("<" + l.get(i)+ "> ");
        return l;
    }


    public static LinkedList<Integer>parseString(LinkedList<String>a){
        LinkedList<Integer> l = new LinkedList<Integer>();
        int b = 0;
        for(int i = 0;i<a.size();i++) {
            b = Integer.parseInt(a.get(i));
            l.add(b);}
        System.out.println("\n" + "Risultato parseString : " );
        for(int j = 0;j<l.size();j++)
            System.out.print("<"+ l.get(j) + "> ");
        return l;
    }



    public static void provaEx2(){
        int n = 10;
        creaRandomCrescente(10);

       try {
           LinkedList<String> a = new LinkedList();
           a.add("1");
           a.add("10");
           a.add("27");
           a.add("30");
           a.add("31");
           a.add("52");
           a.add("66");
           a.add("99");
           a.add("100");
           a.add("150");
           //Eccezione: Parte2-b
           //a.add("prova");
           parseString(a);
       }catch (NumberFormatException e){System.out.println();
           System.out.println("Errore: input inserito non è un intero");}
    }


}
