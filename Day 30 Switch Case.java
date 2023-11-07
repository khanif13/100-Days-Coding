package pkg100.days.coding;

import java.util.Scanner;

public class Day30 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        System.out.println("========== PILIHAN PAKET DATA TELKOMSEL ==========");
        System.out.println("1. 25 GB 30 Hari = Rp. 85000");
        System.out.println("2. 15 GB 30 Hari = Rp. 65000");
        System.out.println("3. 10 GB 30 Hari = Rp. 35000");
        System.out.println("4. 5  GB 30 Hari = Rp. 15000");
        
        System.out.print("MASUKKAN PILIHAN KUOTA ANDA SESUAI NOMOR = ");
        String pilihan = sc.nextLine();
        
        switch(pilihan){
            case "1":
                System.out.println("Selamat, Paket 25 GB anda selama 30 Hari kedepan telah aktif");
                break;
            case "2":
                System.out.println("Selamat, Paket 15 GB anda selama 30 Hari kedepan telah aktif");
                break;
            case "3":
                System.out.println("Selamat, Paket 10 GB anda selama 30 Hari kedepan telah aktif");
                break;
            case "4":
                System.out.println("Selamat, Paket 5 GB anda selama 30 Hari kedepan telah aktif");
                break;
        }
        

    }
    
}
