package JAVA101;

import java.util.Scanner;

public class SınıfGecme {

    public static void main(String[] args) {

        int mat, fiz, kim, turk, muz, toplam = 0, dersSayisi = 5;
        float average;

        System.out.println("*******Ortalama Hesaplama Programı*******");

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen matematik notunuzu giriniz: ");

        mat = input.nextInt();
        if (mat >= 0 && mat <= 100)
            toplam += mat;

        System.out.print("Lütfen fizik notunuzu giriniz: ");
        fiz = input.nextInt();
        if (fiz >= 0 && fiz <= 100)
            toplam += fiz;

        System.out.print("Lütfen kimya notunuzu giriniz: ");
        kim = input.nextInt();
        if (kim >= 0 && kim <= 100)
            toplam += kim;

        System.out.print("Lütfen Türkçe notunuzu giriniz: ");
        turk = input.nextInt();
        if (turk >= 0 && turk <= 100)
            toplam += turk;

        System.out.print("Lütfen müzik notunuzu giriniz: ");
        muz = input.nextInt();
        if (muz >= 0 && muz <= 100)
            toplam += muz;


        average = (toplam) / (dersSayisi);

        if (average >= 55) {
            System.out.println("Tebrikler, geçtiniz");

        } else {
            System.out.println("Üzgünüm, kaldınız");
        }

        System.out.println("Ortalamanız: " + average);
    }


}
