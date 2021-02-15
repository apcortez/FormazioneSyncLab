import java.time.LocalDate;
import java.util.*;
public class ListaSpesa {
    public static void main(String[] args) throws InputMismatchException, NullPointerException {
    Scanner input = new Scanner(System.in);
    double tot1 = 0, tot2 =0;
    System.out.println("Quanti sono gli articoli nel tuo carello?");
    int r = input.nextInt();
    if(r>0) {
        System.out.println("Quanti sono gli articoli alimentari?");
        int a = input.nextInt();
        Prodotto[] p = new Prodotto[r];

        try {
            for (int i = 0; i < a; i++) {

             System.out.println("Informazioni prodotto:");
             System.out.println("codice: ");
             int c = input.nextInt();
             System.out.println("descrizione: ");
             String d = input.next();
             System.out.println("prezzo: ");
             double pr = input.nextDouble();
             System.out.println("Scadenza: yyyy-mm-gg");
             String s = input.next();
             LocalDate ss = LocalDate.parse(s);
             System.out.println(ss);
             java.util.Date scadenza= java.sql.Date.valueOf(ss);
             p[i] = new Alimentare(c, d, pr, scadenza);
             tot1 = tot1 + p[i].applicaSconto();
         }


        for(int i =a; i<r;i++){
            System.out.println("Informazioni prodotto:");
            System.out.println("codice: ");
            int c = input.nextInt();
            System.out.println("descrizione: ");
            String d = input.next();
            System.out.println("prezzo: ");
            double pr = input.nextDouble();
            System.out.println("materiale: ");
            String m = input.next();
            p[i]= new NonAlimentare(c,d,pr,m);
            tot2 = tot2 + p[i].applicaSconto();

        }
        double totale = tot1+tot2;
        System.out.println("Il totale del tuo carello è "+ totale);
        } catch (Exception e){
            System.out.println("Dato errato. Riesegui il programma");}
    } else System.out.println("Hai inserito il numero degli articoli errati");


    }

}
