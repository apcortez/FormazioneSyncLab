import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dammi una stringa: ");
        String stringa = input.nextLine().toLowerCase(Locale.ROOT);
        String vocali ="";
        for (int i =0; i< stringa.length(); i++){
            switch (stringa.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vocali = vocali + stringa.charAt(i);
            }

            }
        System.out.println(vocali);
        }

    }

