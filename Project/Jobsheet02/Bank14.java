import java.util.Scanner;

public class Bank14 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah Tabungan awal: ");
        int tabunganAwal = input.nextInt();

        System.out.print("Masukkan lama menabung (tahun): ");
        int lamaMenabung = input.nextInt();

        System.out.print("Masukkan bunga (dalam persen): ");
        double presentaseBunga = input.nextDouble();
        presentaseBunga = presentaseBunga / 100;

        double tabunganAkhir = tabunganAwal * Math.pow(1 + presentaseBunga, lamaMenabung);
        double totalBunga = tabunganAkhir - tabunganAwal;

        System.out.println("--------------------------------------------------------------");
        System.out.printf("Total Bunga Didapat : Rp%.0f\n", totalBunga);
        System.out.printf("Total Tabungan Akhir: Rp%.0f\n", tabunganAkhir);

        input.close();
    }
}