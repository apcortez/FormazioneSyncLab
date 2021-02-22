import java.util.*;
public class Distributore {
    private Map<Character, Bevanda>elenco;


    public Distributore(){
        this.elenco = new HashMap<Character, Bevanda>();

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

    public void getBevandaFromCodice(char codice) throws BevandaNonValidaException {

            if (elenco.containsKey(codice)){
                System.out.println("Hai acquistato una bevanda: "+ elenco.get(codice));
            } else  throw new BevandaNonValidaException("Codice non valido");
        }

    }

