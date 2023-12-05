package pkg100.days.coding;

import java.util.Scanner;

public class Day58 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = sc.nextInt();
        
        int[] nilai = new int[jumlah];
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Input nilai : ");
            nilai[i] = sc.nextInt();
        }System.out.println();
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i] + " ");
        }System.out.println();
    }
    
}
