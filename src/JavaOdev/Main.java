package JavaOdev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mat,fizik,kimya,turkce,muzik,toplam,ortalama;
        toplam = 0;
        System.out.println("Matematik Notunuzu giriniz.");
        mat = scanner.nextInt();

        System.out.println("Fizik Notunuzu giriniz.");
        fizik = scanner.nextInt();

        System.out.println("Kimya Notunuzu giriniz.");
        kimya = scanner.nextInt();

        System.out.println("Turkce Notunuzu giriniz.");
        turkce = scanner.nextInt();

        System.out.println("Muzik Notunuzu giriniz.");
        muzik = scanner.nextInt();


        if(mat >0 && mat <100){
            toplam += mat;
        }
        if(muzik >0 && muzik <100){
            toplam += muzik;
        }
        if(fizik >0 && fizik <100){
            toplam += fizik;
        }
        if(kimya >0 && kimya <100){
            toplam += kimya;
        }
        if(turkce >0 && turkce <100){
            toplam += turkce;
        }

        ortalama = toplam / 5;

        System.out.println("Toplam deger: " + toplam );
        System.out.println("Ortalama deger :" + ortalama);

        if(ortalama > 55){
            System.out.println("Basari ile sinifi gectiniz");
        }
        else System.out.println("Ne yazik ki sinifta kaldiniz");
    }
}
