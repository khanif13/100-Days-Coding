package pkg100.days.coding;
import java.util.Scanner;
public class Day23 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);        
        System.out.print("Masukkan modal awal investasi = ");
        double modalAwal = input.nextDouble();
        System.out.print("Masukkan jumlah tahun investasi = ");
        int tahunInvestasi = input.nextInt();
        double keuntunganTahunan = 0.05;
        for (int i = 1; i <= tahunInvestasi; i++) {
            double keuntunganTahunIni = modalAwal * keuntunganTahunan;
            modalAwal += keuntunganTahunIni;
            System.out.println("Tahun " + i + " - Keuntungan: " + keuntunganTahunIni);
        }

        System.out.println("Total keuntungan setelah " + tahunInvestasi + " tahun: " + modalAwal);
    }
}

