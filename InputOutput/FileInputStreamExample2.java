package InputOutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class FileInputStreamExample2 {
    public static void main(String args[])
    {
        try {
            FileInputStream fileInput = new FileInputStream("codestates.txt");
            BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);
            int i = 0;
            while ((i = bufferedInput.read()) != -1) {
                System.out.print(Character.toChars(i));
            }
            fileInput.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
