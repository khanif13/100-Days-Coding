package pkg100.days.coding;
import java.util.Scanner ;
public class Day6ChallangePenjualanTanah {
    public static void main(String[] args) {

// Harga jual per meter 
        double hargaPerMeter = 300000; 
// Input luas tanah 
        Scanner tanah = new Scanner (System.in);
        System.out.print("Masukkan luas tanah dalam meter persegi: ");
        double luasTanah = tanah.nextDouble();
        
// Menghitung total harga jual 
        double totalHarga = hargaPerMeter * luasTanah ;
        
// Menghitung pajak dengan ketentuan, menggunakan percabangan 
        double pajak = 0 ;
    if (totalHarga > 100000000) {
        pajak = 0.05; // Pajak 5% penjualan diatas Rp. 100jt
    }
    
    else if (totalHarga > 50000000) {
        pajak = 0.03 ; // Pajak 3% penjualan diatas Rp. 50jt
    }
    else if (totalHarga < 50000000) {
        pajak = 0.01 ; // Pajak 1% penjualan dibawah Rp. 50jt
    }
    
// Menghitung  pajak yang harus dibayar
        double jumlahPajak = totalHarga * pajak;
        
// Menghitung jual bersih
        double jualBersih = totalHarga - jumlahPajak ;
        
        System.out.println("Total harga jual: Rp. " +totalHarga);
        System.out.println("Jumlah pajak: Rp. "+jumlahPajak);
        System.out.println("Hasil bersih penjualan: Rp. "+jualBersih);


    }
    
}
