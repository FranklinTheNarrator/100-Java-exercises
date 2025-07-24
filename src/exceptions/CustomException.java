package exceptions;

public class CustomException{
    public void testException() throws NegativeNumException {
        int i = -516;

        if (i < 0) {
            throw new NegativeNumException("Negative number detected!");
        }
    }
}
