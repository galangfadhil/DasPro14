import java.util.Scanner;

public class ArrayNilai14{
    public static void main(String[] args) {
        int lulus=0;
        int tidaklulus=0;

        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": "+ nilaiAkhir[i] + " (" + status + ")");
            if (nilaiAkhir[i]>70) {
                lulus++;
            }else{
                tidaklulus++;
            }
            
        // for (int i = 0; i < nilaiAkhir.length; i++) {
        //     String status = "LULUS";
        //     if (nilaiAkhir[i]>70) {
        //         System.out.println("Mahasiswa ke-" + (i+1) + ": " + nilaiAkhir[i] + "(" + status + ")");
        //     }
        
        }
        System.out.println("Jumlah mahasiswa yang lulus :" + lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus :" + tidaklulus);
    }
}