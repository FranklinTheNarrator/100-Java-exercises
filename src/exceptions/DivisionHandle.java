package exceptions;

public class DivisionHandle {
    public void handleZeroDivision() {
        try {
            System.out.println(5 / 0);

        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        }
    }
}
