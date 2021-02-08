import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quale stringa vuoi verificare?");
        String risp =input.nextLine();
        System.out.println(palindroma(risp));
    }


    public static boolean palindroma(String s) {
        int l=s.length();
        if (l<2)
            return true;
        else
        if (!s.substring(0,1).equals(s.substring(l-1,l)))
            return false;
        else
            return palindroma(s.substring(1,l-1));
    }

}
