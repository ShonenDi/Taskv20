import java.io.File;
import java.util.ArrayList;

public class FileCompare {
    public static void main(String[] args) {
        File f1 = new File("test1.txt");
       // System.out.println(txtFileToWords(f1).toString());
        String[] list = f1.list();

    }

    public static ArrayList<String> txtFileToWords(File file) {
        String[] words = file.list();
        ArrayList<String> myWord = new ArrayList<String>();
        for (String word : words) {
            myWord.add(String.valueOf(word.split("[ .,\n!]")));
        }
        return myWord;
    }
}

