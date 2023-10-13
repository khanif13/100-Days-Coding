package day.pkg5.challange.round.pkg1;
import java.util.Scanner ; 
public class Day5ChallangeRound1 {
    public static void main(String[] args) {

  /*Buatlah program yang mengetahui gaji bersih yang 
    diterima karyawan setiap bulannya dengan 
    ketentuan:
    1. Gaji pokok masukkan melalui input
    2. Gaji lembur/jam adalah Rp. 55.000
    3. Lama lembur lembur dimasukkan melalui fungsi input()
  */
  // Membuat objek scanner agar dapat diinput oleh pengguna
    Scanner input = new Scanner (System.in);
    
  // Ini adalah input gaji pokok karyawan
    System.out.print("Masukkan gaji pokok karyawan: Rp. ");
        double gajiPokok = input.nextDouble();
  
  // Membuat input lama lembur (jam) karyawan
        System.out.print("Masukkan lama lembur: ");
        double lamaLembur = input.nextDouble();
  
  // Membuat input gaji lembut per jam lama lembur karyawan      
        double gajiLembur = 55000 * lamaLembur;
        
  // Menghitung gaji bersih yang diterima karyawan
        double gajiKotor = gajiPokok + gajiLembur;
        
  // Menghitung potongan pajak, (kita mengambil contoh potongan pajak 10% dari gaji kotor) 
        double pajak = 0.10  * gajiKotor;
        
  // Menghitung gaji bersih, gaji kotor dipotong pajak
        double gajiBersih = gajiKotor - pajak;
        
  // Menampilkan hasil
        System.out.println("Gaji Kotor: Rp. " + gajiKotor);
        System.out.println("Potongan pajak sebesar 10%: Rp. "+ pajak);
        System.out.println("Gaji Bersih: Rp. "+ gajiBersih);

    }
    
}
