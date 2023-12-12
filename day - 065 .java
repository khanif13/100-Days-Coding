package pkg100.days.coding;

import java.util.Scanner;

public class Day65 {

    public static void main(String[] args) {
        // Menghitung Luas dan Keliling Persegi
        /*
        L = s x s
         */
        Scanner sc = new Scanner(System.in);
        int s, L, K;
        System.out.print("Masukkan nilai S = ");
        s = sc.nextInt();

        L = s * s;
        K = 4 * s;

        System.out.println("L = s x s");
        System.out.println("L = " + s + " x " + s);
        System.out.println("L = " + L);
        System.out.println();
        System.out.println("K = 4 x s");
        System.out.println("K = " + "4" + " x " + s);
        System.out.println("K = " + K);
    }

}
