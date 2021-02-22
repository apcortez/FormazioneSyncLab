import java.util.*;
public class TestDistributore {

    public static void main(String[] args) {
        Distributore d = new Distributore();
        Bevanda b;
        Scanner input = new Scanner(System.in);
        int scelta; char c = 'A'; String nome; float prezzo; char risp;
    do{
        System.out.println("Inserisci il numero della scelta: \n1 - Visualizzare bevande \n2 - Aggiungi bevanda \n3 - Seleziona bevanda\n0 - per terminare");
        try { scelta = input.nextInt();
            switch(scelta){
                case 1: d.visualizza();
                        break;
                case 2: System.out.println("Inserisci nome bevanda: ");
                        nome = input.next();
                        System.out.println("Inserisci prezzo: ");
                        prezzo = input.nextFloat();
                        b = new Bevanda(c,nome,prezzo);
                        d.aggiungiBevanda(b);
                        c++;
                        break;
                case 3: System.out.println("Seleziona il codice della bevanda: ");
                        d.visualizza();
                        risp = input.next().toUpperCase().charAt(0);
                        d.getBevandaFromCodice(risp);
                default: if(scelta!=0){System.out.println("Scelta non trovata");}
                
                
            }
            
        }catch (Exception e){System.out.println("Input non valido"); break;}

    }while (scelta !=0);

    }
}
