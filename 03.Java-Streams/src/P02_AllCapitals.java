import java.io.*;

/**
 * Created by VikSUN on 21/10/2015.
 */
public class P02_AllCapitals {
    public static void main(String[] args) {
        try (BufferedReader bufRead = new BufferedReader(
                                            new FileReader(
                                                    new File("repository/Upcase the file")));
             BufferedWriter bufWrite = new BufferedWriter(
                                            new FileWriter(
                                                    new File("repository/Upcase the file_out")))) {

            String line = bufRead.readLine();

            while(line != null){
                bufWrite.write(line.toUpperCase());
                bufWrite.newLine();
                line = bufRead.readLine();
            }

        } catch (FileNotFoundException bufRead) {
            System.out.println("File does not exist!");
        } catch (IOException bufRead) {
            System.out.println("File does not exist!");
        }
    }
}
