public class Moneta extends oggettoLanciato {
    public Moneta(){

    }
    @Override
    void lancio() {
        n = (int)(Math.random()*2);
    }
    //0 = testa e 1 = croce
}
