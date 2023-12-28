package pkg100.days.coding;

public class Day81 {

    // Prosedur
    public static void nama(){
        String nama = "ahmad";
        int umur    = 19;
        System.out.println(nama +" "+ umur+"th");
    }
    
    // Fungsi
    public static String biodata(){
        String nama = "khanif";
        int umur    = 17;
        return nama+" "+umur+"th";
    }
    
    public static void main(String[] args) {
        nama();
        System.out.println(biodata());
    }
    
}
