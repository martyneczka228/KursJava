package Cwiczenia;
import java.util.Random;
public class NumerTelefonu {
    public static void main (String [] args){
        Random losowy = new Random();
        int numerTel = losowy.nextInt(9);  // 0XXX-ZXXXXX
        int a = losowy.nextInt(9);
        int b = losowy.nextInt(9);
        int c = losowy.nextInt(9);
        int d = losowy.nextInt(9);
        int e = losowy.nextInt(9);
        int f = losowy.nextInt(9);
        int g = losowy.nextInt(9);
        int h = losowy.nextInt(9);
        System.out.println (" " + "0" + a + b + c + '-' + d+1 + e + f + g + h );


    }
}
