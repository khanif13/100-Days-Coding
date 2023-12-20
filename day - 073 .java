package pkg100.days.coding;

import java.util.Scanner;

public class Day73 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        final double phi = 3.14;
        double L, K , r , d;
        System.out.print("Nilai r = ");
        r = sc.nextDouble();
        d = 2 * r;
        
        L = phi * r * r;
        K = phi * d;
        
        System.out.println("Keliling Lingkaran adalah = " + K);
        System.out.println("Luas Lingkaran adalah     = " + L);
        

    }
    
}
