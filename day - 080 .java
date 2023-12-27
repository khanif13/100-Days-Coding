package pkg100.days.coding;

public class Day80 {

    public static void main(String[] args) {

        String[][] data = {
            {"Khanif\t", "17"},
            {"Rahmat\t", "18", " (Jomblo)"},
            {"Rafi\t", "16"},
        };
        
        for (int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++){
                System.out.print(data[i][j]);
            }
            System.out.println();
        }
        
        
    }
    
}
