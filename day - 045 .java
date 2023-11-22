package pkg100.days.coding;

public class Day45 {

    public static void main(String[] args) {

        System.out.println("------------------");
        System.out.println("Pola 28");
        System.out.println("------------------");
        System.out.println("7");
        System.out.println("8");
        
        int pola28x = 7;
        int pola28y = 8;
        
        for (int i = 1; i <= pola28x; i++) {
            for (int j = 1; j <= pola28y; j++) {
                if (i == 1 || j == 1 || j == pola28y  || i == pola28x ) {
                    System.out.print("+ ");
                }else {
                    System.out.print("~ ");
                }
            }
            System.out.println();
        }
        


    }
    
}
