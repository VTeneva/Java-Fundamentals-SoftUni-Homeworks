import java.util.Scanner;

/**
 * Created by Victoria Teneva on 16/10/2015.
 */
public class P02_TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int aX = scan.nextInt();
        int aY = scan.nextInt();

        int bX = scan.nextInt();
        int bY = scan.nextInt();

        int cX = scan.nextInt();
        int cY = scan.nextInt();

        float area = Math.abs((aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY))/2);

        System.out.printf("%.0f", area);
    }
}
