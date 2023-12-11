package pkg100.days.coding;

import java.util.Scanner;

public class Day64 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        int nilai, kkm;
        kkm = 75;
        
        System.out.print("Masukkan nilai anda = ");
        nilai = sc.nextInt();
        
        String penentu = nilai >= kkm ? "Lulus" : "Tidak Lulus";
        
        System.out.println(penentu);
        
    }
    
}
