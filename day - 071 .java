package pkg100.days.coding;

import java.util.Scanner;

public class Day71 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int f1 = 0;
        int f2 = 1;

        System.out.print("Berapa Deret Fibonacci Yang Diinginkan = ");
        int n = sc.nextInt();

        int fn;

        System.out.println("Deret Fibonacci ");
        System.out.print(f1 + ", ");
        System.out.print(f2);

        for (int i = 1; i < n; i++) {
            fn = f1 + f2;
            System.out.print(", " + fn);
            f1 = f2;
            f2 = fn;
        }
        System.out.println();

    }

}
