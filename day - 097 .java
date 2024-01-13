package pkg100.days.coding;

import java.util.Scanner;

public class Day97 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String ttl;
        System.out.print("Input\t : ");
        ttl = s.nextLine();
        System.out.println();
        String[] split = ttl.split(", ");
        String[] split1 = split[1].split(" ");
        
        String tgl = split1[0];
        String bln = split1[1];
        String thn = split1[2];
        String tmpt = split[0];
        
        System.out.println("Tempat\t: "+tmpt);
        System.out.println("Tanggal\t: "+tgl);
        System.out.println("Bulan\t: "+bln);
        System.out.println("Tahun\t: "+thn);
        
        System.out.println("\n[ "+ttl+" ]");
    }
    
}
