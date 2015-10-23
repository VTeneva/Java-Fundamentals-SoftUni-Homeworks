package P06_SaveACustomObject;

import java.io.*;

/**
 * Created by VikSUN on 23/10/2015.
 */
public class P06_SaveACustomObject {
    private static Course[] courses;

    public static void main(String[] args) {
        courses = new Course[2];
        courses[0] = new Course("Java fundamentals", 500);
        courses[1] = new Course("C# Basicss", 600);

        try (ObjectOutputStream output = new ObjectOutputStream(
                                                new BufferedOutputStream(
                                                        new FileOutputStream(
                                                                new File("repository/course.save"))))) {
            for (Course cor : courses){
                output.writeObject(cor);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
