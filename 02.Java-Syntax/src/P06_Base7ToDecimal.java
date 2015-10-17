import java.util.Scanner;

/**
 * Created by Victoria Teneva on 17/10/2015.
 */
public class P06_Base7ToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String numBaseSeven = scan.nextLine();

        int numDecimal = Integer.valueOf(numBaseSeven, 7);

        System.out.print(numDecimal);
    }
}
