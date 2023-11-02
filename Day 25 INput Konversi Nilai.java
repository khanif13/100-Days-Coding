package pkg100.days.coding;
import java.util.Scanner;
public class Day25 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        
        System.out.println("=================================================");
        System.out.print("Input Range Nilai Anda (1-100)= ");
        int nilai = input.nextInt();

        if (nilai<=20) {
            System.err.println("Bad");
        }if (nilai>=21&&nilai<=50) {
            System.out.println("Quite Bad");
        }if (nilai>=51&&nilai<=80) {
            System.out.println("Almost Good");
        }if (nilai>=81&&nilai<=90) {
            System.out.println("Good");
        }if (nilai>=91&&nilai<=100) {
            System.out.println("Excellent");
        }

    }
    
}
