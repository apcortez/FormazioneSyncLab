import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dammi una stringa: ");
        String stringa = input.nextLine();
        char lettera;
        String inversa = "";
        for (int i =stringa.length()-1; i>=0; i--){
            lettera=stringa.charAt(i);

            inversa = inversa + lettera;

        }
        System.out.println(inversa);
    }

}