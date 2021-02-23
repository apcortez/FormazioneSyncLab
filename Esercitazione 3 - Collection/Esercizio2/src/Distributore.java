import java.util.*;
public class Distributore {
    private Map<Integer, Tessera>tessere;

    public Distributore(){
        this.tessere = new HashMap<Integer, Tessera>();
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
    public boolean aggiungiTessera(int codice, Tessera tessera){
        if(!tessere.containsKey(codice)){
            tessere.put(tessera.getCodice(),tessera);
            System.out.println("Nuova tessera id "+ tessera.getCodice()+ " creata.");
            return true;}
        else return false;
    }

    public void leggiCredito(int codice) throws TesseraNonValidaException {
        if (tessere.containsKey(codice)){
            System.out.println(tessere.get(codice));
        } else throw new TesseraNonValidaException("Codice tessera non valida");
    }
}

