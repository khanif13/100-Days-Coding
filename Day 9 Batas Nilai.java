package pkg100.days.coding;
import java.util.Scanner ; 
public class Day9BatasNilai {
    public static void main(String[] args) {
        Scanner nilai = new Scanner (System.in);
        System.out.print("Masukkan batas nilai atas = ");
        int batasNilai = nilai.nextInt();
        
        int total= 0 ;
        for (int i = 1; i <= batasNilai; i++ ){
            total += i;
            System.out.println("Hasil dari batas nilai "+batasNilai+" adalah "+total);
        }


    }
    
}
