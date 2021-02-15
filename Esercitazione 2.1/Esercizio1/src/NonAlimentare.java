public class NonAlimentare extends Prodotto {
    private String materiale;

    public NonAlimentare(){

    }
    public NonAlimentare(int codice, String descrizione, double prezzo, String materiale){
        super(codice, descrizione, prezzo);
        this.materiale = materiale;
    }

    @Override
    public double applicaSconto() {
        double prezzo_sconto=0;
        switch (materiale){
            case "carta":
            case "plastica":
            case "vetro": setSconto(10);
                          break;
            default: setSconto(5);
        }
        prezzo_sconto = getPrezzo() * getSconto()/100;
        double prezzo_scontato = getPrezzo()-prezzo_sconto;
        System.out.println("Sconto applicato: "+ getSconto()+"%");
        System.out.println();
        return prezzo_scontato;
    }
}
