package pkg100.days.coding;

import java.util.Scanner;

public class Day55 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        int[] iniArray = {1,4,6,8,5,3,9,7};

        System.out.print("Cari indeks dari : ");
        int cari = sc.nextInt();
        
        for (int i = 0; i < iniArray.length; i++) {
            if (iniArray[i] == cari){
                System.out.println(i);
            }
        }
    }
    
}
