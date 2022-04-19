import java.util.Scanner;
public class Zad5PasswordCheck {
    public static void main(String[] args) {
        String thePassword;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your password: ");
        thePassword = scanner.next();
        System.out.println(passChecker(thePassword) ? "Welcome": "Wrong password");

    }

    private static boolean passChecker(String thePassword) {
        int oneNumber = 0;
        int oneSpecialChar = 0;
        int oneCapitalLetter = 0;

        for (int i = 0; i < thePassword.length() - 1; ++i) {
            char characterForChecking = thePassword.charAt(i);
            if (Character.isUpperCase(characterForChecking)) {
                ++oneCapitalLetter;
            } else if (Character.isDigit(characterForChecking)) {
                ++oneNumber;
            } else if (characterForChecking >= 33 && characterForChecking <= 46 || characterForChecking == 64) {
                ++oneSpecialChar;
            }
        }
        return oneCapitalLetter > 0 && oneNumber > 0 && oneSpecialChar > 0;
    }
}










