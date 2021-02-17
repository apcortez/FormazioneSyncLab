public class Addizione extends Stampa implements Operazione {
    protected int n;
    @Override
    public void operazione(int a, int b) {
        n = a + b;
        print(n);
    }
}
