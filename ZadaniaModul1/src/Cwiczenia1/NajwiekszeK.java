package Cwiczenia1;
import java.util.Scanner;
public class NajwiekszeK {
    public static void main (String [] args){
        Scanner skan = new Scanner (System.in);
        System.out.println ("Wpisz liczbe calkowita: ");
        int liczba = skan.nextInt();
        int i = 0;
        int suma = 0;
        while (suma <= liczba){
            suma = suma + i;
            i= i+2;
        }
        System.out.println( "Najwieksze K to : " + (i-4));
        skan.close();
    }
}
