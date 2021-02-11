public class Garage {
    private double costo;

    public double repair(Vehicle v){
      if(v.isGuasto()) {

          if (v.getModello().equals("Car")) {
              switch (((Car) v).getTipologia()) {
                  case "UTILITARIA":
                      costo = 150;
                      break;
                  case "SUV":
                      costo = 500;
                      break;
                  case "WAGON":
                      costo = 300;
                      break;
                  case "SPORT":
                      costo = 1500;
                      break;
              }
          }
          if (v.getModello().equals("Moto")) {
              if (((Motorcycle) v).getCilindrata() < 60) {
                  costo = 100;
              }
              if (((Motorcycle) v).getCilindrata() > 300) {
                  costo = 1000;
              } else costo = 250;

          }
      } else costo = 30;
    return costo;

    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }
}
