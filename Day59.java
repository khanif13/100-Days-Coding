package pkg100.days.coding;

import java.util.Scanner;

public class Day59 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan jumlah inputan : ");
        int jumlah = sc.nextInt();
        
        int[] nilai = new int [jumlah];
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai : ");
            nilai[i] = sc.nextInt();
        }
        
        
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] %2 == 0) {
                System.out.println("Genap");
            }else {
                System.out.println("Ganjil");
            }
        }
    }
    
}
