import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Mengisi Panjang Indeks : ");
        int panjang = sc.nextInt();
        
        String[] isi = new String [panjang];
        
        for (int i = 0; i < isi.length; i++){
            System.out.print("Menginput Isi Indeks : ");
            isi[i] = sc.next();
        }
        
        for (int i = 0; i < isi.length; i++){
            System.out.println("Isi indeks ke "+i+" adalah "+isi[i]);
        }
        
    }
    
}
