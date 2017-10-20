package Cwiczenia1;
import java.util.Scanner;
public class PoliczA {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Wpisz zdanie: ");
        String tekst = scan.nextLine();
        int duzeA = 0;
        int maleA = 0;

        for (int i = 0; i < tekst.length(); i++) {
            int znak = tekst.charAt(i);
            if (znak == 'A') {
                duzeA++;
            }
            if (znak == 'a') {
                maleA++;
            }
        }
           System.out.println("Duze A: " + duzeA + "\nMale A: " + maleA);
        scan.close();
        }
    }

