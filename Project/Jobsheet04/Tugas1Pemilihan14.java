import java.util.Scanner;

public class Tugas1Pemilihan14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;
        String pesan1;

        System.out.println("---Cetak KRS SIAKAD---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        pesan = (uktLunas) ? "Pembayaran UKT terverifikasi" : "pembayaran UKT tidak terverifikasi";
        pesan1 = (uktLunas) ? "Silahkan cetak KRS dan minta tanda tangan DPA" : "tolong bayar UKT terlebih dahulu";
        System.out.println(pesan);
        System.out.println(pesan1);
        sc.close();
    }
    
}
