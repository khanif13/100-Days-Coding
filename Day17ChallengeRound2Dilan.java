package pkg100.days.coding;

public class Day17ChallengeRound2Dilan {
    public static void main(String[] args) {
        
        double gajiPokok = 5000000.0;
        double biayaKost = 750000.0;
        double maksimalTabunganPerBulan = 1500000.0;
        double hargaKomputer = 55000000.0;
        int bulan = 0;
        double tabungan = 0.0;

        while (tabungan < hargaKomputer) {
            bulan++;
            tabungan += (gajiPokok - biayaKost);
            tabungan = Math.min(tabungan, maksimalTabunganPerBulan);
        }

        System.out.println("Dilan perlu menabung selama " + bulan + " bulan untuk membeli Komputer Sultan.");
    }
    
}
