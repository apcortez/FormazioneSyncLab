import java.util.*;
public class Distributore {
    private Map<Character, Bevanda>elenco;
    private Map<Integer, Colonna> colonne;


    public Distributore(){
        this.elenco = new HashMap<Character, Bevanda>();
        this.colonne = new HashMap<Integer, Colonna>();
    }

    public void aggiungiBevanda(Bevanda bevanda){
            elenco.put(bevanda.getCodice(),bevanda);
            System.out.println("Bevanda "+ bevanda.getNome()+ " inserita con successo.");

        }

    public void visualizza(){
        for(Character i: elenco.keySet()){
            System.out.println(elenco.get(i));
        }
    }
    public void visualizzaLattine() {
        for (Integer i : colonne.keySet()) {
            System.out.println("Colonna: "+i + " "+colonne.get(i));
        }
    }

    public Bevanda getBevandaFromCodice(char codice) throws BevandaNonValidaException {

            if (elenco.containsKey(codice)){
               return elenco.get(codice);
            } else  throw new BevandaNonValidaException("Codice non valido");
        }

    public int lattineDisponibili(char codiceBevanda){
        int lattine =0;
        for(Integer i : colonne.keySet()) {
            Colonna c = colonne.get(i);
           if(c.getBevanda().getCodice() == codiceBevanda){
               lattine = lattine+ c.getLattine();
           }
        } return lattine;
    }

    public void aggiornaColonna(int colonna, Bevanda bevanda, int lattine){
        Colonna c = new Colonna(bevanda,lattine);
    try {
        colonne.remove(colonna);
    }catch (IndexOutOfBoundsException e){}
    colonne.put(colonna, c);
    System.out.println("Colonna "+colonna+ " aggiornata con successo.");
    }


    }

