import java.util.Scanner;
public class tugas2SeleksiAsisten14 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Apakah anda mahasiswa aktif (iya/tidak) :");
        String statusMahasiswa = sc.nextLine();
        System.out.print("Apakah anda terkena sanksi akademik(iya/tidak) :");
        String sanksi = sc.nextLine();

        if (statusMahasiswa.equalsIgnoreCase("iya") && sanksi.equalsIgnoreCase("tidak")) {
            System.out.print("Masukkan nilai dasar pemograman anda :");
            int nilaiDaspro = sc.nextInt();
            sc.nextLine();
            System.out.print("Apakah anda memiliki sertifikat kompetensi pemograman(iya/tidak) :");
        String sertifikat = sc.nextLine();
            if (nilaiDaspro>=80 || sertifikat.equalsIgnoreCase("iya")) {
                System.out.println("Selamat anda anda lolos tahap pertama, dan lanjut wawancara");
                System.out.print("Masukkan nilai wawancara anda :");
                int nilaiWawancara = sc.nextInt();
                if (nilaiWawancara>=75) {
                    System.out.println("Selamat anda diterima asisten pratikum");
                } else {
                    System.out.println("Nilai wawancara anda kurang");
                }
            } else if (nilaiDaspro<80){
                System.out.println("Nilai dasar pemograman anda tidak mencapai 80");
            }else {
                System.out.println("Anda tidak memiliki sertifikat kompetensi pemograman");
            }
        } else if (statusMahasiswa.equalsIgnoreCase("tidak")) {
                System.out.println("Anda ditolak karena bukan mahasiswa aktif");
            } else if (sanksi.equalsIgnoreCase("iya")) {
                System.out.println("Anda ditolak karena terkena sanksi akademik");
            }
            sc.close();
        }
    }