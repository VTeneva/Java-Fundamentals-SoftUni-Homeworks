import java.util.Scanner;

/**
 * Created by Administrator on 17/10/2015.
 */
public class P12_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String first = scan.next();
        String second = scan.next();

        System.out.println(charsMultiplied(first, second));
    }

    public static int charsMultiplied(String a, String b) {
        int multiplied = 0;

        for (int letter = 0; letter < Math.min(a.length(), b.length()); letter++) {
            multiplied += ( (int)a.charAt(letter) * (int) b.charAt(letter));
        }

        for (int letter = Math.min(a.length(), b.length()); letter < Math.max(a.length(), b.length()); letter++) {
            if (a.length() > Math.min(a.length(), b.length())) {
                multiplied += (int)a.charAt(letter);
            } else {
                multiplied += (int)b.charAt(letter);
            }
        }

        return multiplied;
    }
}

