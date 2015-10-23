import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Administrator on 22/10/2015.
 */
public class P05_SaveAnArrayList {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(2.9);
        numbers.add(4.6);
        numbers.add(9.253728);
        numbers.add(7.132427);

        try (ObjectOutputStream output = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(
                                new File("repository/doubles.list"))))) {
            output.writeObject(numbers);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
