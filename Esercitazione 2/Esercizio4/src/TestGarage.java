public class TestGarage {

    public static void main(String[] args) {
        Vehicle[] v = new Vehicle[6];

        v[0] = new Car("AS123", "Ford", "Car", false, "WAGON");

        v[1] = new Car("DS1001", "Jeep", "Car", true, "SUV");

        v[2] = new Car("PQ7654", "Ferrari", "Car", true, "SPORT");


        v[3] = new Motorcycle("FD3234", "Honda", "Moto", false, 190);

        v[4] = new Motorcycle("DX3421", "Kawasaki", "Moto", false, 80);

        v[5] = new Motorcycle("DSQ324", "Hyundai", "Moto", true, 40);

        printrepair(v);

    }

    public static void printrepair(Vehicle[] v) {
        System.out.println("-----COSTI DI RIPARAZIONE------");
        Garage g = new Garage();
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i].getTarga() + " costo: " + g.repair(v[i])+ "€");
            if(v[i].isGuasto()){
                System.out.println("Veicolo in fase di riparazione");
                System.out.println();
                v[i].setGuasto(false);
        }
            System.out.println();
        }

    }

}