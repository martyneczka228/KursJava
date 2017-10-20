package Cwiczenia;

import java.util.Scanner;

public class Sekundy {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        System.out.println("Godziny : ");
        int godziny = skan.nextInt()*3600;
        System.out.println("Minuty: ");
        int minuty = skan.nextInt()*60;
        System.out.println("Sekundy:");
        int sekundy = skan.nextInt();
        int suma = godziny + minuty + sekundy;
        System.out.println ("Laczna liczba sekund to :" + suma);

    skan.close();
    }

}

