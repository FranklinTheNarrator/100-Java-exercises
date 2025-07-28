package miscellaneous;

public class LeapChecker {
    public void checkLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
