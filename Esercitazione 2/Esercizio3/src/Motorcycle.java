public class Motorcycle extends Vehicle{
    private int cilindrata;

    public Motorcycle(String targa, String marca, int modello, boolean guasto, int cilindrata){
        super(targa, marca, modello, guasto);
        this.cilindrata = cilindrata;
    }
    public Motorcycle(){

    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }
}
