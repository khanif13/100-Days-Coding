package pkg100.days.coding;

public class Day39 {

    public static void main(String[] args) {
        System.out.println("-------------");
        System.out.println("Pola 22");
        System.out.println("-------------");
        System.out.println("5");
        int pola22 = 5;
        for (int i = 1; i <= pola22; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
    }
    
}
