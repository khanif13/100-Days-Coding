package pkg100.days.coding;

import java.util.Scanner;

public class Day82 {
    public static String siswa(String nama, int umur){
        return nama+" berumur "+umur+"th";
    }
    
    public static void main(String[] args) {
        String nm;
        int umr;
        Scanner s = new Scanner(System.in);
        System.out.print("nama : ");
        nm = s.nextLine();
        System.out.print("umur : ");
        umr = s.nextInt();
        System.out.println("\noutput : ");
        System.out.println(siswa(nm, umr));
    }
    
}
