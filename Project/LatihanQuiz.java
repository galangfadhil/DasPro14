import java.util.Scanner;

public class LatihanQuiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double panjang,lebar;
        double luasruangan;
        double JumlahKeramikMinimum;
        double JumlahKeramikCadangan;
        double LuKer =0.06*0.6;
        int HargaKer=45000;
        int TotalKeramik;
        int totalBiaya;
        

        System.out.println("==================HITUNG KEBUTUHAN KERAMIK====================");
        System.out.print("Masukan Panjang :");
        panjang = sc.nextDouble();
        System.out.print("Masukan Lebar :");
        lebar = sc.nextDouble();
        luasruangan = panjang*lebar;
        JumlahKeramikMinimum = luasruangan / LuKer;
        
        System.out.print("total biaya belanja keramik : Rp." );


    }
    
}
