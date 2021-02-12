public class MultipleQuestion extends NumericQuestion {
    public int opzioni = 0;

    public MultipleQuestion(String domanda, String risposta, int punteggio, int opzioni) {
        super(domanda, risposta, punteggio);
        this.opzioni = opzioni;
    }

    public int getOpzioni() {
        return opzioni;
    }

    public void setOpzioni(int opzioni) {
        this.opzioni = opzioni;
    }

    @Override
    public int ask(String r) {
        int p = 0;
        String risp = extract(r);;
        String value = extract(getRisposta());

           for (int i = 0; i < opzioni; i++) {
                for(int j=0; j<r.length(); j++){
                    if(value.charAt(i) == risp.charAt(j)){
                        p++;
                        break;
                    }
                    }
                }

         return p;
    }

    static String extract(String r){
        r = r.replaceAll(" +", "").replaceAll("[^\\d]", "").trim();
        if (r.equals(""))
            return "0";
    return r;
    }
}