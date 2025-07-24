package exceptions;

public class NegativeNumException extends Exception{
    public NegativeNumException() {

    }

    public NegativeNumException(String message) {
        super (message);
    }

    public NegativeNumException(Throwable cause) {
        super (cause);
    }

    public NegativeNumException(String message, Throwable cause) {
        super (message, cause);
    }
}
