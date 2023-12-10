package pkg100.days.coding;

import java.util.Scanner;

public class Day63 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input nilai = ");
        int nilai = sc.nextInt();

        String hasil = nilai >= 0 ? "Positif" : "Negatif";
        System.out.println(hasil);

    }

}
