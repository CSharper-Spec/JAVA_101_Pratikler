package JAVA101;

import java.util.Scanner;

public class EtkinlikOnerme {

    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığını yazınız: ");
        heat = input.nextInt();

        if (heat <= 5) {
            System.out.println("Kayak yapabilirsiniz.");
        }
        if (heat >= 5 && heat <= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if (heat >= 15 && heat <= 25) {
            System.out.println("Piknik yapabilirsiniz.");
        }
        if (heat >= 25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
