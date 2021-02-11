public class Stagista extends Person {
    private int numberOfPresence;
    private int idNumber;

    public Stagista(String cf, String surename, String name, int tax_code, String city,
                    int numberOfPresence, int idNumber){
        super(cf, surename, name, tax_code, city);
        this.numberOfPresence = numberOfPresence;
        this.idNumber = idNumber;
    }

    public int getNumberOfPresence() {
        return numberOfPresence;
    }

    public int getIdNumber(){
        return idNumber;
    }

    public void setNumberOfPresence(){
        this.numberOfPresence = numberOfPresence;
    }
    public void setIdNumber(int idNumber){
        this.idNumber = idNumber;
    }
}
