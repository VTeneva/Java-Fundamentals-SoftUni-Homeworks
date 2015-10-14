import java.util.Scanner;

/**
 * Created by Victoria Teneva on 14/10/2015.
 */
public class SumNumberFromOneToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = num - 1; i > 0 ; i--) {
            num += i;
        }

        System.out.println(num);
    }
}
