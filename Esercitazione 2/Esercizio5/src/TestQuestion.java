import java.util.Random;
import java.util.Scanner;
public class TestQuestion {

    public static void main(String[] args) {
        Question[] q = new Question[10];
        String[] risp = new String[10];
        int totale =0;
        q[0] = new QuestionYesNo("Java è un linguaggio di programmazione? si/no",
                "si",1);
        q[1] = new QuestionYesNo("Java non è una programmazione OO? si/no", "no", 1);
        q[2] = new NumericQuestion("3+3 = ?", "6", 1);
        q[3] = new NumericQuestion("10*1 = ?", "10", 1);
        q[4] = new QuestionYesNo("il sole è giallo? si/no", "si", 1);
        q[5] = new NumericQuestion("1*0 = ?", "0", 1);
        q[6] = new MultipleQuestion("Che cos'è la luna? \n 1) Pianeta \n 2) Stella \n 3) Satellite", "3",
                1,1);
        q[7] = new MultipleQuestion("Qual'è il deserto più vasto del mondo? \n 1) Sahara \n 2) Gobi \n 3)Antartide \n 4)Artide",
                "3;4",2,2);
        q[8] = new MultipleQuestion("Tipo di cane: \n 1) Chowchow \n 2) Pappagallo \n 3) Berna \n 4) Pitbull","14",2,2);
        q[9] = new MultipleQuestion("Nomi di alcune montagne: \n 1) Pippo \n 2) Bianco \n 3) Rosa \n 4) Rosso","23",2,2);
        Random generator = new Random();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int d = generator.nextInt(10);
            System.out.println("Domanda n^" + (i + 1) + ") " + q[d].getDomanda());
            try {
                risp[i] = input.nextLine();
                totale = totale + q[d].ask(risp[i]);
                System.out.println("Punteggio Assegnato: " + q[d].ask(risp[i]));


                } catch (java.util.InputMismatchException e){
                    System.out.println("Punteggio Assegnato: 0");
                    continue;}
                  catch (NumberFormatException e){
                    System.out.println("Punteggio Assegnato: 0");
                    continue;}
                  catch (StringIndexOutOfBoundsException e){continue;}
        }
         System.out.println("Il punteggio totale è " + totale);
    }
}