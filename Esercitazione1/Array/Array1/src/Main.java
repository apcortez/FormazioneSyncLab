
public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i=0; i< array.length; i++) {
            array[i] = i;
        }
        int i=0;
        int j = array.length-1;
        while(i<= array.length/2 && j>=array.length/2){
            System.out.println(array[i]);
            System.out.println(array[j]);
            i++;
            j--;
        }
    }
}
