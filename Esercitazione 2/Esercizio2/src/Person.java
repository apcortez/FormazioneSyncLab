public class Person {
    private String cf;
    private String surename;
    private String name;
    private int tax_code;
    private String city;
    private int birthyear;

    public Person(){
        this.cf = null;
        this.surename = null;
        this.name =null;
        this.tax_code = 0;
        this.city = null;
        this.birthyear = 0;
    }

    public Person(String cf, String surename, String name, int tax_code, String city){
        this.cf = cf;
        this.surename = surename;
        this.name = name;
        this.tax_code = tax_code;
        this.city = city;

    }

    public String getCf(){
        return cf;
    }

    public String getSurename(){
        return surename;
    }

    public String getName(){
        return name;
    }

    public int getTax_code() {
        return tax_code;
    }

    public String getCity(){
        return city;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTax_code(int tax_code) {
        this.tax_code = tax_code;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getBirthyear() {
      try {
          int x = Character.getNumericValue(cf.charAt(6)) + Character.getNumericValue(cf.charAt(7));

          String y;
          if (x > 4) {
              y = "19" + cf.charAt(6) + cf.charAt(7);
          } else
              y = "20" + cf.charAt(6) + cf.charAt(7);

          birthyear = Integer.parseInt(y);
      }catch (Exception e){System.out.println("Errore mettere un codice fiscale valido.");}
        return birthyear;
    }
}
