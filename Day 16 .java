package pkg100.days.coding;
import java.util.Scanner;
public class Day16Round2PercabanganAngka {
    public static void main(String[] args) {

    Scanner baru = new Scanner (System.in);
        int habis;
        System.out.print("Bilangan = ");
        habis = baru.nextInt();
        
        
        if ((habis %3 ==0)&&(habis %5 ==0)) {
            System.out.println("Master Class");
        }else if (habis %3 == 0) {
            System.out.println("Pride of 3");
        }else if (habis %5 == 0) {
            System.out.println("Pride of 5");
        }
    }
   }

