package pkg100.days.coding;

import java.util.Random;

public class Day94 {
    
    public static void cara1(Random acak){
        char random = (char)('A' + acak.nextInt(26));
        System.out.print(random);
        
    }

    public static void cara2(Random acak){
        String random2 = "DPCN";
        char rnd = random2.charAt(acak.nextInt(random2.length()));
        System.out.print(rnd);
    }
    public static void main(String[] args) {

        Random acak = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                cara2(acak);
            }for (int j = 0; j < 1; j++) {
                int rnd = acak.nextInt(9999);
                System.out.print(" "+ rnd + " ");
            }for (int j = 0; j < 2; j++) {
                cara1(acak);
            }
            System.out.println();
        }
    }
    
}
