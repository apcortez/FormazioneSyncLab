public class Main {

    public static void main(String[] args) {

            String[] array1 = {"ciao", "hello", "hola", "salut", "hallo"};
            String[] array2 = {"world", "mondo", "hello", "mundo", "welt"};
            boolean risp = false;
        for (String s : array1) {
            for (String value : array2) {
                if (s.equals(value)) {
                    risp = true;
                    break;
                }
            }
        }
            if (risp){
                System.out.println("OK");
            } else System.out.println("KO");
        }

}
