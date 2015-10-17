import java.util.Scanner;

/**
 * Created by Victoria Teneva on 17/10/2015.
 */
public class P07_RandomizeNToM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int min = Math.min(n, m);
        int max = Math.max(n, m);

        for (int num = min; num <= max ; num++) {
            int number = (int) (Math.random() * (max - min + 1)) + min;
            System.out.printf("%d ", number);

        }
    }
}
