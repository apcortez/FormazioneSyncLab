import java.util.*;
public class TestOperazione {
        public static void main (String args []) {
            Scanner input=new Scanner (System.in);
            int risp = 1;
            try{
                while(risp !=0){
                    System.out.println("Quale operazione vuoi eseguire");
                    System.out.println("1 - Addizione \n2 - Sottrazione \n3 - Moltiplicazione \n4 - Divisione \n0 - Per terminare");
                    risp=input.nextInt();
                    if(risp==0){ break; }
                    System.out.println("Inserisci il primo numero: ");
                    int x = input.nextInt();
                    System.out.println("Inserisci il secondo numero: ");
                    int y = input.nextInt();
                    Operazione a;
                    switch (risp){
                        case 1: a = new Addizione();
                                a.operazione(x,y);
                                break;
                        case 2: a = new Sottrazione();
                                a.operazione(x,y);
                                break;
                        case 3: a = new Moltiplicazione();
                                a.operazione(x,y);
                                break;
                        case 4: a = new Divisione();
                            a.operazione(x,y);
                                break;
                        default: if(risp !=0) System.out.println("Operazione non trovata riprovare!");
                    }

                }while (risp !=0);
            }catch(Exception e){System.out.println("Errore nell'inserimento del dato."); }
        }
    }


