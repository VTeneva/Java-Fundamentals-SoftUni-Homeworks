import java.util.Scanner;

/**
 * Created by Victoria Teneva on 17/10/2015.
 */
public class P04_CalculateExpression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double firstEquation =  Math.pow((Math.pow(a, 2) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2)), (a + b + c) / Math.sqrt(c));
        double secondEquation = Math.pow(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3), (a - b));

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",
                firstEquation, secondEquation, Math.abs((a + b + c)/3 - (firstEquation + secondEquation)/2));
    }
}
