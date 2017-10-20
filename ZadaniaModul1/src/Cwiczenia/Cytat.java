package Cwiczenia;
import java.util.Scanner;
public class Cytat {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz jakis tekst: " );
        String cytat = scan.nextLine();
        System.out.println("Wpisales: " + "\n" + '"' + cytat + '"');
    scan.close();
    }
}
