public class Quadrato implements Oggetto {
    @Override
    public void oggetto(int n) {
        System.out.println("Il quadrato di "+ n+ " è "+ n*n);
    }
}
