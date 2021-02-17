public class Cubo implements Oggetto {
    @Override
    public void oggetto(int n) {
        System.out.println("Il cubo di "+n+ " è "+ (n*n*n));
    }
}
