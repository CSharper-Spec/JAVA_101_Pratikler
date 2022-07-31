package JAVA101;

import java.util.Scanner;

public class OrtalamaBulma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz:");
        int math = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Fizik notunuzu giriniz:");
        int phys = input.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.print("Kimya notunuzu giriniz:");
        int chem = input.nextInt();

        Scanner input4 = new Scanner(System.in);
        System.out.print("Türkçe notunuzu giriniz:");
        int turk = input.nextInt();

        Scanner input5 = new Scanner(System.in);
        System.out.print("Tarih notunuzu giriniz:");
        int his = input.nextInt();

        Scanner input6 = new Scanner(System.in);
        System.out.print("Müzik notunuzu giriniz:");
        int mus = input.nextInt();

        int total = (math+phys+chem+turk+his+mus);
        float ortalama = total/6;
        System.out.println(ortalama);

        if (ortalama>60){
            System.out.println("Tebrikler geçtiniz");
        }else{
            System.out.println("Kaldınız");
        }

    }


}
