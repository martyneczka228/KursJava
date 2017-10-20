package Cwiczenia;
import java.util.Scanner;
import java.text.DecimalFormat;
public class BMI {
    public static void main (String[] args){
        Scanner skan = new Scanner(System.in);
        System.out.println("Podaj swoj wzrost w metrach: ");
        double wzrost = skan.nextDouble();
        System.out.println("Podaj swoja wage w kilogramach: ");
        double waga = skan.nextDouble();
        double BMI = waga/(wzrost*wzrost);
        DecimalFormat mojFormat = new DecimalFormat("0.#");
        System.out.println("Twoje BMI to : " + mojFormat.format(BMI));
        skan.close();
    }
}
