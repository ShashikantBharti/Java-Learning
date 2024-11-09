// 5. Abstraction: Hiding internal details and showing only essential features of the objects.
// 5.1. Abstract Class: It cannot be intantiated and can have abstract methods (without body)

abstract class Shape {
  abstract void draw(); // Abstract Method

  void display() {
    System.out.println("This is a shape.");
  }
}

class Square extends Shape {
  @Override
  void draw() {
    System.out.println("Drawing a square.");
  }
}

// 5.2. Interface: It is a reference type in java, containing only abstract methods and constants.
// (Fields are by default "public static final");
interface Drawable {
  void draw();
}

class Rectangle implements Drawable {
  @Override
  public void draw() {
    System.out.println("Drawing a rectangle...");
  }
}

public class Abstraction {
  public static void main(String[] args) {
    // Square square = new Square();
    // square.display();
    // square.draw();                      

    Drawable drawable = new Rectangle();
    drawable.draw();
  }
}