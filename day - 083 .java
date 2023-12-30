package pkg100.days.coding;

import java.util.Scanner;

public class Day83 {

    public static void operasi(int a, int b){
        int c;
        c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        c = a - b;
        System.out.println(a + " - " + b + " = " + c);
        c = a * b;
        System.out.println(a + " x " + b + " = " + c);
        c = a / b;
        System.out.println(a + " : " + b + " = " + c);
    }
    
    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner (System.in);
        System.out.print("Input Nilai a = ");
        a = s.nextInt();
        System.out.print("Input Nilai b = ");
        b = s.nextInt();
        operasi(a, b);
    }
    
}
