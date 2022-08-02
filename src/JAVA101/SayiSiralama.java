package JAVA101;

import java.util.Scanner;

public class SayiSiralama {

    public static void main(String[] args) {

        int a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.println("Üç adet sayı giriniz: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if (a < c && b < c) {
            if (a < b) {
                System.out.println("a<b<c");
            } else {
                System.out.println("b<a<c");
            }
        } else if (b < c && b < a) {
            if (a < c) {
                System.out.println("b<c<a");
            } else {
                System.out.println("b<a<c");
            }
        } else if (c < b && c < a) {
            if (b < a) {
                System.out.println("c<b<a");
            } else {
                System.out.println("c<a<b");
            }
        }
    }
}
