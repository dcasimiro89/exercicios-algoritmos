package passo01;

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite uma distância em metros: ");
        double metros = sc.nextDouble();

        double km = metros / 1000;
        double hm = km * 10;
        double dam = hm * 10;
        double dm = dam * 100;
        double cm = dm * 10;
        double mm = cm * 10;

        System.out.println(km + "Km");
        System.out.println(hm + "Hm");
        System.out.println(dam + "Dam");
        System.out.println(String.format("%.1fdm",dm));
        System.out.println(cm + "cm");
        System.out.println(mm + "mm");
    }
}
