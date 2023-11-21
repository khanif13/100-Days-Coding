package pkg100.days.coding;

public class Day44 {

    public static void main(String[] args) {

        System.out.println("----------------");
        System.out.println("Pola 27");
        System.out.println("----------------");
        System.out.println("7");
        System.out.println("8");
        int pola27x = 7;
        int pola27y = 8;
        
        
        for (int i = 1; i <= pola27x; i++) {
            for (int j = 1; j <= pola27y; j++) {
                if ((i + j) %2 == 0) {
                    System.out.print("+ ");
                }else {
                    System.out.print("= ");
                }
            }
            System.out.println();
        }


    }
    
}
