import java.util.Scanner;
public class operatorLogikaWifi14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mahasiswa;
        boolean dosen;
        boolean akunDiBlokir;
        
        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = sc.nextBoolean();
        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen = sc.nextBoolean();
        System.out.print("Apakah pengguna sedang diblokir? (true/false): ");
        akunDiBlokir = sc.nextBoolean();

        if ((mahasiswa || dosen ) && !akunDiBlokir){
            System.out.println("Akses WIFI diberikan");
        }else {
            System.out.println("Akses WIFI ditolak");
        }
        
    }
}
