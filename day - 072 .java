package pkg100.days.coding;

import java.util.Scanner;

public class Day72 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        double K, L, a, t, s;
        
        System.out.print("Alas = ");
        a = sc.nextDouble();
        
        System.out.print("Tinggi = ");
        t = sc.nextDouble();
        
        s = a;
        L = 0.5 * (a * t);
        K = s + s + s;
        
        System.out.println("Luas Segitiga Sama Sisi adalah     = " + L);
        System.out.println("Keliling Segitiga Sama Sisi adalah = " + K);

    }
    
}
