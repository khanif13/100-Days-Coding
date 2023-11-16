import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println ("================");
        System.out.print ("Masukkan angka = ");
        int a = input.nextInt();
        System.out.println ("================");
        
        if (a>=1&&a<=9){
            System.out.println("Satuan");
        }if (a>=10&&a<=99){
            System.out.println("Puluhan");
        }if (a>=100&&a<=999){
            System.out.println("Ratusan");
        }if (a>=1000&&a<=9999){
            System.out.println("Ribuan");
        }if (a>=10000&&a<=99999){
            System.out.println("Puluhan Ribu");
        }  
    }
    
}
