public class TestVehicle {
    public static void main(String[] args) {
        Car[] c = new Car[3];
        Motorcycle[] m = new Motorcycle[3];


        c[0] = new Car("AS123", "Ford", 130003, false, "WAGON");

        c[1] = new Car("DS1001", "Jeep", 3214, true, "SUV");

        c[2] = new Car("PQ7654", "Ferrari", 9099, true, "SPORT");


        m[0] = new Motorcycle("FD3234", "Honda", 130003, false, 190);

        m[1] = new Motorcycle("DX3421", "Kawasaki", 3214, false, 80);

        m[2] = new Motorcycle("DSQ324", "Hyundai", 9099, true, 40);

        print(c, m);
    }

    public static void print(Car[] c, Motorcycle m[]) {
        System.out.println("Le targhe dei veicoli guasti sono: ");
        for (int i = 0; i < c.length; i++) {
            if (c[i].isGuasto())
                System.out.println(c[i].getTarga());
        }
        for (int i = 0; i < m.length; i++) {
            if (m[i].isGuasto()) {
                System.out.println(m[i].getTarga());
            }
        }

    }
}