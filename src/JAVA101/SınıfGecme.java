package JAVA101;

import java.util.Scanner;

public class SınıfGecme {

    public static void main(String[] args) {

        int mat, fiz, kim, turk, muz, toplam = 0;
        double average;

        System.out.println("*******Ortalama Hesaplama Programı*******");

        System.out.print("Lütfen matematik notunuzu giriniz: ");
        Scanner inputMat = new Scanner(System.in);
        mat = inputMat.nextInt();
        if (!(mat <= 0 || mat > 100))
            toplam += mat;
        System.out.print("Lütfen fizik notunuzu giriniz: ");
        Scanner inputFiz = new Scanner(System.in);
        fiz = inputFiz.nextInt();
        if (!(fiz <= 0 || fiz > 100))
            toplam += fiz;
        System.out.print("Lütfen kimya notunuzu giriniz: ");
        Scanner inputKim = new Scanner(System.in);
        kim = inputKim.nextInt();
        if (!(kim <= 0 || kim > 100))
            toplam += kim;
        System.out.print("Lütfen Türkçe notunuzu giriniz: ");
        Scanner inputTurk = new Scanner(System.in);
        turk = inputMat.nextInt();
        if (!(turk <= 0 || turk > 100))
            toplam += turk;
        System.out.print("Lütfen müzik notunuzu giriniz: ");
        Scanner inputMuz = new Scanner(System.in);
        muz = inputMuz.nextInt();
        if (!(muz <= 0 || muz > 100))
            toplam += muz;


        average = (toplam) / 5;

        if (average >= 55) {
            System.out.println("Tebrikler, geçtiniz");

        } else {
            System.out.println("Üzgünüm, kaldınız");
        }

        System.out.println("Ortalamanız: " + average);
    }


}
