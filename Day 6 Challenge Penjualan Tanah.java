package pkg100.days.coding;
import java.util.Scanner ;
public class Day6ChallangePenjualanTanah {
    public static void main(String[] args) {

/* 
Buatlah program yang dapat mengetahui berapa uang bersih yang didapatkan dari hasil penjualan tanah setelah dipotong pajak dengan ketentuan:
     1. Harga Jual Permeter adalah Rp 300.000
     2. Jika total harga jual 50 jt keatas maka dikenakan pajak 3%
     3. Jika Total harga jual 100 jt keatas maka dikenakan pajak 5%
     4. Dibawah 50jt maka dikenakan pajak 1%.
     5. Luas tanah diinput menggunakan fungsi input pada Java
*/
        
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

// Menampilkan hasil dari harga jual, jumlah pajak, dan hasil penjualan
        System.out.println("Total harga jual: Rp. " +totalHarga);
        System.out.println("Jumlah pajak: Rp. "+jumlahPajak);
        System.out.println("Hasil bersih penjualan: Rp. "+jualBersih);


    }
    
}
