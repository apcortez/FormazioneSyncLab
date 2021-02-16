public class TestVehicle {
    public static void main(String[] args) {
        Vehicle[] v = new Vehicle[6];


        v[0] = new Car("AS123", "Ford", 130003, false, "WAGON");

        v[1] = new Car("DS1001", "Jeep", 3214, true, "SUV");

        v[2] = new Car("PQ7654", "Ferrari", 9099, true, "SPORT");


        v[3] = new Motorcycle("FD3234", "Honda", 130003, false, 190);

        v[4] = new Motorcycle("DX3421", "Kawasaki", 3214, false, 80);

        v[5] = new Motorcycle("DSQ324", "Hyundai", 9099, true, 40);

        print(v);
    }

    public static void print(Vehicle v[]) {
        System.out.println("Le targhe dei veicoli guasti sono: ");
        for (int i = 0; i < v.length; i++) {
            if (v[i].isGuasto())
                System.out.println(v[i].getTarga());
        }

        }

    }
