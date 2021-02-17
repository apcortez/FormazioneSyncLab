public class Distributore implements Comparable {
    private String città;
    private String proprietario;
    private String tipo_carburante;
    private Pompa pompa;
    private double incasso;
    private double spesa;
    private double costo_litro =1.5;

    public Distributore(String  città, String proprietario, String tipo_carburante, double capacità){
    this.città = città;
    this.proprietario = proprietario;
    this.tipo_carburante = tipo_carburante;
    this.pompa = new Pompa(capacità);
    }

    public String getCittà() {
        return città;
    }

    public String getProprietario() {
        return proprietario;
    }

    public String getTipo_carburante() {
        return tipo_carburante;
    }

    public Pompa getPompa() {
        return pompa;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public void setTipo_carburante(String tipo_carburante) {
        this.tipo_carburante = tipo_carburante;
    }

    public void setPompa(Pompa pompa) {
        this.pompa = pompa;
    }

    public double getIncasso() {
        return incasso;
    }

    public void setIncasso(double incasso) {
        this.incasso = incasso;
    }

    public double servizio(double n){
        double x;
        if(n <=pompa.getCapacità() && n <=pompa.getDisponibilità()){
            x = (pompa.getDisponibilità())-n;
            pompa.setDisponibilità(x);
            incasso = incasso+(costo_litro*n);
            return costo_litro*n;
        } else{
            System.out.println("Attenzione: scarsa disponibilità");
            System.out.println("Verranno erogati "+pompa.getDisponibilità()+ " litri");
            double tmp =pompa.getDisponibilità()*costo_litro;
            incasso = incasso+ tmp;
            pompa.setDisponibilità(0);
            return tmp;
        }

    }

    public void Aggiungi(double n){
        //supponiamo che il costo al litro sia 0.5
        spesa = spesa + (n*0.5);
        System.out.println("Sono stati aggiunti con successo "+n+ " litri");
    }
    public double incassoGiornaliero(){
        incasso = incasso - spesa;
        return incasso;
    }

    @Override
    public double compareTo(Distributore x) {
        return (this.pompa.getCapacità() - x.pompa.getCapacità());
    }
}
