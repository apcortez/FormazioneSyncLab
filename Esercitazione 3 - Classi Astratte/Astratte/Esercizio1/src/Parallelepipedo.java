public class Parallelepipedo extends Figura{
    private double perimetro;
    public Parallelepipedo(){
        perimetro =0;
        altezza =0;
    }
    public Parallelepipedo(double perimetro, double altezza){
        this.altezza = altezza;
        this.perimetro = perimetro;
    }

    @Override
    double area() {
        return perimetro*altezza;
    }
}
