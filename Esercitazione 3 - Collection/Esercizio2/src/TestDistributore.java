import java.util.*;
public class TestDistributore {

    public static void main(String[] args) {
        Distributore d = new Distributore();
        Tessera t;
        Scanner input = new Scanner(System.in);
        int scelta; float credito; boolean random = false;
        int tesseraId;
    do{
        System.out.println("Inserisci il numero della scelta: \n1 - Nuova tessera \n2 - Carica tessera \n3 - Visualizza credito \n0 - per terminare");
        try { scelta = input.nextInt();
            switch(scelta){
                            case 1: Random r = new Random();
                                    System.out.println("Inserisci l'importo che vuoi caricare nella tessera: ");
                                    credito = input.nextFloat();
                                    do {
                                    int n = r.nextInt(1000);
                                    n +=1;
                                    t = new Tessera(n,credito);
                                    random = d.aggiungiTessera(n,t);
                                    }while(random = false);
                                    break;
                            case 2: System.out.println("Inserisci il codice della tessera: ");
                                    try{ tesseraId = input.nextInt();
                                    System.out.println("Inserisci l'importo da caricare: ");
                                    credito =input.nextFloat();
                                    d.caricaTessera(tesseraId,credito);}
                                    catch (TesseraNonValidaException ee){
                                       System.out.println("Codice tessera non valida");
                                    }
                                    break;
                            case 3: System.out.println("Inserisci il codice della tessera: ");
                                    tesseraId = input.nextInt();
                                    d.leggiCredito(tesseraId);
                                    break;
                             default: if(scelta!=0){System.out.println("Scelta non trovata"); }
                }
            
        }catch (Exception e){System.out.println("Input non valido"); break;}

    }while (scelta !=0);

    }
}
