public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];
        int pari =0;
        int dispari =0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
            System.out.println(array[i]);
            if(array[i]%2==0){
                pari++;
            } else
                dispari++;
        }
        if(pari == dispari)
            System.out.println("Pari e dispari uguali");
        else System.out.println("Pari e dispari diversi");
    }
}
