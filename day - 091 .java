package pkg100.days.coding;

import java.util.Scanner;

public class Day91 {

    public static double akarKuadrat(double x) {
        double akarK = Math.sqrt(x);
        return akarK;
    }

    public static double pangkat(double a, double b) {
        double p = Math.pow(a, b);
        return p;
    }

    public static void tampilAkar(double x) {
        System.out.println("Akar Kuadrat dari " + x);
        System.out.println("adalah = " + akarKuadrat(x));
    }

    public static void tampilPangkat(double a, double b) {
        System.out.println("Nilai dari " + a + " pangkat " + b);
        System.out.println("adalah " + pangkat(a, b));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Pilih alur pengerjaan :\n1. Pangkat\n2. Akar Kuadrat");
        System.out.print("= ");
        int pilih = s.nextInt();
        if (pilih == 1) {
            System.out.println("Input nilai a = ");
            double a = s.nextDouble();
            System.out.println("Input nilai b = ");
            double b = s.nextDouble();
            tampilPangkat(a, b);
        }
        if (pilih == 2) {
            System.out.println("Input nilai x = ");
            double x = s.nextDouble();
            tampilAkar(x);
        }

    }

}
