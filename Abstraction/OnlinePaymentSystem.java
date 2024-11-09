//1. Define Abstract Class for payment
abstract class Payment {
  abstract void processPayment(double amount); // Abstract Method
  void transactionDetails() {
    System.out.println("Transaction Completed Successfully!");
  }
}

// 2. Implement different payment methods as Subclass
class CreditCardPayment extends Payment {
  @Override
  public void processPayment(double amount) {
    System.out.println("Processing credit card payment of Rs. " + amount);
  }
}

class PayPalPayment extends Payment {
  @Override
  public void processPayment(double amount) {
    System.out.println("Processing PayPal payment of Rs. " + amount);
  }
}

// 3. Use the abstraction
class Main {
  public static void main(String[] args) {
    Payment payment = new CreditCardPayment();
    payment.processPayment(100.40);
    payment.transactionDetails();

    payment = new PayPalPayment();
    payment.processPayment(200.50);
    payment.transactionDetails();
  }
}









