import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Costruiamo la matrice");
        System.out.println("Numero di righe: ");
      try{  int righe =input.nextInt();
        System.out.println("Numero di colonne: ");
        int colonne =input.nextInt();
        int[][] A = new int[righe][colonne];
        int[][] AT= new int[colonne][righe];
        System.out.println("Riempiamo la matrice ");
        for(int i=0; i<righe; i++){
            for (int j=0; j<colonne; j++){
                System.out.println("Valore al ["+ i+"] ["+j+"]");
                A[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i<righe; i++){
            for(int j=0; j<colonne; j++){
                AT[j][i]=A[i][j];
            }
        }
        for(int i=0; i<righe; i++){
            for(int j=0; j<colonne; j++){
                System.out.print(A[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<colonne; i++){
            for(int j=0; j<righe; j++){
                System.out.print(AT[i][j]+ " ");
            }
            System.out.println();
        }


    }catch (InputMismatchException e){
          System.out.println("Errore: input inserito non valido");
      }
    }
}
