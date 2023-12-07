package pkg100.days.coding;

public class Day60 {

    public static void main(String[] args) {

        int[][] nilai = {
            {24, 31, 68},
            {55, 83, 99},
            {45, 77, 23}
        };
        
        int jumlah = 0;
        
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                jumlah += nilai[i][j];
            }
        }System.out.println(jumlah);
    }
    
}
