package pkg100.days.coding;

import java.util.Scanner;

public class Day67 {

    public static void main(String[] args) {
        /*
        L persegi panjang = p x l
        K persegi panjang  2 x (p + l)
         */

        Scanner sc = new Scanner(System.in);

        int p, l, L, K;

        System.out.print("Masukkan Panjang Persegi Panjang : ");
        p = sc.nextInt();
        System.out.print("Masukkan Lebar Persegi Panjang : ");
        l = sc.nextInt();

        L = p * l;
        K = 2 * (p + l);

        System.out.println("p = " + p);
        System.out.println("l = " + l);
        System.out.println("Luas Persegi Panjang : \n" + p + "x" + l + " = " + L);
        System.out.println("Keliling Persegi Panjang : \n" + "2x" + (p + l) + " = " + K);

    }

}
