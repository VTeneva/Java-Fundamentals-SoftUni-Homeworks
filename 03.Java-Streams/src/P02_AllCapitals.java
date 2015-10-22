import java.io.*;

/**
 * Created by VikSUN on 21/10/2015.
 */
public class P02_AllCapitals {
    public static void main(String[] args) {
        File temp = new File("repository/temp");

        try (BufferedReader bufRead = new BufferedReader(
                                            new FileReader(
                                                    new File("repository/upcase")));
             BufferedWriter bufWrite = new BufferedWriter(
                                              new FileWriter(temp))) {
            String line = bufRead.readLine();

            while (line != null) {
                bufWrite.write(line.toUpperCase());
                bufWrite.newLine();
                line = bufRead.readLine();
            }

        } catch (IOException bufRead) {
            bufRead.printStackTrace();
        }

        try (BufferedReader bufRead = new BufferedReader(
                                            new FileReader(temp));
             BufferedWriter bufWrite = new BufferedWriter(
                                                 new PrintWriter(
                                                         new File("repository/upcase")))) {
            String line = bufRead.readLine();

            while (line != null) {
                bufWrite.write(line);
                bufWrite.newLine();
                line = bufRead.readLine();
            }

        } catch (IOException bufRead) {
            bufRead.printStackTrace();
        }

        temp.delete();
    }
}
