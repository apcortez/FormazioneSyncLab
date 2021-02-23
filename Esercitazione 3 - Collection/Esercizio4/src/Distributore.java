import java.util.*;
public class Distributore {
    private Map<Character, Bevanda> elenco;
    private Map<Integer, Colonna> colonne;
    private Map<Integer, Tessera> tessere;

    public Distributore() {
        this.elenco = new HashMap<Character, Bevanda>();
        this.colonne = new HashMap<Integer, Colonna>();
        this.tessere = new HashMap<Integer, Tessera>();
    }

    public void aggiungiBevanda(Bevanda bevanda) {
        elenco.put(bevanda.getCodice(), bevanda);
        System.out.println("Bevanda " + bevanda.getNome() + " inserita con successo.");

    }

    public void visualizza() {
        for (Integer i : colonne.keySet()) {
            System.out.println("Colonna: " + i + " " + colonne.get(i).getBevanda());
        }
    }

    public void visualizzaLattine2() {
        for (Integer i : colonne.keySet()) {
            System.out.println(colonne.get(i));
        }
    }

    public void visualizzaLattine() {
        for (Integer i : colonne.keySet()) {
            System.out.println("Colonna: " + i + " " + colonne.get(i));
        }
    }

    public Bevanda getBevandaFromCodice(char codice) throws BevandaNonValidaException {

        if (elenco.containsKey(codice)) {
            return elenco.get(codice);
        } else throw new BevandaNonValidaException("Codice non valido");
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

    public void caricaTessera(int codice, float c) throws TesseraNonValidaException {
        if(tessere.containsKey(codice)){
            Tessera t = tessere.get(codice);
            t.setCredito(t.getCredito()+c);
            tessere.put(codice,t);
            System.out.println("Credito tessera: "+t.getCredito());
        }
        else throw new TesseraNonValidaException("Tessera non valida");

    }

    public void erogaTessera(int codice, float c) throws TesseraNonValidaException {
        if(tessere.containsKey(codice)){
            Tessera t = tessere.get(codice);
            t.setCredito(t.getCredito()-c);
            tessere.put(codice,t);
            System.out.println("Credito tessera: "+t.getCredito());
        }
        else throw new TesseraNonValidaException("Tessera non valida");
    }

    public boolean aggiungiTessera(int codice, Tessera tessera){
        if(!tessere.containsKey(codice)){
            tessere.put(tessera.getCodice(),tessera);
            System.out.println("Nuova tessera id "+ tessera.getCodice()+ " creata.");
            return true;}
        else return false;
    }

    public float leggiCredito(int codice) throws TesseraNonValidaException {
        if (tessere.containsKey(codice)){
            return tessere.get(codice).getCredito();
        } else throw new TesseraNonValidaException("Codice tessera non valida");
    }

    }

