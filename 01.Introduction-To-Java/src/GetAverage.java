import java.util.Scanner;

/**
 * Created by Victoria Teneva on 16/10/2015.
 */
public class GetAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.println(String.format("%.2f", average(a, b, c)));
    }

    public static double average(double a, double b, double c){
        return (a + b + c) / 3;
    }
}
