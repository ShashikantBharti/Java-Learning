public class BankAccount {
  // A PRIVATE access modifier restricts access to only within the class where it is define, It cannot be accessed by any other class, not even subclass.
  // Private class variable
  private double balance;

  // Private Method
  private void updateBalance(double amount) {
    balance += amount;
  }

  // Public method to interact with private method
  public void depost(double amount) {
    updateBalance(amount);
    System.out.println("Deposited Amount: " + amount);
  }

  // Show balance
  public void showBalance() {
    System.out.println("Balance: " + balance);
  }

}