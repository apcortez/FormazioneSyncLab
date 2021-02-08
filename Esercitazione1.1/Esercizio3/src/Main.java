public class Main {

    public static void main(String[] args) {
        int contatore = 50;
        int primo=0,secondo =1, risultato;
        System.out.print(primo +" "+ secondo);

        for (int i=2; i<contatore; i++){
            risultato = primo + secondo;
            System.out.print(" "+ risultato);
            primo = secondo;
            secondo = risultato;
        }
    }

}

