import java.io.File;
import java.io.IOException;

public class FileCompare {
    public static void main(String[] args) {
        File fileOne = new File("test1.txt");
        File fileTwo = new File("test2.txt");
        try {
            fileOne.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }try {
            fileTwo.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
