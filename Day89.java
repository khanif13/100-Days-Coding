package pkg100.days.coding;

import java.util.Scanner;

public class Day89 {

    public static double totalDiskon(double harga, double diskon) {
        double tDiskon = harga * (diskon / 100);
        double hasil = harga - tDiskon;
        return hasil;
    }

    public static void tampilDiskon(double harga, double diskon) {
        System.out.println("Harga\t: Rp. " + harga);
        System.out.println("Diskon\t: " + diskon + " %");
        System.out.println("____________________");
        System.out.println("Total Harga\t: Rp. " + totalDiskon(harga, diskon));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double harga, diskon;
        System.out.print("Input Harga : ");
        harga = s.nextDouble();
        if (harga > 1000000) {
            diskon = 15;
        } else if (harga > 500000) {
            diskon = 10;
        } else {
            diskon = 0;
        }
        tampilDiskon(harga, diskon);
    }

}
