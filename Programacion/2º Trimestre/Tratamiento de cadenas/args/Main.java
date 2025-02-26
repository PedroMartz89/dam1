import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = args[1];
        String text = args[0];

        if (validarRegex(text, regex)) {

            System.out.println(validarRegex(text, regex));
        }
    }

    public static boolean validarRegex(String text, String regex) {

        return text.matches(regex);
    }
}