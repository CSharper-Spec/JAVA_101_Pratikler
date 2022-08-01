package JAVA101;

import java.util.Scanner;

public class Manav {

    public static void main(String[] args) {

        double armut =2.14, elma = 3.67, domates = 1.11, muz= 0.95, patlıcan = 5.00;

        double kgArmut, kgElma, kgDomates, kgMuz, kgPatlıcan, total ;

        Scanner inputArmut = new Scanner(System.in);
        System.out.print("Armut kaç kilo?");
        kgArmut = inputArmut.nextDouble();

        Scanner inputElma = new Scanner(System.in);
        System.out.print("Elma kaç kilo?");
        kgElma = inputElma.nextDouble();

        Scanner inputDomates = new Scanner(System.in);
        System.out.print("Domates kaç kilo?");
        kgDomates = inputDomates.nextDouble();

        Scanner inputMuz = new Scanner(System.in);
        System.out.print("Muz kaç kilo?");
        kgMuz = inputMuz.nextDouble();

        Scanner inputPatlıcan = new Scanner(System.in);
        System.out.print("Patlıcan kaç kilo?");
        kgPatlıcan = inputPatlıcan.nextDouble();

        total =(armut*kgArmut)+(elma*kgElma)+(domates*kgDomates)+(muz*kgMuz)+(patlıcan*kgPatlıcan);
        Math.ceil(total);

        System.out.println("Harcamanızın toplam tutarı "+total+ " TL'dir.");



    }
}
