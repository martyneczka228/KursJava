package Cwiczenia;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class Dystans {
    public static void main (String [] args){
        Scanner skan = new Scanner (System.in);
        System.out.print("Wpisz koordynaty: " + "\nx1: ");
        double x1 = skan.nextInt();
        System.out.print("x2: ");
        double x2 = skan.nextInt();
        System.out.print("y1: ");
        double y1 = skan.nextInt();
        System.out.print("y2: ");
        double y2 = skan.nextInt();

        double wynik1 = Math.pow((x1-x2), 2);
        double wynik2 = Math.pow((y1-y2), 2);
        double wynik3 = Math.sqrt (wynik1 +wynik2);
        DecimalFormat mojFormat = new DecimalFormat("0.###");
        System.out.println("Odleglosc pomiedzy koordynatami wynosi: " + mojFormat.format(wynik3));
        skan.close();
    }
}
