package pkg100.days.coding;
import java.util.Arrays;
public class Day79 {

    public static void main(String[] args) {
        /*
        String[][] buah = new String [2][2];
        
        
        0,0 0,1
        1,0 1,1
        
        
        buah[0][0] = "Kedongdong";
        buah[0][1] = "Kedongdong";
        buah[1][0] = "Durian";
        buah[1][1] = "Pisang";
        
        System.out.println(buah[0][1]);
        */
        
        String[][] alamat = {
            {"Khanif", "(Leppe)"},
            {"Ade", "(Wonomulyo)"},
        
        };
        /*
        System.out.print(alamat[0][0]);
        System.out.println(alamat[0][1]);
        System.out.print(alamat[1][0]);
        System.out.println(alamat[1][1]);
        */
        
        System.out.println(Arrays.deepToString(alamat));
        
    }
    
}
