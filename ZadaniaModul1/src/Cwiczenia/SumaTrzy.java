package Cwiczenia;
import java.util.Scanner;
public class SumaTrzy {
    public static void main (String [] args){
        Scanner skan = new Scanner(System.in);
        System.out.println ("Wpisz 3-cyfrowa liczbe: ");
        int liczba = skan.nextInt();
        int pierwsza = liczba /100; //4
        int pierwsza1 = liczba%100; //32
        int druga = pierwsza1 /10;
        int trzecia = pierwsza1%10;
        int suma = pierwsza + druga + trzecia;
        System.out.println ("Suma tej cyfry to: " + suma);

        skan.close();
    }
}
