package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleInvalidInput {
    public void getData() {
        Scanner scan = new Scanner(System.in);

        try {
            int inputNumbers = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Not a number!");
        }
    }
}
