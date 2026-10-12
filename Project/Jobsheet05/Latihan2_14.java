import java.util.Scanner;

public class Latihan2_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("  PROGRAM DISKON TOKO BUKU  ");
        System.out.println("=========================================");
        System.out.print("Masukkan hari pembelian (senin/selasa/rabu/kamis/jumat/sabtu/minggu): ");
        String hari = sc.nextLine();
        System.out.print("Masukkan jenis buku (kamus / novel / lainnya): ");
        String jenisBuku = sc.nextLine().trim().toLowerCase();

        System.out.print("Masukkan jumlah buku yang dibeli: ");
        int jumlahBuku = sc.nextInt();

        double persenDiskon = 0;
        if (hari.equals("rabu")) {
        if (jenisBuku.equals("kamus") && jumlahBuku > 2) {
            persenDiskon = 12; 
        } else if (jenisBuku.equals("kamus") && jumlahBuku <= 2) {
            persenDiskon = 10; 
        } else if (jenisBuku.equals("novel") && jumlahBuku > 3) {
            persenDiskon = 9;  
        } else if (jenisBuku.equals("novel") && jumlahBuku <= 3) {
            persenDiskon = 8;  
        } else if (jumlahBuku > 3) {
            persenDiskon = 5;  
        } else {
            persenDiskon = 0;  
        }
    }else{
        persenDiskon = 0;
    }
        System.out.println("Diskon yang didapat: " + persenDiskon + "%");

        sc.close();
    }
}