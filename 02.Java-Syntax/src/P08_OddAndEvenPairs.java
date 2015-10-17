import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Victoria Teneva on 17/10/2015.
 */
public class P08_OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        for(String num : scan.nextLine().split(" ") ){
            numbers.add(Integer.parseInt(num));
        }

        if (numbers.size() == 0 || numbers.size() % 2 != 0) {
            System.out.println("Invalid length");
        } else {
            for (int num = 0; num < numbers.size(); num += 2) {
                if (numbers.get(num) % 2 == numbers.get(num + 1) % 2) {
                    if (numbers.get(num) % 2 == 0) {
                        System.out.printf("%d, %d -> both are even\n", numbers.get(num), numbers.get(num + 1));
                    } else {
                        System.out.printf("%d, %d -> both are odd\n", numbers.get(num), numbers.get(num + 1));
                    }
                } else {
                    System.out.printf("%d, %d -> different\n", numbers.get(num), numbers.get(num + 1));
                }
            }
        }
    }
}
