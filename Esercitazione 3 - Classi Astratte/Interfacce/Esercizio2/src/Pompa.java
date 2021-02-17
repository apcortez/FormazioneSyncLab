public class Pompa {
    private double disponibilità;
    private double capacità;

    public Pompa(double capacità) {
        this.capacità = capacità;
        this.disponibilità = capacità;
    }


    public double getDisponibilità() {
        return disponibilità;
    }

    public double getCapacità() {
        return capacità;
    }


    public void setDisponibilità(double disponibilità) {
        this.disponibilità = disponibilità;
    }

    public void setCapacità(double capacità) {
        this.capacità = capacità;
    }

    public void aggiungi(double c){
        disponibilità = disponibilità+c;
    }
}
