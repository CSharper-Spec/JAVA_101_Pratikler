package JAVA101;

import java.util.Scanner;

public class KullanıcıGirişi {

    public static void main(String[] args) {

        String username, password, newPassword;
        int press;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Kullanıcı adınız giriniz: ");
        username = inputUser.nextLine();

        Scanner inputPass = new Scanner(System.in);
        System.out.print("Şifrenizi giriniz: ");
        password = inputPass.nextLine();

        if (username.equals("PatikaDev") && password.equals("Asdf")) {
            System.out.println("Giriş başarılı hoşgeldiniz :)");

        } else if (username != "PatikaDev" && password.equals("Asdf")) {
            System.out.println("Kullanıcı adı hatalı tekrar deneyiniz :)");
        } else if (username.equals("PatikaDev") && password != "Asdf") {

            System.out.println("Şifre yanlış, yenilemek için 1 e basınız");
            Scanner inputNew = new Scanner(System.in);
            press = inputNew.nextInt();

            if (press == 1) {
                System.out.println("Yeni girdiğiniz şifre hatalı girilen ve eski şifre ile aynı olmamalıdır.");
                Scanner inputPass3 = new Scanner(System.in);
                newPassword = inputPass3.nextLine();
                if (newPassword.equals("Asdf") || newPassword.equals("asdf")) {
                    System.out.println("Hatalı deneme şifre oluşturulamadı!!!");
                } else {
                    System.out.println("Yeni şifre oluşturuldu yeniden giriş yapabilirsiniz :)");
                }
            }


        }


    }


}


