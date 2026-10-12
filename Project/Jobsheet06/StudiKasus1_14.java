import java.util.Scanner;
public class StudiKasus1_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;

        System.out.print("Masukan Jumlah Cup :");
        jumlahCup = sc.nextInt();
        System.out.print("Masukan uang yang diberikan :");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        System.out.println("Harga Total :" + totalHarga);
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10/100;
            totalBayar = totalHarga - diskon;
        } else {
            totalBayar = totalHarga - diskon;
        }
        System.out.println("Harga Total :" + totalHarga);
        System.out.println("Diskon :" + diskon);
        System.out.println("Total Bayar :" + totalBayar);

        if (uangBayar>=totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Uang Kembalian :" + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp" + kurang);
        }
    }
}
