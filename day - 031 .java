import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Masukkan angka = ");
        int angka = sc.nextInt();
        
        if (angka > 0 && angka %2 ==0){
           System.out.println (angka+" adalah Bilangan Genap Positif"); 
        }if (angka > 0 && angka %2 == 1){
           System.out.println (angka+ " adalah Bilangan Ganjil Positif"); 
        }if (angka < 0 && angka %2 == -1){
            System.out.println (angka+ " adalah Bilangan Ganjil Negatif");
        }if (angka < 0 && angka %2 == 0){
            System.out.println (angka+ " adalah Bilangan Genap Negatif");
        }
        
        
        
    }
    
}
