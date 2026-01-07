import java.util.Scanner;

public class ErrorHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // try {
        //     int[] num = {1, 6, 9, 7};
        // System.out.println(num[9]);
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        try {
            int panjang;
            System.out.print("Masukkan panjang:");
            panjang = sc.nextInt();
            System.out.println(panjang);

        } catch (Exception x) {
            System.out.println(x);
        }
    }
}
