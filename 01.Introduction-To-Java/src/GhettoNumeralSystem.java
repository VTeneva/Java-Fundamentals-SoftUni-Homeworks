import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Victoria Teneva on 14/10/2015.
 */

public class GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        ArrayList<String> ghettoNumber = new ArrayList<>();

        for (int digit = 0; digit < number.length(); digit++) {

            switch (number.charAt(digit)) {
                case '0': ghettoNumber.add("Gee");
                    break;
                case '1': ghettoNumber.add("Bro");
                    break;
                case '2': ghettoNumber.add("Zuz");
                    break;
                case '3': ghettoNumber.add("Ma");
                    break;
                case '4': ghettoNumber.add("Duh");
                    break;
                case '5': ghettoNumber.add("Yo");
                    break;
                case '6': ghettoNumber.add("Dis");
                    break;
                case '7': ghettoNumber.add("Hood");
                    break;
                case '8': ghettoNumber.add("Jam");
                    break;
                case '9': ghettoNumber.add("Mack");
                    break;
                default:
                    break;
            }

        }

        StringBuilder ghettoOut = new StringBuilder();

        for(String s: ghettoNumber){
            ghettoOut.append(s);
        }

        System.out.print(ghettoOut.toString());

    }
}
