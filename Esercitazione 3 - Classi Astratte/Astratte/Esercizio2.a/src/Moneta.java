public class Moneta {
    private int n;
    public Moneta(){

    }
    public void lancio(){
        n =(int)(Math.random()*2);
    }

    public int getN() {
        return n;
    }
}
