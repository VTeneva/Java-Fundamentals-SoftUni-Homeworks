import java.util.Scanner;

/**
 * Created by Victoria Teneva on 17/10/2015.
 */
public class P05_DecimalTo7Base {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.print(Integer.toString(num, 7));
    }
}
