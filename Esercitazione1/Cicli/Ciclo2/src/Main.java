import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dammi quanti numeri vuoi ispezionare: ");
        int dim =input.nextInt();
        int contatore =0;
        int media=0;
        int numero;
        System.out.println("Dammi i numeri interi da ispezionare: ");
        for (int i = 0; i < dim; i++) {
            System.out.println("Dammi un numero: ");
            numero = input.nextInt();
            if(numero%3==0){
                contatore++;
                media = media + numero;
            }

        }
        if(contatore>0){
            System.out.println("La media dei numeri divisibili per 3 è "+ media/contatore);
        }
    }
}




