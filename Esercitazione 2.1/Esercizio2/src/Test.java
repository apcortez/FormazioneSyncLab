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

                System.out.println("Tipo file:\n1 - Immagine \n2 - Audio \n3 - Filmato");
                int tipo = input.nextInt();
                switch (tipo) {
                    case 1:
                        System.out.println("Luminosità: ");
                        luminosità = input.nextInt();
                        m[i] = new Immagine(titolo,"immagine", luminosità);
                        break;
                    case 2:
                        System.out.println("Durata: ");
                        durata = input.nextInt();
                        System.out.println("Volume: ");
                        volume = input.nextInt();
                        m[i] = new Audio(titolo, "audio",durata, volume);
                        break;
                    case 3:
                        System.out.println("Durata: ");
                        durata = input.nextInt();
                        System.out.println("Volume: ");
                        volume = input.nextInt();
                        System.out.println("Luminosità: ");
                        luminosità = input.nextInt();
                        m[i] = new Filmato(titolo,"filmato", durata, volume, luminosità);
                        break;
                    default: if(tipo ==0 || tipo>3)System.out.println("File non riconosciuto ma verrà memorizzato di default");
                             break;
                }
            }





            
            System.out.println("------Memorizzazione completata-------");
      int in =0;

          do {int r;
              System.out.println("Quale file vuoi eseguire? Inserire da 1 a 5 oppure 0 per finire");
              in = input.nextInt();
              switch (m[in-1].tipo){
                  case "immagine": Immagine i = (Immagine) m[in-1];
                                   i.show();
                                   System.out.println("Luminosità? \n1 - Aumentare \n0 - Diminuire");
                                   r = input.nextInt();
                                   if(r ==1){ i.brighter(1);}
                                   if(r ==0){i.darker(1);}
                                   i.show();
                                   break;
                  case "audio":    Audio a = (Audio)m[in-1];
                                   a.play();
                                   System.out.println("Volume? \n1 - Aumentare \n0 - Diminuire");
                                   r = input.nextInt();
                                   if(r ==1){a.louder(1);}
                                   if(r ==0){a.weaker(1);}
                                   a.play();
                                   break;
                  case "filmato":  Filmato f = (Filmato) m[in-1];
                                   f.play();
                                   System.out.println("Luminosità? \n1 - Aumentare \n0 - Diminuire");
                                   r = input.nextInt();
                                   if(r ==1){f.brighter(1);}
                                   if(r ==0){f.darker(1);}
                                   System.out.println("Volume? \n1 - Aumentare \n0 - Diminuire");
                                   r = input.nextInt();
                                   if(r==1){f.louder(1);}
                                   if(r ==0){f.weaker(1);}
                                   f.play();
                                   break;
              }



          }while(in !=0 && in<=5);

      }catch(Exception a){System.out.println("Error! File multimediale non accessibile");}
    }
}




