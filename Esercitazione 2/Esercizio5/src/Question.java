public class Question {
    private String domanda;
    private String risposta;
    private int punteggio;

    public Question(){

    }

    public Question(String domanda, String risposta, int punteggio){
        this.domanda = domanda;
        this.risposta = risposta;
        this.punteggio = punteggio;
    }

    public String getDomanda(){
        return domanda;
    }

    public String getRisposta(){
        return risposta;
    }

    public int getPunteggio(){
        return punteggio;
    }

    public void setDomanda(String domanda) {
        this.domanda = domanda;
    }

    public void setRisposta(String risposta) {
        this.risposta = risposta;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    public int ask(String r){
        System.out.println(domanda);
        if(r == risposta){
            punteggio =1;
        }
        else punteggio =0;
    return punteggio;

    }
}
