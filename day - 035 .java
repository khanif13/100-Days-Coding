package pkg100.days.coding;

import java.util.Scanner;

public class Day35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String menu = null;
        int total;

        System.out.println("--------- Menu ---------");
        System.out.println("1. Bakso        = Rp. 10.000");
        System.out.println("2. Pangsit      = Rp. 15.000");
        System.out.println("3. Ayam Bakar   = Rp. 13.000");
        System.out.println("4. Ayam Geprek  = Rp. 15.000");
        
        System.out.print("Tentukan pilihan anda = ");
        int pilihan = sc.nextInt();
        System.out.print("Jumlah pesanan anda = ");
        int jumlah = sc.nextInt();
        
        switch(pilihan){
            case 1:
                total = jumlah *10000; 
                menu = "1. Bakso";
                System.out.println("Pilihan anda adalah menu "+ menu+" \nDengan total pesanan Rp. "+total);
                break;
            case 2:
                total = jumlah *15000;
                menu = "2. Pangsit";
                System.out.println("Pilihan anda adalah menu "+ menu+" \nDengan total pesanan Rp. "+total);
                break;
            case 3:
                total = jumlah *13000;
                menu = "3. Ayam Bakar";
                System.out.println("Pilihan anda adalah menu "+menu+" \nDengan total pesanan Rp. "+total);
                break;
            case 4:
                total = jumlah *15000;
                menu = "Ayam Geprek";
                System.out.println("Pilihan anda adalah menu "+menu+" \nDengan total pesanan Rp. "+total);
                break;
            default :
                System.out.println("Pilihan anda tidak sesuai");
                break;
        }
        
    }
}
