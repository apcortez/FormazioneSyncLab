import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dammi una sequenza di 5 stringhe: ");
        String[] sequenza = new String[5];
        int contatore = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Dammi una stringa: ");
            sequenza[i] = input.nextLine();

            if (Character.isUpperCase(sequenza[i].charAt(0)))
                contatore = contatore + sequenza[i].length();
        }
        System.out.println(contatore);
    }
}




