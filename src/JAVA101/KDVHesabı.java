package JAVA101;

import java.util.Scanner;

public class KDVHesabı {

    public static void main(String[] args) {

        System.out.print("Para miktarını giriniz:");
        Scanner input = new Scanner(System.in);
        double tutar = input.nextFloat();

        if (tutar < 1000 && tutar >=0) {
            double kdvOranı = 0.18;
            double kdvFiyatı = tutar * kdvOranı + tutar;
            double kdvTutarı = kdvFiyatı - tutar;

            System.out.println("Paranızın KDV'li tutarı" + kdvFiyatı);
            System.out.println("KDV Tutarı" + kdvTutarı);
        } if (tutar > 1000){
            double kdvOranı = 0.08;
            double kdvFiyatı = tutar * kdvOranı + tutar;
            double kdvTutarı = kdvFiyatı - tutar;

            System.out.println("Paranızın KDV'li tutarı" + kdvFiyatı);
            System.out.println("KDV Tutarı" + kdvTutarı);

        }
    }
}
