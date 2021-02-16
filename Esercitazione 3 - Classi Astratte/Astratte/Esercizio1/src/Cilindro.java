public class Cilindro extends Figura {
    private double raggio =0;
    public Cilindro() {
        raggio =0;
        altezza =0;
    }
    public Cilindro(double raggio, double altezza){
        this.raggio = raggio;
        this.altezza = altezza;
    }
    @Override
    public double area() {
        return raggio*raggio*Math.PI;
    }
}
