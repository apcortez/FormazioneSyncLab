public class NumericQuestion extends Question{
    public NumericQuestion(String domanda, String risposta, int punteggio){
        super(domanda,risposta, punteggio);
    }
    boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public int ask(String r) {
        if(tryParseInt(getRisposta())){
            if (r.equals(getRisposta())){
                setPunteggio(1);
            } else setPunteggio(0);

        }
        return getPunteggio();
    }
}
