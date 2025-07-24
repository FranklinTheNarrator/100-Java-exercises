package exceptions;

import java.util.Scanner;

public class FinalHandle {
    public void exceptionHandle() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        try {
            System.out.println("Original result: " + (15 / i));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        } finally {
            i += 5;

            System.out.println("Modified i: " + (15 / i));
        }
    }
}
