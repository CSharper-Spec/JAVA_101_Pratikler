package JAVA101;

import java.util.Scanner;

public class DaireDilimAlanı {

    public static void main(String[] args) {

        int r;
        double alpha, alan, pi=3.14;

        Scanner input_r=new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz");
        r= input_r.nextInt();

        Scanner input_alpha=new Scanner(System.in);
        System.out.print("Daire yayının açı ölçüsünü giriniz");
        alpha= input_alpha.nextInt();

        alan = (pi*(r*r)*alpha)/360;

        System.out.println("Daire yayının alanı:"+ alan);


    }
}
