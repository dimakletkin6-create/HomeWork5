public class Main {

    public static void main(String[] args) {

        // HW1
        printCharIndex("hello world", 'l');

        // HW2
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("hello"));
    }

    // HW1
    public static void printCharIndex(String str, char sym) {

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == sym) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    // HW2
    public static boolean isPalindrome(String str) {

        for (int i = 0; i < str.length() / 2; i++) {

            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}


