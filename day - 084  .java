package pkg100.days.coding;

import java.util.Scanner;

public class Day84 {

    public static void kalkulator(int pilih, int a, int b) {
        int c = 0;
        if (pilih == 1) {
            c = a * b;
        }
        if (pilih == 2) {
            c = a + b;
        }
        if (pilih == 3) {
            c = a - b;
        }
        if (pilih == 4) {
            c = a / b;
        }System.out.println(c);
    }

    public static void main(String[] args) {
        int pilih, a, b;
        Scanner s = new Scanner(System.in);
        System.out.print("1. Perkalian\n2. Penambahan\n3. Pengurangan\n4. Pembagian\nPilih Operasi = ");
        pilih = s.nextInt();
        System.out.print("Input Nilai A = ");
        a = s.nextInt();
        System.out.print("Input Nilai B = ");
        b = s.nextInt();
        kalkulator(pilih, a, b);

    }

}
