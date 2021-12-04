import exception.MissingNonRepeatingLetterException;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String line = "fdsfjsdncmvnshu";
        System.out.println(getFirstNonRepeatedCharacter(line));
    }

    public static char getFirstNonRepeatedCharacter(String line) {
        char[] letters = line.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (isLetterNonRepeated(letters[i], i, letters)) {
                return letters[i];
            }
        }
        throw new MissingNonRepeatingLetterException();
    }

    private static boolean isLetterNonRepeated(char letter, int index, char[] letters) {
        for (int i = 0; i < letters.length; i++) {
            if (i == index) {
                continue;
            }
            if (letter == letters[i]) {
                return false;
            }
        }
        return true;
    }

}
