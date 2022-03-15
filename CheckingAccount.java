public class CheckingAccount {
    private double balance;
    private String accountNumber;

    public CheckingAccount(double balance, String accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance){
            throw new InsufficientFundsException(amount);
        }
        else {
            balance -= amount;
        }
    }

}

