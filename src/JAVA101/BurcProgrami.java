package JAVA101;

import java.util.Scanner;

public class BurcProgrami {

    public static void main(String[] args) {

        int gün, ay;
        String burc = "";
        boolean dogruMu = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum gününüzü giriniz: ");
        gün = input.nextInt();
        System.out.print("Doğum ayınızı giriniz: ");
        ay = input.nextInt();

        if (ay == 1) {
            if (gün >= 1 && gün <= 31) {
                if (gün < 22) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
            }
        }else{
            dogruMu = true;
        }

        if (dogruMu) {
            System.out.println("Hatalı bir seçim yaptınız");
        } else {
            System.out.println("Burcunuz: " + burc);
        }

    }
}
