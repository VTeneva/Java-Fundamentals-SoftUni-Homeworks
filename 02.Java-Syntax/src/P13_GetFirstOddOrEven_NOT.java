import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Victoria Teneva on 17/10/2015.
 */
public class P13_GetFirstOddOrEven_NOT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (scan.hasNextInt()){
            numbers.add(scan.nextInt());
        }

        ArrayList<String> command = new ArrayList<String>();

        for (String str : scan.nextLine().split(" ")) {
            command.add(str);
        }

    }

    private static ArrayList<Integer> targetCollection (ArrayList<Integer> input,ArrayList<String> command) {
        ArrayList<Integer> targetCollection = new ArrayList<Integer>();



        for (int num = 0; num < input.size(); num++) {
            if (command.get(2) == "odd") {
                if (input.get(num) % 2 == 0) {
                    targetCollection.add(input.get(num));
                }
            } else {
                if (input.get(num) % 2 == 1) {
                    targetCollection.add(input.get(num));
                }
            }
        }
    }
}
