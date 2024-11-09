abstract class Order {
  abstract void processOrder();

  double calculateTotal(double price, int quantity) {
    return price * quantity;
  }
}

class StandardOrder extends Order {
  @Override
  void processOrder() {
    System.out.println("Processing standard order...");
    try {
      Thread.sleep(3000);
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Standard Order Processing Completed.");
  }
}

class DigitalOrder extends Order {
  @Override
  void processOrder() {
    System.out.println("Processing digital order...");
    try {
      Thread.sleep(3000);
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Digital Order Processing Completed.");
  }
}

class Main {
  public static void main(String[] args) {
    Order order = new StandardOrder();
    order.processOrder();

    order = new DigitalOrder();
    order.processOrder();
    System.out.print("Total Amount: " + order.calculateTotal(5000, 6));
  }
}