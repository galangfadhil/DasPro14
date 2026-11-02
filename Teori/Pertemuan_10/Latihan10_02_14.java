public class Latihan10_02_14 {
    public static void main(String[] args) {
        int n= 5;
        char huruf ='a';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1-i ; j++) {
                System.out.print(" ");
                
            }
            for (int k = 0; k < (2*i) + 1 ; k++) {
                System.out.print( huruf );
                huruf++;
                
            }
            System.out.println();
        }
    }
}