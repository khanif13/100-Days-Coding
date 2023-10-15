package pkg100.days.coding;
import java.util.Scanner;
public class Day7Perulangan {
    public static void main(String[] args) {
        System.out.print("Masukkan nilai = ");
        Scanner perulangan = new Scanner (System.in);
        int isi = perulangan.nextInt();
        
        for (int hitungan = isi ; hitungan <= 100; hitungan+=2 ){
            System.out.println(hitungan);
        }
        
    }
    
}
