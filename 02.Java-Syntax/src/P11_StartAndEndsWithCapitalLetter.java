import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Victoria Teneva on 17/10/2015.
 */
public class P11_StartAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        Pattern pattern = Pattern.compile("\\b[A-Z][a-zA-Z]*[A-Z]\\b");
        Matcher match = pattern.matcher(text);

        while (match.find()) {
            System.out.print(match.group() + ' ');
        }
    }
}
