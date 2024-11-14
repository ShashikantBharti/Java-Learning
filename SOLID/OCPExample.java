// OCP -> Open/Closed Principle
// Open for extension 
// Closed for modification

// Payment method interface (Abstracting the behaviour)
interface PaymentMethod {
  void processPayment(double amount);
}

// Credit Card Payment Class 
class CreditCardPayment implements PaymentMethod {
  public void processPayment(double amount) {
    System.out.println("Processing card payment of Rs." + amount);
  }
}

// Paypal payment class
class PaypalPayment implements PaymentMethod {
  public void processPayment(double amount) {
    System.out.println("Processing Paypal payment of Rs." + amount);
  }
}

// PaymentProcessor class open for extension and closed for modification
class PaymentProcessor {
  private PaymentMethod paymentMethod;

  public PaymentProcessor(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public void process(double amount) {
    paymentMethod.processPayment(amount);
  }
}


public class OCPExample {
  public static void main(String[] args) {
    PaymentMethod payment = new PaypalPayment(); 
    PaymentProcessor processor = new PaymentProcessor(payment);
    processor.process(100.0);

    payment = new CreditCardPayment();
    processor = new PaymentProcessor(payment);
    processor.process(2000.0);

  }
}










