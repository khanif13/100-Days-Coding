package day.pkg2;
public class Day2 {
    public static void main(String[] args) {

/*  TIPE DATA
    TIPE DATA PRIMITIF
    1. Bilangan Bulat 
        byte
        short
        integer
        long
    2. Bilangan Desimal
        float
        double
    3. char (Menampung satu karakter)
    4. boolean (Hanya menampung nilai true dan false)
    
    TIPE DATA NON PRIMITIF
    1. String
*/
    byte byte1 ;/// Menyimpan angka dari -128 sampai 127
            byte1 = 127;
            
    int int1 ;/// Menyimpan angka dari -2,147,483,648 sampai 2,147,483,647
            int1 = 20000000;
            
    short short1 ;/// Menyimpan angka dari -32,768 sampai 32,767
            short1 = 32767;
            
    long long1 ;/// Menyimpan banyak angka :)
            long1 = 6000000;
            
    float float1 ;/// Menyimpan angka desimal
            float1 = 13.4f ;/// Tipe data float diakhiri dengan simbol "f"
            
    double double1 ;/// Menyimpan angka desimal
            double1 = 16; ///16.0
            
    char char1 ;/// Menyimpan satu karakter
            char1 = 'K' ;
            
    boolean boolean1 ;/// Menyimpan nilai true dan false
                boolean1 = true ;
                
    /// TIPE DATA NON PRIMITIF
    
    String string1 ;
            string1 = "Ahmad Khanif" ;
            
            System.out.println("Ini hasil tipe data byte " + byte1);
            System.out.println("Ini hasil tipe data integer " + int1);
            System.out.println("Ini hasil tipe data short " + short1);
            System.out.println("Ini hasil tipe data long " + long1);
            System.out.println("Ini hasil tipe data float " + float1);
            System.out.println("Ini hasil tipe data double " + double1);
            System.out.println("Ini hasil tipe data char " + char1);
            System.out.println("Ini hasil tipe data boolean " + boolean1);
            System.out.println("Ini hasil tipe data String " + string1);
                        
    }
    
}
