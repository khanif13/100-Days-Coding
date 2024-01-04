package pkg100.days.coding;

import java.util.Scanner;

public class Day88 {

    public static int pangkat(int a, int p){
        int hasil = a;
        for (int i = 1; i < p; i++) {
            hasil *= a;
        }
        return hasil;
    }
    public static void tampil(int a, int p){
        System.out.print(a + " pangkat " + p + " = ");
        System.out.println(pangkat(a, p));
    }
    public static void main(String[] args) {
        int angka, pangkat;
        Scanner s = new Scanner(System.in);
        System.out.print("Input angka\t= ");
        angka = s.nextInt();
        System.out.print("Input pangkat\t= ");
        pangkat = s.nextInt();
        tampil(angka, pangkat);
    }
    
}
