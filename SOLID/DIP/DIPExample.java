// DIP -> Dependency Inversion Principle

// High Level Module : Payment Service
class PaymentService {
  private PaymentMethod paymentMethod;

  public PaymentService(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public void makePayment(double amount) {
    paymentMethod.processPayment(amount);
  }

}

// Low level module : Payment Method
interface PaymentMethod {
  void processPayment(double amount);
}

class CreditCardPayment implements PaymentMethod {
  public void processPayment(double amount) {
    System.out.println("Processing Credit Card Payment of Rs." + amount);
  }
}

class PayPalPayment implements PaymentMethod {
  public void processPayment(double amount) {
    System.out.println("Processing Paypal Payment of Rs." + amount);
  }
}

// main class
public class DIPExample {
  public static void main(String[] args) {
    PaymentMethod paymentMethod = new PayPalPayment(); // Easily switchable between credit card payment
    PaymentService paymentService = new PaymentService(paymentMethod);

    paymentService.makePayment(2000);
    
    paymentMethod = new CreditCardPayment();
    paymentService = new PaymentService(paymentMethod);
    paymentService.makePayment(3000);
  }
}



