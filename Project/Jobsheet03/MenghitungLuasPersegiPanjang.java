import java.util.Scanner;

public class MenghitungLuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int panjang;
        int lebar;
        int luas;

        System.out.print("masukan panjang :");
        panjang =sc.nextInt();
        System.out.print("masukan lebar :");
        lebar =sc.nextInt();
        luas=panjang*lebar;
        System.out.println("luas persegi adalah " +luas);
        sc.close();
    }
}
