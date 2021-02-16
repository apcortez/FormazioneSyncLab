public class Employee extends Person {
    private int anno_assunzione;
    private double stipendio;

    public Employee(String cf, String surename, String name, int tax_code, String city,
                    int anno_assunzione, double stipendio){
        super(cf, surename, name, tax_code, city);
        this.anno_assunzione = anno_assunzione;
        this.stipendio = stipendio;
    }

    public Employee() {

    }

    public int getAnno_assunzione() {
        return anno_assunzione;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setAnno_assunzione(int anno_assunzione) {
        this.anno_assunzione = anno_assunzione;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public boolean gainsMore(Employee e){
        if(getStipendio()>0 && getStipendio()>e.stipendio){
            return true;
        } else return false;
    }
}

