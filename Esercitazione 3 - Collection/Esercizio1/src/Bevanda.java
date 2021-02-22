public class Bevanda {
    private char codice;
    private String nome;
    private float prezzo;

    public Bevanda(){
        super();

    }

    public Bevanda(char codice, String nome, float prezzo){
        super();
        this.nome = nome;
        this.prezzo = prezzo;
        this.codice = codice;
    }

    public char getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setCodice(char codice) {
        this.codice = codice;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }


    public String toString(){
        return "Codice: " + this.codice + ", Nome: " + this.nome + ", Prezzo: " + this.prezzo;
    }
}
