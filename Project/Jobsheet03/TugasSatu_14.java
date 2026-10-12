public class TugasSatu_14{
    public static void main(String[] args) {
        // Deklarasi variabel
        double hargaLaptop = 12000000; 
        double uangMuka = 2000000;     
        double lamaCicilan = 10;       
        
     
        double bunga = 0.02; 
        
      
        double sisaHarga = hargaLaptop - uangMuka;
        double totalBunga = sisaHarga * bunga;
        double cicilanPerBulan = (sisaHarga + totalBunga) / lamaCicilan;
        
       
        System.out.println("--- Perhitungan Cicilan Laptop ---");
        System.out.println("Harga Laptop        : Rp " + hargaLaptop);
        System.out.println("Uang Muka (DP)      : Rp " + uangMuka);
        System.out.println("Sisa Harga          : Rp " + sisaHarga);
        System.out.println("Lama Cicilan        : " + lamaCicilan + " bulan");
        System.out.println("Bunga per Bulan     : 2%");
        System.out.println("----------------------------------");
        System.out.println("Cicilan per Bulan   : Rp " + cicilanPerBulan);
    }
}