package pkg100.days.coding;

import java.util.Scanner;

public class Day87 {

    public static double luas(double p, double l){
        double L = p * l;
        return L;
    }
    public static double keliling(double p, double l){
        double K = (2 * p) + (2 * l);
        return K;
    }
    public static void tampilLuas (double p, double l){
        System.out.println("L = p x l");
        System.out.println("L = " + p + " x " + l);
        System.out.println("L = " + luas(p, l));
    }
    public static void tampilKeliling (double p, double l){
        System.out.println("K = (2 x p) + (2 x l)");
        System.out.println("K = (2 x" + p + ") + (2 x " + l + ")");
        System.out.println("K = " + keliling(p, l));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        double p, l;
        System.out.print("Masukkan p = ");
        p = s.nextDouble();
        System.out.print("Masukkan l = ");
        l = s.nextDouble();
        tampilLuas(p, l);
        System.out.println();
        tampilKeliling(p, l);
    }
    
}
