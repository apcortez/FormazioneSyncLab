public class Vehicle {
    private String targa;
    private String marca;
    private int modello;
    private boolean guasto;

    public Vehicle(){
        targa = null;
        marca = null;
        modello = 0;
        guasto = false;
    }

    public Vehicle(String targa, String marca, int modello, boolean guasto){
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.guasto = guasto;
    }

    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public int getModello() {
        return modello;
    }

    public boolean isGuasto() {
        return guasto;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(int modello) {
        this.modello = modello;
    }

    public void setGuasto(boolean set) {
        this.guasto = guasto;
    }
}
