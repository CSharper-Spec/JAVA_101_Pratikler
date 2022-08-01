package JAVA101;

import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args) {

        int km;
        double total, perKm = 2.20 , startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz:");
        km = input.nextInt();


        total = (km * perKm);
        total+= startPrice;

        total = (total<=20) ? 20:total;

        System.out.println("Tutarınız:"+total);

    }
}
