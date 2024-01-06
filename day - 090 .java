package pkg100.days.coding;

import java.util.Scanner;

public class Day90 {

    public static double max (double x, double y){
        double max = Math.max(x, y);
        return max;
    }
    public static double min (double x, double y){
        double min = Math.min(x, y);
        return min;
    }
    public static void tampilMax(double x, double y){
        System.out.println("Nilai Max dari ");
        System.out.println("x = " + x + "\ny = " + y);
        System.out.println("adalah = " + max(x, y));
    }
    public static void tampilMin(double x, double y){
        System.out.println("Nilai Min dari ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("adalah = " + min(x, y));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input niali x = ");
        double x = s.nextDouble();
        System.out.print("Input nilai y = ");
        double y = s.nextDouble();
        tampilMax(x, y);
        System.out.println();
        tampilMin(x, y);
    }
    
}
