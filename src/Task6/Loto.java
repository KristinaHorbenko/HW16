package Task6;
public class Loto {
    private static final int Max_Signs = 15;
    public static String chooseWord(String[] words) {
        int randomIndex = (int) (Math.random() * words.length);
        return words[randomIndex];
    }

    public static String generateHint(String randomWord) {
        StringBuilder hintBuilder = new StringBuilder();

        for (int i = 0; i < Max_Signs; i++) {
            hintBuilder.append("#");
        }

        return hintBuilder.toString();
    }

    public static String disguiseWord(String userWord, String randomWord, String hint) {
        StringBuilder hintBuilder = new StringBuilder(hint);

        for (int i = 0; i < randomWord.length(); i++) {
            if (userWord.length() > i && userWord.charAt(i) == randomWord.charAt(i)) {
                hintBuilder.setCharAt(i, randomWord.charAt(i));
            } else if (i < 2) {
                hintBuilder.setCharAt(i, randomWord.charAt(i));
            } else {
                hintBuilder.setCharAt(i, '#');
            }
        }

        return hintBuilder.toString();
    }
}











