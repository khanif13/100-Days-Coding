package pkg100.days.coding;
import java.util.Scanner;
public class Day21 {
    public static void main(String[] args) {

        Scanner batas = new Scanner (System.in);
        System.out.print("Masukkan batas nilai = ");// Input Batas Nilai
        int batasNilai = batas.nextInt();
        
        for (int i = 1; i < batasNilai; i++) {
            if (i %3 ==0) { // Menentukan modulus sisa bagi
                System.out.println(i);
            }
        }
        
    }
    
}
