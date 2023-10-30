package pkg100.days.coding;
import java.util.Scanner;
public class Day22 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("Input angka pertama = ");
        int a = input.nextInt();
        System.out.print("Input angka kedua = ");
        int b = input.nextInt();
        int c = a+b;
        if (c %2==0) {
            System.out.println(c+1);
        }if (c %2==1) {
            System.out.println(c+2);
        }
        
        
    }
    
}
