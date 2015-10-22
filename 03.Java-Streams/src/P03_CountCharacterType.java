import java.io.*;

/**
 * Created by VikSUN on 22/10/2015.
 */
public class P03_CountCharacterType {
    public static void main(String[] args) {
        Integer vowels = 0;
        Integer consonants = 0;
        Integer punctuation = 0;

        try (FileReader inputRead = new FileReader(
                                        new File("repository/words.txt"));
                        DataOutputStream dos = new DataOutputStream(
                                new BufferedOutputStream(
                                        new FileOutputStream(
                                                new File("repository/count-chars.txt")))) ){

            int symbol = inputRead.read();

            while (symbol != -1 ) {
                if (symbol == (int) '.' || symbol == (int) ',' || symbol == (int) '!' || symbol == (int) '?') {
                    punctuation++;
                } else if ( ( symbol >= (int)'a' && symbol <= (int) 'z') || (symbol >= (int) 'A' && symbol <= (int) 'Z')) {
                    if (symbol == 65 || symbol == 97 ||
                            symbol == 69 || symbol == 101 ||
                            symbol == 73 || symbol == 105 ||
                            symbol == 79 || symbol == 111 ||
                            symbol == 85 || symbol == 117) {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }

                symbol = inputRead.read();
            }

            dos.writeUTF("Vowels: ");
            dos.writeInt(vowels);

            dos.writeUTF("Consonants: ");
            dos.writeInt(consonants);

            dos.writeUTF("Punctuation: ");
            dos.writeInt(punctuation);


            //System.out.printf("%d, %d, %d", vowels, consonants,punctuation);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
