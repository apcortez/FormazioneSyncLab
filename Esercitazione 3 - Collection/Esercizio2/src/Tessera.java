public class Tessera{
    private int codice;
    private float credito;

    public Tessera(){
        super();
    }

    public Tessera(int codice, float credito){
        super();
        this.codice = codice;
        this.credito = credito;
    }

    public int getCodice() {
        return codice;
    }

    public float getCredito() {
        return credito;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }

}
