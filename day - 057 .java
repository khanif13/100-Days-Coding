import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int angka, angkaRahasia = 20;
        
        do {
        System.out.print("Masukkan angka : ");
        angka = sc.nextInt();
        if(angka < angkaRahasia){
            System.out.println("Nilai terlalu kecil");
        }else if (angka > angkaRahasia){
            System.out.println("Nilai terlalu besar");
        }else if (angka == angkaRahasia){
            System.out.println("Nilai sama dengan angka rahasia");
            break;
        }
        }while(true);
    }
    
}
