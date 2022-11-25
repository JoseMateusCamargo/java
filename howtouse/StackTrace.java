package howtouse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StackTrace {
    public static void main(String[] args) {
        try {
            new FileInputStream("fileNotExist.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}