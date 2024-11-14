// LSP - Liskov Substitution Principle

// Base class
abstract class Bird {
  abstract void fly();
}

// Subclass that can fly
class Sparrow extends Bird {
  public void fly() {
    System.out.println("Sparrow can fly!");
  }
}

// Subclass that cannot fly (Violates LSP Principle if handled wrongly)
class Penguin extends Bird {
  public void fly() {
    throw new UnsupportedOperationException("Penguins cannot fly!");
  }
}

// Main Class
public class LSPExample {
  public static void main(String[] args) {
    Bird sparrow = new Sparrow();
    sparrow.fly();

    Bird penguin = new Penguin();
    try {
      penguin.fly();
    } catch(UnsupportedOperationException e) {
      System.out.println(e.getMessage());
    }
  }
}
















