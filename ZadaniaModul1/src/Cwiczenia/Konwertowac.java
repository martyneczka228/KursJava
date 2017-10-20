package Cwiczenia;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Konwertowac {
    public static void main (String [] args){
        Scanner skan = new Scanner (System.in);
        System.out.println ("Wpisz temperature w stopniach Fahrenheita: ");
        int temp = skan.nextInt();
        double Celsjusz = (temp - 32)/1.8;
        DecimalFormat mojFormat = new DecimalFormat("0.#");
        System.out.println("Temperatura w stopniach Cejsjusza: " + "\n" + mojFormat.format(Celsjusz));
        skan.close();
    }
}
