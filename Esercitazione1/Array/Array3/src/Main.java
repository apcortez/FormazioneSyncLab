public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
        }
        boolean risp= false;
        for(int j=0; j<array.length-1; j++){
            if(array[j] == array[j+1] && array[j+1] == array[j+2]){
                    risp=true;
                    break;
            }
        }
        if (risp){
            System.out.println("Tre valori consecutivi uguali");
        }
        else System.out.println("NO");
    }
}
