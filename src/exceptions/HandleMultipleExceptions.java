package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleMultipleExceptions {
    public void handleExceptions() {
        Scanner scan = new Scanner(System.in);

        try {
            int num = scan.nextInt();
            int result = 15 / num;

            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        } catch (InputMismatchException a ) {
            System.out.println("Not a number!");
        }
    }
}
