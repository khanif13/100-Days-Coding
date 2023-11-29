package ba;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Panjang Indeks : ");
        int b = sc.nextInt();
        
        String[] a = new String [b];
        
        for (int i = 0; i < a.length; i++){
            System.out.print ("Indeks ke "+i+ " = ");
            a[i] = sc.next();
        }
        System.out.println();
        System.out.print("Cari Index ke : ");
        int cari = sc.nextInt();
        for(int i = 0; i < a.length; i++){
            if (i == cari){
                System.out.println("Hasil cari : "+a[i]);
            }
        }
    }
}
