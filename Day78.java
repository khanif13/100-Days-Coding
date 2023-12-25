package pkg100.days.coding;

import java.util.Scanner;

public class Day78 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String[] merk = {"Hyundai", "Toyota", "Suzuki"};
        String cari;
        int tentukan = 0;
        
        for (int i = 0; i < merk.length; i++) {
            System.out.println((i + 1) + ". " + merk[i] + " ");
        }
        System.out.println();
        System.out.print("Cari : ");
        cari = s.nextLine();
        for (int i = 0; i < merk.length; i++) {
            if (cari.equalsIgnoreCase(merk[i])) {
                System.out.println("Nomor " + (i + 1));
                tentukan++;
            }
        }if (tentukan == 0) {
                System.out.println("Data tidak ditemukan !!");
            }

    }

}
