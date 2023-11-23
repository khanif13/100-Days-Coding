package pkg100.days.coding;

import java.util.Scanner;

public class Day46 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------");
        System.out.println("Pola 29");
        System.out.println("-----------------------");

        int rows1, cols1, rows2, cols2, rows3, cols3;

        System.out.print("Input rows : ");
        rows1 = sc.nextInt();
        System.out.print("Input cols : ");
        cols1 = sc.nextInt();
        System.out.println("\nInput : \n" + rows1 + " " + cols1);

        System.out.println("\nOutput : ");
        for (int i = 1; i <= rows1; i++) {
            for (int j = 1; j <= cols1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.print("\nInput rows : ");
        rows2 = sc.nextInt();
        System.out.print("Input cols : ");
        cols2 = sc.nextInt();
        System.out.println("\nInput : \n" + rows2 + " " + cols2);

        System.out.println("\nOutput : ");
        for (int i = 1; i <= rows2; i++) {
            for (int j = 1; j <= cols2; j++) {
                if (i == 1 || j == 1 || i == rows2 || j == cols2) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }

        System.out.print("\nInput rows : ");
        rows3 = sc.nextInt();
        System.out.print("Input cols : ");
        cols3 = sc.nextInt();
        System.out.println("\nInput : \n" + rows3 + " " + cols3);

        System.out.println("\nOutput : ");
        for (int i = 1; i <= rows3; i++) {
            for (int j = 1; j <= cols3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
