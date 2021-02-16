public class Dado {
    private int n;
    public Dado(){

    }
    public void lancio(){
        n = (1+ (int)(Math.random()*6));
    }

    public int getN() {
        return n;
    }
}

