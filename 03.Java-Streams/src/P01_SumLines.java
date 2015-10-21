import java.io.*;

/**
 * Created by VikSUN on 20/10/2015.
 */
public class P01_SumLines {
    public static void main(String[] args) {
        try( BufferedReader inputRead = new BufferedReader(new FileReader(new File("repository/test input")))){
           String line = inputRead.readLine();

            while(line != null){
                int sum = 0;
                for (int ch = 0; ch < line.length(); ch++) {
                    sum += (int)line.charAt(ch);
                }

                System.out.println(sum);
                line = inputRead.readLine();
            }

        } catch (FileNotFoundException inputRead) {
            inputRead.printStackTrace();
        } catch (IOException inputRead) {
            inputRead.printStackTrace();
        }
    }
}
