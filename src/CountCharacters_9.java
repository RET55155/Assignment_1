public class CountCharacters_9 {
    public static int countLetters(String text) {
        if (text.isEmpty()) {
            return 0;
        }
        return 1 + countLetters(text.substring(1));
    }

    public static void main(String[] args) {
        String word = "hello";
        System.out.println("result: " + countLetters(word));
    }
}