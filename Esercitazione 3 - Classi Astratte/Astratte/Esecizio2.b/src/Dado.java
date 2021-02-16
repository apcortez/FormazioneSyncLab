public class Dado extends oggettoLanciato {
    public Dado(){

    }

    @Override
    void lancio() {
        n = 1 +(int) (Math.random()*6);
    }
}
