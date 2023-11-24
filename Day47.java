package pkg100.days.coding;

import java.util.Scanner;

public class Day47 {

    public static void main(String[] args) {

        System.out.println("-----------------");
        System.out.println("Pola 30");
        System.out.println("-----------------");

        Scanner sc = new Scanner (System.in);
        
        System.out.print("Input: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        System.out.println("Output:");
        pola (rows, cols);
    }
    
    static void pola(int rows, int cols){
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || j == 1 || i == rows || j == cols) {
                    System.out.print("+");
                }else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        
    }
    
}
