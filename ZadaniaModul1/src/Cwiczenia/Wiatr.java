package Cwiczenia;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Wiatr {
    public static void main (String [] args){
        Scanner skan = new Scanner (System.in);
        System.out.println( "Podaj temperature: ");
        double temp = skan.nextDouble();
        System.out.println("Podaj predkosc wiatru:");
        double wiatr = skan.nextDouble();
        double prawdzTemp = 13.126667 + 0.6215 * temp - 13.924748 * Math.pow(wiatr, 0.16) + 0.4875195 * temp * Math.pow(wiatr, 0.16);
        DecimalFormat format = new DecimalFormat("0.#");
        System.out.println( "Odczuwalna temperatura wynosi: " + format.format(prawdzTemp));
        skan.close();
    }

}
