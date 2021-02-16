import java.util.*;
public class TestFigura {
    public static void main (String args []) {
        Scanner input=new Scanner (System.in);
        int risp;
        double raggio, altezza, perimetro;
        try{
            do {
                System.out.println("Quale figuara vuoi calcolare? Scegli un numero");
                System.out.println("1 - Cylindro \n2 - Parallelepipedo \n0 - Per terminare");
                risp=input.nextInt();
                switch (risp){
                case 1: System.out.println("Inserisci il raggio del cerchio di base del cilindro: ");
                        raggio =input.nextDouble();
                        System.out.println("Inserisci l'altezza del cilindro: ");
                        altezza = input.nextDouble();
                        Cilindro c = new Cilindro(raggio,altezza);
                        c.stampaArea();
                        c.stampaVolume();
                        break;
                case 2: System.out.println("Inserisci il perimetro di base del parallelopipedo: ");
                        perimetro = input.nextDouble();
                        System.out.println("Inserisci l'altezza del parallelepipedo: ");
                        altezza =input.nextDouble();
                        Parallelepipedo p = new Parallelepipedo(perimetro, altezza);
                        p.stampaArea();
                        p.stampaVolume();
                        break;
                default: if(risp !=0) System.out.println("Numero non valido");
            }

        }while (risp !=0);
        }catch(Exception e){System.out.println("Errore nell'inserimento del dato."); }
    }
}
