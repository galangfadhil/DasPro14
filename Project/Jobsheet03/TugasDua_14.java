public class TugasDua_14 {
    public static void main(String[] args) {
    
        int jumlahLembar = 50; 
        
      
        int biayaPerLembar = 500;
        int biayaJilid = 5000;
        
      
        int totalBiayaCetak = jumlahLembar * biayaPerLembar;
        int totalBayar = totalBiayaCetak + biayaJilid;
        
  
        System.out.println("--- Perhitungan Biaya Cetak Dokumen ---");
        System.out.println("Jumlah Lembar Dokumen : " + jumlahLembar + " lembar");
        System.out.println("Biaya Cetak per Lembar: Rp " + biayaPerLembar);
        System.out.println("Biaya Penjilidan      : Rp " + biayaJilid);
        System.out.println("---------------------------------------");
        System.out.println("Total Biaya Cetak     : Rp " + totalBiayaCetak);
        System.out.println("Total Harus Dibayar   : Rp " + totalBayar);
    }
}