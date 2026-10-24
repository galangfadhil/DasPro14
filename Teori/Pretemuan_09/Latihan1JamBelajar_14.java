import java.util.Scanner;

public class Latihan1JamBelajar_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double totalJam = 0;
        int hari = 1;

        System.out.println("=== PROGRAM PELACAK WAKTU BELAJAR SISWA ===");
        System.out.println("Catatan: Masukkan jam belajar (0 - 10 jam) per hari.\n");

        while (hari <= 7) {
            System.out.print("Masukkan jumlah jam belajar hari ke-" + hari + ":");
            
            if (sc.hasNextDouble()) {
                double jamBelajar = sc.nextDouble();
                
                if (jamBelajar < 0 || jamBelajar > 10) {
                    System.out.println("Input tidak valid! Silakan masukkan ulang.\n");
                    continue;
                }
                totalJam += jamBelajar;
                hari++;
            } else {
                System.out.println("Harap masukkan angka yang valid!\n");
                sc.next();
            }
        }
        sc.close();

        System.out.println("\n========================================");
        System.out.println("Total jam belajar selama seminggu: " + totalJam + " jam");
        System.out.println("========================================");
    }
}