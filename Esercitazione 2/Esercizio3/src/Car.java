public class Car extends Vehicle {
    private String tipologia;

    public Car(String targa, String marca, int modello, boolean guasto, String tipologia){
        super(targa, marca, modello, guasto);
        this.tipologia = tipologia;
    }
    public Car(){

    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }
}
