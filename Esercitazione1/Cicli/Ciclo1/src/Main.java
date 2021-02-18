
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dammi quanti numeri vuoi ispezionare: ");
       try{ int dim =input.nextInt();
        int contatore =0;
        int numero;
        System.out.println("Dammi i numeri interi da ispezionare: ");
        for (int i = 0; i < dim; i++) {
            System.out.println("Dammi un numero: ");
            numero = input.nextInt();
            if(numero%2==0){
                contatore++;
            }

        }
        if(contatore == dim){
            System.out.println("Tutti positivi e pari");
        } else System.out.println("NO");
    }catch (InputMismatchException e){
           System.out.println("Errore input: non hai messo un numero!");
       }}
}




