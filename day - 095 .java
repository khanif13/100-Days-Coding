package pkg100.days.coding;

import java.util.Scanner;

public class Day95 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, y, z;
        String ulang;
        do {
            System.out.print("input x = ");
            x = s.nextInt();
            System.out.print("input y = ");
            y = s.nextInt();
            System.out.println("===================");
            try {
                z = x / y;
                System.out.println("hasil = "+z);
            } catch (Exception e) {
                System.out.println("tidak dapat dibagi");
                System.out.println("eror pada : ");
                e.printStackTrace();
            }
            System.out.print("ulang (y/n) = ");
            ulang = s.next();
            System.out.println("===================");
        } while (ulang.equalsIgnoreCase("y"));
        System.out.println("Program Selesai");
    }

}
