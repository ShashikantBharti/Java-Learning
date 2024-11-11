
import java.util.Scanner;

// Public : Accessible from anywhere in the program even from the another package.
// Public class
public class BankAccount {
  // Public class variable
  public double balance;

  // public method
  public void deposit(double amount) {
    balance += amount;
    System.out.println("Deposited Amount: " + amount);
  }

  public void showBalance() {
    System.out.println("Balance: " + balance);
  }


}