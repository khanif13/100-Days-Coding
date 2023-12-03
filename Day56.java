package pkg100.days.coding;

import java.util.Scanner;

public class Day56 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int[] angka = {1, 4, 6, 4, 4, 4, 5, 7, 9, 2, 4};
        
        System.out.print("Cari indeks : ");
        int cari = sc.nextInt();
        int indeks = 0;
        for (int i = 0; i < angka.length; i++) {
            if (cari == angka[i]) {
                indeks = i;
            }
        }System.out.println(indeks);

    }

}
