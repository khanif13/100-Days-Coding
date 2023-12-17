package pkg100.days.coding;

import java.util.Scanner;

public class Day70 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input jumlah nilai = ");
        int jumlah = sc.nextInt();
        double nilai, total = 0, rataRata;
        for (int i = 01; i <= jumlah; i++) {
            System.out.print("Nilai ke-" + i + " = ");
            nilai = sc.nextDouble();
            total += nilai;
        }
        rataRata = total / jumlah;
        System.out.println("Total      = " + total);
        System.out.println("Rata-rata  = " + rataRata);
    }

}
