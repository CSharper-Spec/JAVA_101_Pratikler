package JAVA101;


import java.util.Scanner;

public class HipotenüsBulma {
    public static void main(String[] args) {

        System.out.println("Hipotenüs için 1, alan hesabı için 2 ye basınız");
        int a;
        Scanner choice = new Scanner(System.in);
        a = choice.nextInt();
        if (a == 1) {

            int birinciKenar, ikinciKenar;
            double hipo;

            System.out.println("İlk kenarı giriniz:");
            Scanner input1 = new Scanner(System.in);
            birinciKenar = input1.nextInt();

            System.out.println("İkinci kenarı giriniz");
            Scanner input2 = new Scanner(System.in);
            ikinciKenar = input2.nextInt();

            hipo = Math.sqrt(birinciKenar * birinciKenar + ikinciKenar * ikinciKenar);

            System.out.println("Hipotenüs " + hipo);
        }
        if (a == 2) {
        int ilkKenar,ikinciKenar,üçüncüKenar;
        double u,alan;

        System.out.println("İlk kenarı giriniz:");
        Scanner input1 = new Scanner(System.in);
        ilkKenar = input1.nextInt();

        System.out.println("İkinci kenarı giriniz");
        Scanner input2 = new Scanner(System.in);
        ikinciKenar = input2.nextInt();

        System.out.println("İlk kenarı giriniz:");
        Scanner input3 = new Scanner(System.in);
        üçüncüKenar = input1.nextInt();

        u=ilkKenar+ikinciKenar+üçüncüKenar/3;
        alan=u*(u-ilkKenar)*(u-ikinciKenar)*(u-üçüncüKenar);
        System.out.println("Üçgenin Alanı:"+alan);
    }

    }
}
