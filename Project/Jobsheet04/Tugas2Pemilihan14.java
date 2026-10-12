import java.util.Scanner;

public class Tugas2Pemilihan14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahSks;
        System.out.print("Masukan jumlah SKS :");
        jumlahSks = sc.nextInt();

        if (jumlahSks > 24) {
            System.out.println("Melebihi Batas");
        } else {
            System.out.println("KRS valid");
        }
        
    }
}