import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class BankDemoTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount to deposit: ");
        double depositAmount = input.nextDouble();

        CheckingAccount check = new CheckingAccount(0,"ABC123");
        check.deposit(depositAmount);

        try{
            System.out.println("Enter an amount to withdraw");
            double withdrawAmount = input.nextDouble();
            check.withdraw(withdrawAmount);
            System.out.println("The balance after withdraw is :$ " + check.getBalance());

        }
        catch (InsufficientFundsException e){
            double shortOfAmount = check.getBalance() - e.getAmount();
            System.out.println("Sorry, but your account is short by :$ " + shortOfAmount);
        }
    }

}
