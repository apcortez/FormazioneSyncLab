import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quant'è la dimenstione dell'array?");
        int dim =input.nextInt();
        int[] array=new int[dim];
        int[] arrayOrdinato= new int[dim];
        int max =0;
        System.out.println("Inserisci i numeri interi dell'array: ");
        for (int i = 0; i < dim; i++) {
            System.out.println("Inserisci il "+ (i+1) +"^ numero intero: ");
            array[i] = input.nextInt();
            }
        for(int j = 0; j<dim; j++){
            arrayOrdinato[j]=array[j];
        }
        for(int x=0; x<dim; x++){
            for(int y=x+1; y<dim; y++){
                if(arrayOrdinato[x]>arrayOrdinato[y]){
                    max= arrayOrdinato[x];
                    arrayOrdinato[x]=arrayOrdinato[y];
                    arrayOrdinato[y]=max;
                }
            }
        }
        for(int z: arrayOrdinato){
            System.out.println(z+"; ");
        }
    }
}




