import java.util.*;
public class TestOggetto {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Oggetto o =  new Numero();
        Quadrato q = new Quadrato();
        Cubo c = new Cubo();
        try{
            System.out.println("Inserisci un numero intero:");
            int risp = input.nextInt();
            o.oggetto(risp);
            o = q;
            o.oggetto(risp);
            o = c;
            o.oggetto(risp);
        }catch (Exception e){System.out.println("Input non valido");}

    }
}
