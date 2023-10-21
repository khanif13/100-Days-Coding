package pkg100.days.coding;
import java.util.Scanner ; 
public class Day13PerulanganMinMax5Variabel {
    public static void main(String[] args) {

    // Memasukkan dua bilangan A dan B lalu menentukan nilai minimal dan maksimal
    Scanner input = new Scanner (System.in);
    
    // Memasukkan bilangan A,B,C,D, dan E
        System.out.print("Masuk kan nilai bilangan A = ");
        double A = input.nextDouble();
        System.out.print("Masuk kan nilai bilangan B = ");
        double B = input.nextDouble();
        System.out.print("Masuk kan nilai bilangan C = ");
        double C = input.nextDouble();
        System.out.print("Masuk kan nilai bilangan D = ");
        double D = input.nextDouble();
        System.out.print("Masuk kan nilai bilangan E = ");
        double E = input.nextDouble();
        
    // Menentukan nilai minimum dan maksimum dari kelima nilai (disini menggunakan A, B, C, D, dan E)
        double minimal = Math.min(Math.min(Math.min(Math.min(A, B), C), D), E);
        double maksimal = Math.max(Math.max(Math.max(Math.max(A, B), C), D), E);
    
    // Menampilkan hasil dari nilai kelima variabel   
        System.out.println("Nilai Minimal = "+ minimal);
        System.out.println("Nilai Maksimal = "+ maksimal);
        

    }
    
}
