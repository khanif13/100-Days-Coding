package pkg100.days.coding;

import java.util.Scanner;

public class Day99 {
public class Membaca{
    public static void baca(String nama, String tmpt, String bln, String thn, String tgl){
        System.out.println("Nama    \t: "+nama);
        System.out.println("Tmpt Lahir\t: "+tmpt);
        System.out.println("Tgl Lahir\t: "+tgl);
        System.out.println("Bln Lahir\t: "+bln);
        System.out.println("Thn Lahir\t: "+thn);
    }
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Day99 obj1 = new Day99();
        Membaca obj2 = obj1.new Membaca();
        
        String nama, ttl;
        
        System.out.print("Input Nama\t: ");
        nama = input.nextLine();
        
        System.out.print("Input TTL\t: ");
        ttl = input.nextLine();
        
        
        String[] split = ttl.split(", ");
        String[] split2 = split[1].split(" ");
        
        String tgl = split2[0];
        String bln = split2[1];
        String thn = split2[2];
        String tmpt = split[0];
        obj2.baca(nama, tmpt, tgl, bln, thn);
        
}
    
}
