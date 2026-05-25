public class SentenceReverse {

    public static void printSentenceReverse1(String sentence) {

        String[] words = sentence.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {

            System.out.println(words[i]);
        }
    }
}