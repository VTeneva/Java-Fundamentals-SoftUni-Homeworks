import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Victoria Teneva on 17/10/2015.
 */
public class P13_GetFirstOddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(String num : scan.nextLine().split(" ") ){
            numbers.add(Integer.parseInt(num));
        }

        String line = scan.nextLine();
        ArrayList<String> command = new ArrayList<String>();

        for(String comm : line.split(" ") ){
            command.add(comm);
        }

        for (Integer num : targetCollection(numbers, command)){
            System.out.printf("%d ", num);
        }
    }

    private static ArrayList<Integer> targetCollection (ArrayList<Integer> input,ArrayList<String> command) {

        ArrayList<Integer> targetCollection = new ArrayList<Integer>();

        for (int num = 0, count = 0; num < input.size() && count <= Integer.parseInt(command.get(1)); num++) {
            if (command.get(2).equals("odd") && input.get(num) % 2 == 1) {
                targetCollection.add(input.get(num));
                count++;
            } else if (command.get(2).equals("even") && input.get(num) % 2 == 0){
                targetCollection.add(input.get(num));
                count++;
            }
        }
        return targetCollection;
    }
}
