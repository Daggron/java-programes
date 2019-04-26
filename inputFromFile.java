import java.io.File;
import java.util.Scanner;

public class inputFromFile {
    public static void main(String[] args) throws Exception{
        File file=new File("GuessTheMovie.txt");
        Scanner scanner = new Scanner(file);
        int wordcount=0;
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            wordcount+=line.split("").length;
        }
        System.out.println("Number of lines in the file"+wordcount);
    }
}
