class BankAccount {
  // A PROTECTED access modifer allows to the variables and methods within the same package and subclass even they are in different package.

  protected double balance;
  protected double rates;
  protected int days;
  protected double interest;

  protected BankAccount(double amount) {
    this.balance = amount;
  }

  protected void calculateInterest() {
    this.interest = this.balance * (rates/100) * ((double)days/365);
  }


}

class PremiumBankAccount extends BankAccount {
  public PremiumBankAccount(double amount) {
    super(amount);
  }
  
  public double getInterest() {
    return interest;
  }
}

class Main {
  public static void main(String[] args) {
    BankAccount account = new BankAccount(10000);
    // We can access these because it lies in the same package.
    account.setRates(3.5);
    account.setDays(90);
    account.calculateInterest();
    
    System.out.println("Balance: " + account.getBalance()); // Output: 10000.0
    System.out.println("Interest: " + account.getInterest()); // Output: 86.3013698630137
    System.out.println(account.interest); // Output: 86.3013698630137
  }
} 


