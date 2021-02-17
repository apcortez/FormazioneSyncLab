import java.util.*;
public class TestDistributore {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList D = new ArrayList(2);
        D.add(new Distributore("Milano","Rossi","benzina",1000));
        D.add(new Distributore("Milano", "Rossi", "diesel", 250));
        D.add(new Distributore("Roma", "Nero", "benzina",5000));
        D.add(new Distributore("Milano", "Nero", "GPL", 500));
        D.add(new Distributore("Milano", "Bianchi", "GPL", 300));
        D.add(new Distributore("Monza", "Giallo", "diesel", 5000));
        D.add(new Distributore("Roma", "Giallo", "GPL", 1200));
        D.add(new Distributore("Milano", "Lilla", "diesel", 500));
        D.add(new Distributore("Monza", "Orange", "benzina", 12000));
        int dis, scelta; double r;
        System.out.println("Seleziona il distributore: ");
        for(int i =0; i<D.size(); i++){
            System.out.println((i+1) +" - "+ ((Distributore)D.get(i)).getProprietario()+ " - tipo: " +((Distributore)D.get(i)).getTipo_carburante());
            }
        try {
            dis = input.nextInt();
            dis--;
            System.out.println();
            do {
                System.out.println("Seleziona una scelta: \n1 - Rifornimento  \n2 - Rifornimento pompa \n3 - Comparazione capacità serbatoi \n4 - Incasso giornaliero \n0 - Terminare");
                scelta = input.nextInt();
                switch (scelta) {
                    case 1:
                        System.out.println("Inserisci numero di litri da prelevare: ");
                        System.out.println("Disponibilità attuale pompa: " + ((Distributore) D.get(dis)).getPompa().getDisponibilità());
                        r = ((Distributore) D.get(dis)).servizio(input.nextDouble());
                        System.out.println("Costo rifornimento: " + r + "€");
                        //((Distributore) D.get(dis)).setIncasso(r);
                        break;
                    case 2:
                        System.out.println("Capacità: " + ((Distributore) D.get(dis)).getPompa().getCapacità() + "litri");
                        System.out.println("Disponibilità attuale: " + ((Distributore) D.get(dis)).getPompa().getDisponibilità() + "litri");
                        System.out.println("Inserisci la quantità di litri da aggiungere: ");
                        double a = input.nextDouble();
                        if(a<=(((Distributore) D.get(dis)).getPompa().getCapacità()-((Distributore) D.get(dis)).getPompa().getDisponibilità())) {
                            ((Distributore) D.get(dis)).Aggiungi(a);
                            ((Distributore) D.get(dis)).getPompa().aggiungi(a);
                        }
                        else System.out.println("Error: la quantità che si vuole acquistare è maggiore della capacità massima");
                        break;
                    case 3:
                        Distributore D1 = (Distributore) D.get(dis);
                        for (int j = 0; j < D.size(); j++) {
                            if (j != dis) { ;
                                Distributore D2 = (Distributore) D.get(j);
                                if ((!(D1.getProprietario().equals(D2.getProprietario()))) && (D1.getTipo_carburante().equals(D2.getTipo_carburante()))){
                                    if(D1.compareTo(D2) > 0 ){
                                    System.out.println(D1.getProprietario() + " ha più "+ D1.getTipo_carburante()+" di " + D2.getProprietario());
                                    }else System.out.println(D1.getProprietario() + " ha meno "+ D1.getTipo_carburante()+" di " + D2.getProprietario());
                                System.out.println(D1.getProprietario()+ ": "+D1.getPompa().getCapacità()+" || "+ D2.getProprietario()+ ": "+D2.getPompa().getCapacità());
                                System.out.println();
                                }
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Incasso totale di oggi: " + ((Distributore) D.get(dis)).incassoGiornaliero());
                        break;
                    default:
                        if (scelta != 0 && scelta > 3) {
                            System.out.println("Scelta non trovata");
                        }
                }System.out.println();
            } while (scelta != 0);
        }catch (Exception e){System.out.println("Errore! Input inserito non corretto");}
    }
}
