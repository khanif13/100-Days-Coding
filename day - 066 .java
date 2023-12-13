package pkg100.days.coding;

import java.util.Scanner;

public class Day66 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan Nilai Peserta = ");
        int nilai = sc.nextInt();

        String predikat
                = nilai >= 10 ? "Amat Baik"
                        : nilai >= 8 ? "Baik"
                                : nilai >= 5 ? "Cukup Baik"
                                        : "Kurang";

        System.out.println(predikat);

    }

}
