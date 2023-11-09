package pkg100.days.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day32 {
    public static void main(String[] args) throws IOException {

        InputStreamReader input1 = new InputStreamReader (System.in);
        BufferedReader br1 = new BufferedReader (input1);
        
        
        System.out.print("Masukkan nama anda : ");
        String nama = br1.readLine();
        System.out.print("Masukkan NIM anda : ");
        String nim = br1.readLine();
        System.out.print("Masukkan umur anda : ");
        String umur1 = br1.readLine();
        
        System.out.print("Masukkan nilai anda : ");
        String nilai = br1.readLine();
        int nilai2 = Integer.parseInt(nilai);
        if (nilai2 >=1 && nilai2 <= 30) {
            System.out.println("\n Halo "+nama+"\n NIM anda adalah "+nim+"\n berumur "+umur1+"\n anda adalah seorang mahasiswa bermasalah dengan nilai "+ nilai2);        
        }if (nilai2 >= 31 && nilai2 <= 60) {
            System.out.println("\n Halo "+nama+"\n NIM anda adalah "+nim+"\n berumur "+umur1+"\n anda adalah seorang mahasiswa biasa dengan nilai "+ nilai2);        
        }if (nilai2 >=61 && nilai2 <= 80) {
            System.out.println("\n Halo "+nama+"\n NIM anda adalah "+nim+"\n berumur "+umur1+"\n anda adalah seorang mahasiswa luar biasa dengan nilai "+ nilai2);        
        }if (nilai2 >=81 && nilai2 <=100) {
            System.out.println("\n Halo "+nama+"\n NIM anda adalah "+nim+"\n berumur "+umur1+"\n anda adalah seorang mahasiswa berprestasi dengan nilai "+ nilai2);        
        }
        
        
        
        
    }
    
}
