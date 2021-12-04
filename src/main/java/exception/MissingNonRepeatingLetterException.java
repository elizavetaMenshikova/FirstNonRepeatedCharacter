package exception;

public class MissingNonRepeatingLetterException extends RuntimeException {

    private static final String DEFAULT_MESSAGE = "Отсутствует неповторяющаяся буква";

    public MissingNonRepeatingLetterException() {
        super(DEFAULT_MESSAGE);
    }

    public MissingNonRepeatingLetterException(String message) {
        super(message);
    }


}
