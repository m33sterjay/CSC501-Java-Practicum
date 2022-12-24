
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);

        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance is " + account.getBalance());
        System.out.println("Monthly interest is " +
                account.getMonthlyInterest());
        System.out.println("This account was created at " +
                account.getDateCreated());
    }
}

class Account {
    // Implement the class here
    private static int id = 0;
    private static double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated = new Date();

    Account() {
    }

    Account(int id, double initialBalance) {
        Account.id = id;
        Account.balance = initialBalance;
    }

    public int getID() {
        return Account.id;
    }

    public static void setID(int newID) {
        Account.id = newID;
    }

    public double getBalance() {
        return Account.balance;
    }

    public static void setBalance(double newBalance) {
        Account.balance = newBalance;
    }

    public double getAnnualInterestRate() {
        return Account.annualInterestRate;
    }

    public static void setAnnualInterestRate(double newAnnualRate) {
        Account.annualInterestRate = newAnnualRate;
    }

    public double getMonthlyInterest() {
        double monthlyInterest = 0;
        double monthlyRate = Account.annualInterestRate / 1200.0;
        monthlyInterest = balance * monthlyRate;
        return monthlyInterest;
    }

    public void withdraw(double amountToWithdraw) {
        Account.balance -= amountToWithdraw;
    }

    public void deposit(double amountToDeposit) {
        Account.balance += amountToDeposit;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
}