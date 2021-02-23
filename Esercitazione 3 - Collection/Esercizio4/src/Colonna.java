public class Colonna {
    private int lattine;
    private Bevanda bevanda;
    public Colonna(){
        super();
    }

    public Colonna(Bevanda bevanda, int lattine){
        super();
        this.bevanda = bevanda;
        this.lattine = lattine;
    }

    public Bevanda getBevanda() {
        return bevanda;
    }

    public int getLattine() {
        return lattine;
    }

    public void setBevanda(Bevanda bevanda) {
        this.bevanda = bevanda;
    }

    public void setLattine(int lattine) {
        this.lattine = lattine;
    }

    public String toString(){
        return this.bevanda.toString() + ", lattine disponibili: "+ this.lattine;    }
}
