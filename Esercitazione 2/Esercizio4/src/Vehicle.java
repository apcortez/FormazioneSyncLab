public class Vehicle {
    private String targa;
    private String marca;
    private String modello;
    private boolean guasto;

    public Vehicle(){
        targa = null;
        marca = null;
        modello = null;
        guasto = false;
    }

    public Vehicle(String targa, String marca, String modello, boolean guasto){
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

    public String getModello() {
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

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setGuasto(boolean set) {
        this.guasto = guasto;
    }

}
