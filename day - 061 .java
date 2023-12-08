package pkg100.days.coding;

import java.util.Scanner;

public class Day61 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int min = 1000, max = 0, baris, kolom;

        System.out.print("Masukkan panjang indeks = ");
        baris = sc.nextInt();

        System.out.print("Masukkan lebar indeks = ");
        kolom = sc.nextInt();

        int[][] nilai = new int[baris][kolom];
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Masukkan nilai = ");
                nilai[i][j] = sc.nextInt();
                if (nilai[i][j] > max) {
                    max = nilai[i][j];
                }if (nilai[i][j] < min) {
                    min = nilai[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Nilai maksimal adalah = " + max);
        System.out.println("Nilai minimal adalah = " + min);

    }

}
