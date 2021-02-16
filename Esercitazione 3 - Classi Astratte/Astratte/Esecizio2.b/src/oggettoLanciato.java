public abstract class oggettoLanciato {
    protected int n;
    abstract void lancio();

    public int getN() {
        return n;
    }
    public void print(){
        System.out.println("Risultato: "+getN());
        System.out.println();
    }
}
