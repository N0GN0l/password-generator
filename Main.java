import java.lang.Math;
import java.util.Scanner;

class Main {
    static String password = "";
    static String[] numbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
    static String[] letters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
            "r",
            "s", "t", "u", "v", "w", "x", "y", "z" };
    static String[] symbols = { "`", "~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+", "[",
            "{",
            "]", "}", "\\", "|", ";", ":", "'", "\"", ",", "<", ".", ">", "/", "?" };

    public static void main(String[] args) {

        try (Scanner myObj = new Scanner(System.in)) {
            String passwordName;
            // Enter username and press Enter
            System.out.println("Enter website");
            passwordName = myObj.nextLine();
            for (int i = 0; i <= ((int) (Math.random() * 15) + 3); i++) {
                // System.out.println(tempNum);
                randomValue(numbers);
                randomValue(letters);
                randomValue(symbols);
            }
            System.out.print(passwordName + " password: ");
        }
        System.out.println(password);
    }

    public static void randomValue(String[] array) {
        int tempNum = (int) (Math.random() * 10);
        if (tempNum % 2 == 0) {
            password += array[(int) (Math.random() * array.length)];
            password += array[(int) (Math.random() * array.length)];
        } else {
            password += array[(int) (Math.random() * array.length)];
        }
    }
}
