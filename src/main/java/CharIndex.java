public class CharIndex {

    public static void printCharIndex(String str, char sym) {

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == sym) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}