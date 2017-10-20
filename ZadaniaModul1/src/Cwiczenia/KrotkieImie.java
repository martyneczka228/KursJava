package Cwiczenia;
import java.util.Scanner;
public class KrotkieImie {
    public static void main (String [] args){
        Scanner skan = new Scanner (System.in);
        System.out.print("Imie: ");
        String imie = skan.nextLine();
        System.out.print("Nazwisko: ");
        String nazwisko = skan.nextLine();
        char KrotkieImie = imie.charAt(0);
        String KrotkieNazwisko = nazwisko.substring(0,4);
        System.out.println ("Krotkie imie: " + KrotkieImie + '.' + " " + KrotkieNazwisko);

        skan.close();
    }
}
