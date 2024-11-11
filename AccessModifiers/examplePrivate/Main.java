public class Main {
  public static void main(String[] args) {
    BankAccount account = new BankAccount();

    account.depost(12000);
    account.showBalance();

    //account.updateBalance(4000); // It will throw error

  }
}