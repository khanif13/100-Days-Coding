package pkg100.days.coding;

import java.util.Scanner;

public class Day86 {

    public static double luasLingkaran(double phi, double r){
        double L = phi * r * r;
        return L;
    }
    public static double kelilingLingkaran(double phi, double d){
        double K = phi * d;
        return K;
    }
    public static void tampilLuas(double phi, double r){
        System.out.println("L = phi x r x r");
        System.out.println("L = " + phi + " x " + r + " x " + r);
        System.out.println("L = " + luasLingkaran(phi, r));
    }
    public static void tampilKeliling(double phi, double d){
        System.out.println("K = phi x d");
        System.out.println("K = " + phi + " x " + d);
        System.out.println("K = " + kelilingLingkaran(phi, d));
    }
    public static void main(String[] args) {
        final double phi = 3.14;
        Scanner s = new Scanner (System.in);
        System.out.print("Masukkan nilai r = ");
        double r = s.nextDouble();
        double d = 2 * r;
        tampilLuas(phi, r);
        System.out.println();
        tampilKeliling(phi, d);
    }
    
}
