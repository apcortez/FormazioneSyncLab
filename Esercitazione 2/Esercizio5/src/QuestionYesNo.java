public class QuestionYesNo extends Question {


    final String one ="si";
    final String two  ="no";

    public QuestionYesNo(String domanda, String risposta, int punteggio){
        super(domanda,risposta, punteggio);

    }


    @Override
    public int ask(String r) {
        if(getRisposta().equals(one)){
           if (r.equals(one)){
               setPunteggio(1);
           } else setPunteggio(0);
        }
        if(getRisposta().equals(two)){
            if(r.equals(two)){
                setPunteggio(1);
            }else setPunteggio(0);
        }
        return getPunteggio();
    }

}
