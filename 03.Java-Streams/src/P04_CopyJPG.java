import java.io.*;


/**
 * Created by Administrator on 22/10/2015.
 */
public class P04_CopyJPG {
    public static void main(String[] args) {
        try (FileInputStream inputImage = new FileInputStream(
                                                new File("repository/Gandalf-2.jpg"));
             FileOutputStream newImage = new FileOutputStream(
                                                new File("repository/my-copied-picture.jpg"))) {

            byte[] buffer = new byte[4096];


            while (true) {
                int readbytes = inputImage.read(buffer, 0 , buffer.length);
                if (readbytes == 0){
                    break;
                }
                newImage.write(buffer, 0, readbytes);
            }

        } catch (FileNotFoundException e1) {
            System.out.println("File not found!");
        } catch (IOException e1) {
            System.out.println("File not found!");
        }
    }
}
