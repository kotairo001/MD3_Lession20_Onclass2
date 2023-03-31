import java.util.regex.Pattern;

public class ValidateNumber {
    public static final String VALIDATE_NUMBER = "[\\d]{2}-[\\d]*[0][\\d]{9}";
    public static void main(String[] args) {
        boolean isValidatedNumber = Pattern.matches(VALIDATE_NUMBER,"a8-0978489648");
        System.out.println(isValidatedNumber);
    }
}
