package pkg100.days.coding;
import java.util.Scanner;
public class Day18PenghasilanBersih {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

        System.out.print("Masukkan penghasilan per bulan (dalam Rupiah): ");
        double penghasilan = input.nextDouble();

        System.out.print("Masukkan jenis pekerjaan (PNS / lainnya): ");
        String jenisPekerjaan = input.next();
        double pajak = 0.0;
        if (penghasilan >= 3000000) {
            pajak = penghasilan * 0.05; // Pajak 5%
            if (penghasilan >= 5000000) {
                pajak = penghasilan * 0.1; // Pajak 10%
            }
        }if (jenisPekerjaan.equalsIgnoreCase("PNS")) {
            pajak += penghasilan * 0.05; // Pajak tambahan 5%
        }
        double penghasilanBersih = penghasilan - pajak;

        System.out.println("Pajak yang harus dibayarkan (dalam Rupiah): " + pajak);
        System.out.println("Penghasilan bersih per bulan (dalam Rupiah): " + penghasilanBersih);

        input.close();
    }
}
