package pkg100.days.coding;
import java.util.Scanner ; 
public class Day12PErulanganMInMax {
    public static void main(String[] args) {
        
        
// Memasukkan dua bilangan A dan B lalu menentukan nilai minimal dan maksimal
    Scanner input = new Scanner (System.in);
    // Memasukkan bilangan A
        System.out.print("Masuk kan nilai bilangan A = ");
        float A = input.nextFloat();
        
    // Memasukkan bilangan B
        System.out.print("Masuk kan nilai bilangan B = ");
        float B = input.nextFloat();
        
    // Menentukan nilai minimum dan maksimum dari kedua nilai (disini menggunakan A dan B)    
        float minimal = Math.min(A, B);
        float maksimal = Math.max(A, B);
        
    // Menampilkan hasil dari nilai kedua variabel   
        System.out.println("Nilai Minimal = "+ minimal);
        System.out.println("Nilai Maksimal = "+ maksimal);
        
    }
    
}
