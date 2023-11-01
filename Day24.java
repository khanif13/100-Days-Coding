package pkg100.days.coding;
import java.util.Scanner;
public class Day24 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan goat anda = ");
        String goat = input.nextLine();
        
        if (goat.equalsIgnoreCase("Messi")) {
            System.out.println("Messi the goat, congrats for his 8th Ballon d'or");
        }else{
            System.out.println("Siapa?");
        }
        

    }
    
}
