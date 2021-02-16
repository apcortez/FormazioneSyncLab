abstract class Figura {
    abstract double area();
    protected  double altezza;
    public double volume(){
        return altezza*area();
    }

    public void stampaArea(){
        System.out.println("Area: "+area());
    }

    public void stampaVolume(){
        System.out.println("Volume: "+volume() );
    }
}
