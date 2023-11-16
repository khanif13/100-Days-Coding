package pkg100.days.coding;
import java.util.Scanner;
public class Day11ChallangeNilaiBatasAtas {
    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai batas atas: ");
        int batasAtas = input.nextInt();

        int total = 0;

        for (int i = 1; i <= batasAtas; i++) {
            total += i;
            if (i < batasAtas) {
                System.out.print(i + "+");
            } else {
                System.out.print(i);
            }
        }

        System.out.println(" = " + total);

        input.close();


    }
    
}
