package JAVA101;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {

        double a, b, total, fark, carpim, bölüm;
        int press;

        Scanner input1 = new Scanner(System.in);
        System.out.println("Lütfen seçiniz\nToplama : 1, Çıkarma: 2, Çarpma:3, Bölme:4");
        press = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        a = input2.nextDouble();

        Scanner input3 = new Scanner(System.in);
        System.out.print("İkinci sayıyı giriniz: ");
        b = input3.nextDouble();

        switch (press) {
            case 1:
                total = a + b;
                System.out.println("Toplam: " + total);
                break;

            case 2:
                fark = a - b;
                System.out.println("Fark: " + fark);
                break;

            case 3:
                carpim = a * b;
                System.out.println("Çarpım: " + carpim);
                break;

            case 4:
                if (b != 0) {
                    bölüm = a / b;
                    System.out.println("Bölüm: " + bölüm);

                } else {
                    System.out.println("Sayı 0 ile bölünemez!!!");
                }
                break;
            default:
                System.out.println("Lütfen geçerli bir numara giriniz...");
        }


    }
}
