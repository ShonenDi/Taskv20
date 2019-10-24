import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileCompare {
    public static void main(String[] args) {
        File f1 = new File("test1.txt");
        System.out.println(txtFileToWords(f1).toString());


    }

    public static ArrayList<String> txtFileToWords(File file) {
        String word ="";
        List<String> words = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file).useDelimiter(",\\s*");
            while (sc.hasNext()){
                word =sc.next();
                words.add(word);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return (ArrayList<String>) words;
    }
}

