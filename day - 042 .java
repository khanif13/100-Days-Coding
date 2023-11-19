package pkg100.days.coding;

public class Day42 {

    public static void main(String[] args) {
        
        System.out.println("-----------------");
        System.out.println("Pola 25");
        System.out.println("-----------------");
        System.out.println("5");
        System.out.println("7");
        int pola25x = 5;
        int pola25y = 7;
        
        for (int i = 1; i <= pola25x; i++) {
            for (int j = 1; j <= pola25y; j++) {
                if (j %2 == 1) {
                    System.out.print("+ ");
                }else {
                    System.out.print("= ");
                }
            }
            System.out.println();
        }
        
        
    }
    
}
