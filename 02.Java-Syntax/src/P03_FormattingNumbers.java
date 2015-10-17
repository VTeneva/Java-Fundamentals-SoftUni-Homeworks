import java.util.Scanner;

/**
 * Created by Victoria Teneva on 16/10/2015.
 */
public class P03_FormattingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        float b = scan.nextFloat();
        float c = scan.nextFloat();

        System.out.printf(String.format("|%-10X|", a ));
        System.out.printf(String.format("%010d", Integer.parseInt(Integer.toString(a, 2).replace(' ', '0'))));
        System.out.printf(String.format("|%10.2f|%-10.3f|", b, c ));
    }
}
