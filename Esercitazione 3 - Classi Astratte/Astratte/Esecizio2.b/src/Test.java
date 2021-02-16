import java.util.*;
public class Test {

    public static void main (String[] args) {
        int risp;
        Scanner input = new Scanner(System.in);
        Dado d = new Dado();
        Moneta m = new Moneta();
        try{
            do{System.out.println("Scegli quale vuoi lanciare:\n1 - Dado \n2 - Moneta \n0 - Per terminare");
                risp = input.nextInt();
                switch (risp){
                    case 1: d.lancio();
                            d.print();
                            break;
                    case 2: m.lancio();
                            m.print();
                            break;
                    default: if(risp!=0){System.out.println("Scelta non trovata.");}

                }


            }while(risp !=0);
        }catch (Exception e){System.out.println("ERRORE");}
    }
}
