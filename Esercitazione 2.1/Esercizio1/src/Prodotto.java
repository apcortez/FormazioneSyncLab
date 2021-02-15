import java.lang.*;
public class Prodotto {
    private int codice;
    private String descrizione;
    private double prezzo;
    private int sconto =5;
    public Prodotto(){

    }

    public Prodotto(int codice, String descrizione, double prezzo){
    this.codice = codice;
    this.descrizione = descrizione;
    this.prezzo = prezzo;
    }

    public int getCodice() {
        return codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getSconto() {
        return sconto;
    }

    public void setSconto(int sconto) {
        this.sconto = sconto;
    }

    public double applicaSconto(){
        double prezzo_sconto = prezzo*sconto/100;
        prezzo = prezzo-prezzo_sconto;
        return prezzo;
    }



}
