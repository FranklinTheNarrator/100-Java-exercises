package miscellaneous;

public class ATM {
    int balance;

    public ATM (int PIN, int userBalance) {
        if (PIN == 1234) {
            this.balance = userBalance;

            balanceInquiries(balance);
        } else {
            System.out.println("Wrong PIN!");
        }
    }

    public void balanceInquiries(int accountBalance) { System.out.println("Your balance: " + accountBalance + "\n"); }
    public int withdrawCash(int amount) { return balance -= amount; }
    public int depositCash(int deposit, int targetBalance) { return targetBalance += deposit; }
}
