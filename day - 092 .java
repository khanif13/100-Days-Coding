package pkg100.days.coding;

import java.util.Random;

public class Day92 {

    public static void main(String[] args) {
        Random acak = new Random();
        int angka;
        for (int i = 0; i < 5; i++) {
            angka = acak.nextInt(100);
            System.out.println(angka);
        }
        System.out.println();
        int a, b, c;
        a = 10;
        b = 20;
        c = a + (int)(Math.random() * (a - b) + 1);
        System.out.println(c);
    }

}
