
import java.time.LocalDate;
import java.util.*;

public class Alimentare extends Prodotto{
    private LocalDate o = LocalDate.now();

    private java.util.Date oggi = java.sql.Date.valueOf(o);
    private Date scadenza = new Date();

    public Alimentare(){

    }

    public Alimentare(int codice, String descrizione, double prezzo, Date scadenza){
        super(codice,descrizione,prezzo);
        this.scadenza = scadenza;

    }

    public Date getScadenza() {
        return scadenza;
    }


    @Override
    public double applicaSconto() {
        double prezzo_sconto = 0;
        if(oggi.before(getScadenza())){
            long differenza_mill = getScadenza().getTime() - oggi.getTime();
            long differenza_gg = (differenza_mill /(1000*60*60*24))%365;
            System.out.println("Il prodotto scade tra "+differenza_gg+ " giorni");
            if (differenza_gg<10) {
                setSconto(20);
            }else setSconto(5);
        }
            System.out.println("Sconto applicato: "+ getSconto()+"%");
            System.out.println();
            prezzo_sconto = getPrezzo() * getSconto()/100;
        double prezzo_scontato = getPrezzo()-prezzo_sconto;
        return prezzo_scontato;
    }
}

