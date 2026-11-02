import java.util.Scanner;
public class Latihan2BonusPegawai_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jam =0;
        double bonus = 0, gaji = 0;

        for (int pegawai = 1; pegawai <= 0 ; pegawai++) {
            System.out.println("Masukan gaji harian pegawai ke-" + pegawai + ":");
            gaji = sc.nextInt();
            System.out.println("Masukan jam bekerja pegawai ke-" + pegawai + ":");
            jam = sc.nextInt();
            if (jam > 8) {
                bonus = gaji * 0.2;
                gaji += bonus;
                System.out.println("Bonus mu :" + bonus);
                System.out.println("Gaji mu :" + gaji);                
            } else {
                if (jam > 0 && jam <= 8) {
                    System.out.println("Bonus mu :" + bonus);
                    System.out.println("Gaji mu :" + gaji);
                } else {
                    break;
                }
            }
        }
        sc.close();
    }
}
