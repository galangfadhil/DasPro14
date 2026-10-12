import java.util.Scanner;
public class Latihan1_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1;
        int bil2;
        int bil3;

        System.out.print("Masukan Bilangan 1 :");
        bil1 = sc.nextInt();
        System.out.print("Masukan Bilangan 2 :");
        bil2 = sc.nextInt();
        System.out.print("Masukan Bilangan 3 :");
        bil3 = sc.nextInt();

       System.out.print("Bilangan terbesar: ");
        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println(bil1);
            } else {
                System.out.println(bil3);
            }
        } else {
            if (bil2>bil3) {
                System.out.println(bil2);
            }
            else{
                System.out.println(bil3);
            }
        }
    }
}