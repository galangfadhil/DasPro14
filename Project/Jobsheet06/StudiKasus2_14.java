import java.util.Scanner;
public class StudiKasus2_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, peringkatJuara, pendanaan, jumlahDokumen1;

        System.out.print("Masukan Nama :");
        namaMahasiswa = sc.nextLine();
        System.out.print("Masukan Jenis Kegiatan (BELMAWA, BAKORMA, Mandiri, PKM, atau Lainnya) :");
        jenisKegiatan = sc.nextLine();
        System.out.print("Masukan Jumlah Dokumen :");
        jumlahDokumen = sc.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("belmawa") || jenisKegiatan.equalsIgnoreCase("bakorma") || jenisKegiatan.equalsIgnoreCase("mandiri")) {
            System.out.print("Masukan Peringkat :");
            peringkatJuara = sc.nextInt();
            if (jumlahDokumen < 4) {
                jumlahDokumen1 = 4- jumlahDokumen;
                System.out.println("Dokumen tidak lengkap (kurang " + jumlahDokumen1 + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                if (peringkatJuara >= 1 && peringkatJuara <=3) {
                    System.out.println("Berhak memperoleh dana penghargaan(" + jenisKegiatan + " lolos pendanaan)");
                } else {
                    System.out.println("Tidak memperoleh dana penghargaan (hanya untuk juara 1/2/3).");
                }
            }
        }else if (jenisKegiatan.equalsIgnoreCase("pkm")) {
                System.out.print("Masukkan status pendanaan(1 = lolos/0 = tidak lolos): ");
                pendanaan = sc.nextInt();

                if (jumlahDokumen<4) {
                    jumlahDokumen1=4-jumlahDokumen;
                    System.out.println("Dokumen tidak lengkap (kurang " + jumlahDokumen1 + " dokumen). Dana penghargaan tidak diberikan.");
                } else if (pendanaan==1) {
                    System.out.println("Berhak memperoleh dana penghargaan(" + jenisKegiatan + " lolos pendanaan)");
                        } else {
                            System.out.println("Tidak memperoleh dana penghargaan (hanya untuk yang lolos pendanaan).");
                }
            } else {
                if (jenisKegiatan.equalsIgnoreCase("lainnya")) {
                    System.out.println("Tidak memperoleh dana penghargaan(jenis kegiatan tidak termasuk ketentuan).");
                } else {
                    System.out.println("Tidak memperoleh dana penghargaan(jenis kegiatan tidak termasuk ketentuan).");
                }
            } 
        }


    }