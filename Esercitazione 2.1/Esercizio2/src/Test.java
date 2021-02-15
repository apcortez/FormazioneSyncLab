import java.util.*;
public class Test {
    public static void main(String[] args) throws InputMismatchException, NullPointerException {
        Scanner input = new Scanner(System.in);
        System.out.println("----Memorizzazione di un lettore multimediale----");
        System.out.println("!Attenzione: massima capacità 5 elementi multimediali");
        String output ="";
        int luminosità =0, durata =0, volume = 0;
        Multimediale[] m = new Multimediale[5];
        try {
            for (int i = 0; i<5; i++){
            System.out.println("Inserisci "+(i+1)+"^ file");
            System.out.println("Titolo:");
            String titolo = input.next();

                System.out.println("Tipo file: immagine/audio/film");
                String tipo = input.next();

                switch (tipo) {
                    case "immagine":
                        System.out.println("Luminosità: ");
                        luminosità = input.nextInt();
                        m[i] = new Immagine(titolo, luminosità);

                        break;
                    case "audio":
                        System.out.println("Durata: ");
                        durata = input.nextInt();
                        System.out.println("Volume: ");
                        volume = input.nextInt();
                        m[i] = new Audio(titolo, durata, volume);
                        break;
                    case "film":
                        System.out.println("Durata: ");
                        durata = input.nextInt();
                        System.out.println("Volume: ");
                        volume = input.nextInt();
                        System.out.println("Luminosità: ");
                        luminosità = input.nextInt();
                        m[i] = new Filmato(titolo, durata, volume, luminosità);
                        break;
                    default: System.out.println("File non riconosciuto ma verrà memorizzato di default");
                             break;
                }
            }





            
            System.out.println("------Memorizzazione completata-------");
      int in =0;

          do {
              System.out.println("Quale file vuoi eseguire? Inserire da 1 a 5 oppure 0 per finire");
              in = input.nextInt();
              m[in - 1].play();
              m[in - 1].show();


          }while(in !=0 && in<=5);

      }catch(Exception a){System.out.println("Error! File multimediale non accessibile");}
    }
}




