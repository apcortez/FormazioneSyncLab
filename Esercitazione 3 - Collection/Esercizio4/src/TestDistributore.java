import java.util.*;
public class TestDistributore {

    public static void main(String[] args) {
        Distributore d = new Distributore();
        Bevanda b; Tessera t;
        Scanner input = new Scanner(System.in);
        int scelta, scelta2; char c = 'A'; String nome; float prezzo; char risp; int colonna = 1;int lattine; char i;
        float credito; boolean random = false;
        int tesseraId;
    do{ System.out.println("----------DISTRIBUTORE BEVANDA-----------");
        System.out.println("Inserisci il numero della scelta: \n1 - Gestione Distributore \n2 - Gestione Tessere \n3 - Compra bevanda \n0 - TERMINARE");
        try { scelta = input.nextInt();
            switch(scelta){
                case 1 :do{ System.out.println("----------GESTIONE DISTRIBUTORE-----------");
                        try{System.out.println("Inserisci il numero della scelta: \n1 - Inserisci Colonna \n2 - Aggiorna Colonna \n3 - Visualizza totale lattine disponibili \n0 - TERMINARE");
                         scelta2 = input.nextInt();
                          switch(scelta2){
                            case 1: System.out.println("Inserisci nome bevanda: ");
                                nome = input.next();
                                System.out.println("Inserisci prezzo: ");
                                prezzo = input.nextFloat();
                                b = new Bevanda(c,nome,prezzo);
                                d.aggiungiBevanda(b);
                                d.aggiornaColonna(colonna,b,10);
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
                            case 3: d.visualizzaLattine2();
                                System.out.println("Inserisci il codice della bevanda per visualizzare il numero di lattine disponibili: ");
                                i = input.next().toUpperCase().charAt(0);
                                System.out.println(d.getBevandaFromCodice(i).getNome() + ": " + d.lattineDisponibili(i));
                                break;
                            default: if(scelta2!=0){System.out.println("Scelta non trovata");}
                          }
                         }catch (Exception e){System.out.println("Input non valido"); break;}
                        }while (scelta2 !=0);
                        break;
                case 2 : do{  System.out.println("----------GESTIONE TESSERA-----------");
                         System.out.println("Inserisci il numero della scelta: \n1 - Nuova tessera \n2 - Carica tessera \n3 - Visualizza credito \n0 - per terminare");
                         try { scelta2 = input.nextInt();
                            switch(scelta2){
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
                                System.out.println("Credito: "+d.leggiCredito(tesseraId));
                                break;
                            default: if(scelta!=0){System.out.println("Scelta non trovata"); }
                            }
                         }catch (Exception e){System.out.println("Input non valido"); break;}
                        }while (scelta2 !=0);
                        break;
                case 3 :d.visualizza();
                        System.out.println("Inserisci il codice della tessera: ");
                        tesseraId = input.nextInt();
                        credito = d.leggiCredito(tesseraId);
                        System.out.println("Inserisci la colonna della bevanda selezionata: ");
                        colonna = input.nextInt();
                        System.out.println("Inserisci il codice della bevanda selezionata: ");
                        i = input.next().toUpperCase().charAt(0);
                        if(credito>= d.getBevandaFromCodice(i).getPrezzo())
                        { if(d.lattineDisponibili(i)>0) {
                            System.out.println("Bevanda " + d.getBevandaFromCodice(i).getNome() + " comprata con successo");
                            d.erogaTessera(tesseraId, d.getBevandaFromCodice(i).getPrezzo());
                            d.aggiornaColonna(colonna, d.getBevandaFromCodice(i), d.lattineDisponibili(i) - 1);
                        }else System.out.println("Attenzione: lattina bevanda mancante");
                        }else{System.out.println("Attenzione: Credito non sufficiente");}
                        break;
                default: if(scelta!=0){System.out.println("Scelta non trovata");}
                
                
            }
            
        }catch (Exception e){System.out.println("Input non valido"); break;}

    }while (scelta !=0);

    }
}
