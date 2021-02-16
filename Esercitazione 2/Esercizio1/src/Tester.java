import java.awt.*;
import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        Stagista[] s = new Stagista[3];

        s[0] = new Stagista("RSSNDR00A01F205V", "Rossi", "Andrea", 20123, "Milano",
                13, 9999);

        s[1] = new Stagista("NRENNA90E41F704U", "Nero", "Anna", 20900, "Monza",
                0, 1111);

        s[2] = new Stagista("BNCTNO98A01H501P", "Bianchi", "Toni", 3000, "Roma",
                39, 00001);

        stampa(s);
    }
    public static void stampa(Stagista[] s){
        int max =0;
        for (int i = 0; i< s.length;i++) {
            System.out.println(s[i].getSurename()+ " " + s[i].getBirthyear());
            if (s[i].getBirthyear()<s[max].getBirthyear()){
                max =i;
            }
        }
        System.out.println("Il più vecchio di tutti è "+ s[max].getSurename()+
                " nato nel "+ s[max].getBirthyear());
    }
}


