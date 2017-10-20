package Cwiczenia;
import java.util.Scanner;
public class Czas {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe sekund: ");
        int razem = scan.nextInt();
        int godziny = razem/3600; //2
        int godzinyModulo = razem%3600; // 66
        int minuty = godzinyModulo/60; // 1
        int sekundy = godzinyModulo%60; //6
        System.out.println ("To: " + "\n" + godziny + " godziny" + "\n" + minuty + " minut" + "\n" + sekundy + " sekund");
    scan.close();
    }
}
