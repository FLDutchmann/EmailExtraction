import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String args[]) throws IOException {
        Path filePath = Path.of("sample.txt");
        String input = Files.readString(filePath);

        int counter = 0;
        for(int i = 0; i < input.length()-12; i++) {
            if(input.substring(i, i+13).equals("@softwire.com"))
                counter++;
        }

        System.out.println("There are " + counter + " occurrences of @softwire.com in the sample text");
    }
    /*
    * This program finds 301 occurrences of the substring @softwire.com, but this will generally over count
    * the number of emails, as it also counts malformed emails, for example strings containing more than one @, and
    * it will count domains that have softwire.com as a prefix, such as softwire.comet.com.
    * */
}
