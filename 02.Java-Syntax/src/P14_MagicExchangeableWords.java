import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Victoria Teneva on 17/10/2015.
 */
public class P14_MagicExchangeableWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<String>();

        for (String word : scan.nextLine().split(" ")) {
            words.add(word);
        }

        ArrayList<Integer> keys = new ArrayList<Integer>();
        ArrayList<Integer> values = new ArrayList<Integer>();
        boolean areExchangebale = false;

        if (words.get(0).length() != words.get(0).length()) {
            System.out.println("Invalid input! The strings must have equal length.");
        } else {
            for (int i = 0; i < words.get(1).length(); i++) {

                if (keys.indexOf((int)words.get(0).charAt(i)) == -1){
                    keys.add((int)words.get(0).charAt(i));
                    values.add((int)words.get(1).charAt(i));
                } else {
                    if (values.get(keys.indexOf((int)words.get(0).charAt(i))).equals((int)words.get(1).charAt(i))) {
                        areExchangebale = true;
                    }
                }
            }

            System.out.print(areExchangebale);
        }
    }
}
