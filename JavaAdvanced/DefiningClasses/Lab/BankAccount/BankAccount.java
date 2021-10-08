package DefiningClasses.Lab.BankAccount;

public class BankAccount {
    private static final double INTEREST_RATE = 0.02;
    private static double interestRate = INTEREST_RATE;
    private double balance;
    private static int bankAccountCount = 1;
    private int id;

    public BankAccount() {
        this.id = bankAccountCount;
        bankAccountCount++;
    }

    public void deposit(double amountToDeposit){
        this.balance += amountToDeposit;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public double getInterestRate(int years) {
        return BankAccount.interestRate * years * this.balance;
    }

    public int getId() {
        return id;
    }
}
