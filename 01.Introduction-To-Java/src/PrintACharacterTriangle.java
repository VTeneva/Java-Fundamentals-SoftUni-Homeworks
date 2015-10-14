import java.util.Scanner;

/**
 * Created by Victoria Teneva on 13/10/2015.
 */
public class PrintACharacterTriangle {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int num = scaner.nextInt();

        for (int i = 1; i <= num; i++) {
            int count = 1;
            do{
                System.out.print((char) (96 + count));
                count++;
            } while (count <= i);

            System.out.println("");
        }

        for (int i = num - 1; i > 0; i--) {
            int count = 1;
            do{
                System.out.print((char) (96 + count));
                count++;
            } while (count <= i);

            System.out.println("");

        }
    }
}
