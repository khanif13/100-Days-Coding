package pkg100.days.coding;
import java.util.Scanner ;
public class Day15ChallangeRound2 {
    public static void main(String[] args) {

        Scanner baru = new Scanner (System.in);
        System.out.println("MENETUKAN BILANGAN GANJIL DAN GENAP");
        System.out.println("-----------------------------------");
        
        do {
            int bilangan;
            System.out.println("Masukkan bilangan = ");
            bilangan = baru.nextInt();
            
            if (bilangan %2 == 0) {
                System.out.println("Angka "+bilangan+"adalah bilangan genap ");
            } else {
                System.out.println("You and i, end");
            }break;
        } while (true);   
    }
}
