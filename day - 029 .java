package pkg100.days.coding;
import java.util.Scanner;
public class Day29 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
     
        int a, b, c, bagi, kali, kurang, tambah;
     
        System.out.print("Operasi (Pengurangan, Penambahan, Perkalian, Pembagian) ? ");
        String operasi = input.nextLine();
        System.out.println("===================================");
        System.out.print("Masukkan angka pertama = ");
        a = input.nextInt();
        System.out.print("Masukkan angka kedua = ");
        b = input.nextInt();
        System.out.println("===================================");

        bagi = a/b;
        kali = a*b;
        kurang = a-b;
        tambah = a+b;
        if (operasi.equalsIgnoreCase("perkalian")) {
            System.out.println("= " + kali);
        }if (operasi.equalsIgnoreCase("pembagian")) {
            System.out.println("= " + bagi );
        }if (operasi.equalsIgnoreCase("pengurangan")) {
            System.out.println("= "+ kurang);
        }if (operasi.equalsIgnoreCase("penambahan")) {
            System.out.println("= "+ tambah);
        }
                
    }
}
