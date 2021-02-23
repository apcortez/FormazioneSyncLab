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

    public boolean equals(Tessera tessera) {
        if(this.codice == tessera.getCodice())
            return true;
        return false;
    }

    public String toString(){
        return "Codice: " + this.codice + " Credito : " + this.credito;
    }
}
