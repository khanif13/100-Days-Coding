import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        do {
            
            
            System.out.print ("Nilai : ");
            int nilai = sc.nextInt();
            if (nilai % 2 == 0){
                break;
            }
            
            
        }while(true);
        
    }
    
}
