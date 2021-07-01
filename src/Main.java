import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String args[]) throws IOException {
        Path filePath = Path.of("sample.txt");
        String input = Files.readString(filePath);
        Pattern pattern = Pattern.compile("[ \n][a-zA-z.'_%+\\-]+@softwire\\.com[ \n]");
        Matcher matcher = pattern.matcher(input);

        int counter = (int)matcher.results().count();

        System.out.println("There are " + counter + " emails");
    }
    /*
    * This program finds 261 emails with the softwire.com domain.
    * */
}
