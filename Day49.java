package pkg100.days.coding;

import java.util.Scanner;

public class Day49 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int angka, pangkat, nilai;
        
        System.out.print("Masukkan angka : ");
        angka = sc.nextInt();
        
        nilai = angka;
        
        System.out.print("Masukkan pangkat : ");
        pangkat = sc.nextInt();
        
        for (int i = 1; i < pangkat; i++) {
            angka *= nilai;
        }System.out.println(angka);
        

    }
    
}
