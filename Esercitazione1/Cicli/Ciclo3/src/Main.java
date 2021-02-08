import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Chiederò 5 sequenze di carratteri");
        System.out.println("Quanti caratteri vuoi inserire in una sequenza?");
        int dim =input.nextInt();
        int volte =0;
        do {
            System.out.println("----## Valori della sequenza##-----");
            char carattere;
            for (int i = 0; i < dim; i++) {
                System.out.println("Dammi un carattere: ");
                carattere = input.next().charAt(0);
                System.out.println(carattere);

            }
            volte++;
        }while(volte<5);

        }
    }





