import java.lang.Math;

class Main {
    public static void main(String[] args) {
        String password = "";
        String[] numbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
        String[] letters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };
        String[] symbols = { "`", "~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+", "[", "{",
                "]", "}", "\\", "|", ";", ":", "'", "\"", ",", "<", ".", ">", "/", "?" };
        for (int i = 0; i <= ((int) (Math.random() * 15) + 3); i++) {
            int tempNum = (int) (Math.random() * 10);
            // System.out.println(tempNum);
            if (tempNum % 2 == 0) {
                password += symbols[(int) (Math.random() * symbols.length)];
                password += symbols[(int) (Math.random() * symbols.length)];
            } else {
                password += symbols[(int) (Math.random() * symbols.length)];
            }
            if (tempNum % 2 == 0) {
                password += numbers[(int) (Math.random() * numbers.length)];
                password += numbers[(int) (Math.random() * numbers.length)];
            } else {
                password += numbers[(int) (Math.random() * numbers.length)];
            }
            if (tempNum % 2 == 0) {
                password += letters[(int) (Math.random() * letters.length)];
                password += letters[(int) (Math.random() * letters.length)];
            } else {
                password += letters[(int) (Math.random() * letters.length)].toUpperCase();
            }
        }
        System.out.println(password);
    }
}
