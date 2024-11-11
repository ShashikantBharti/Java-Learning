
public class Main {
  public static void main(String[] args) {
    // Accessing the private method and variables
    BankAccount account = new BankAccount();

    // Deposite Amount
    account.deposit(1000);

    // Check balance
    account.showBalance();
  
  }
}