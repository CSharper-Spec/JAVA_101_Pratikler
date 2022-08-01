package JAVA101;

import java.util.Scanner;

public class VücutKitleİndeksi {

    public static void main(String[] args) {

        int kilo;
        double boy, vke;

        Scanner inputBoy = new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinden giriniz:");
        boy = inputBoy.nextDouble();

        Scanner inputKilo = new Scanner(System.in);
        System.out.print("Kilonuzu kg cinsinden giriniz:");
        kilo = inputKilo.nextInt();

        vke = kilo / (boy*boy);

        System.out.println("Vücut kitle endeksiniz: "+vke);


    }
}
