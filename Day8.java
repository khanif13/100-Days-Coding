package pkg100.days.coding;
import java.util.Scanner;
public class Day8 {
    public static void main(String[] args) {
        
        
        boolean c,a,b ;
        Scanner input = new Scanner (System.in);
        System.out.print("Logika 1 = ");
        a = input.nextBoolean();
        System.out.print("Logika = ");
        b = input.nextBoolean();
        
        c = a&&b;
        System.out.println("Is Rajab a gentleman? " + c);
        
        c = a || b;
        System.out.println("Rajab is an handsome man " + c);
    }
    
}
