import java.util.*;
public class TestDistributore {

    public static void main(String[] args) {
        Distributore d = new Distributore();
        Bevanda b;
        Scanner input = new Scanner(System.in);
        int scelta; char c = 'A'; String nome; float prezzo; char risp; int colonna = 1;int lattine; char i;
    do{ System.out.println("----------GESTIONE LATTINE-----------");
        System.out.println("Inserisci il numero della scelta: \n1 - Inserisci Colonna \n2 - Aggiorna Colonna \n3 - Visualizza totale lattine disponibili \n0 - TERMINARE");
        try { scelta = input.nextInt();
            switch(scelta){
                case 1: System.out.println("Inserisci nome bevanda: ");
                        nome = input.next();
                        System.out.println("Inserisci prezzo: ");
                        prezzo = input.nextFloat();
                        b = new Bevanda(c,nome,prezzo);
                        d.aggiungiBevanda(b);
                        d.aggiornaColonna(colonna,b,0);
                        colonna++;
                        c++;
                        break;
                case 2: d.visualizzaLattine();
                        System.out.println("Inserisci la colonna da modificare: ");
                        colonna = input.nextInt();
                        System.out.println("Inserisci il codice della bevanda: ");
                        i = input.next().toUpperCase().charAt(0);
                        System.out.println("Inserisci il nuovo numero di lattine disponibili");
                        lattine = input.nextInt();
                        d.aggiornaColonna(colonna, d.getBevandaFromCodice(i), lattine);
                        break;
                case 3: d.visualizzaLattine();
                        System.out.println("Inserisci il codice della bevanda per visualizzare il numero di lattine disponibili: ");
                        i = input.next().toUpperCase().charAt(0);
                        System.out.println(d.getBevandaFromCodice(i).getNome() + ": " + d.lattineDisponibili(i));
                        break;
                default: if(scelta!=0){System.out.println("Scelta non trovata");}
                
                
            }
            
        }catch (Exception e){System.out.println("Input non valido"); break;}

    }while (scelta !=0);

    }
}
