package InputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String args[]) {
        try {
            FileReader file = new FileReader("codestates.txt");
            BufferedReader buffered = new BufferedReader(file);

            int data = 0;

            while((data=buffered.read()) != -1) {
                System.out.print((char)data);
            }
            file.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
