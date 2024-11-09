import java.time.*;

// 1. Classes and Object
class Car {
  // Properties (Attributes or Fields)
  String color;
  String model;
  int price;

  // Constructor
  Car(String color, String model, int price) {
    this.color = color;
    this.model = model;
    this.price = price;
  }

  // Methods
  void getCarDetails() {
    System.out.println("Color: " + color);
    System.out.println("Model: " + model);
    System.out.println("Price: " + price);
  }

}

// 2. Encapsulation
class BankAccount {
  // Properties (Attributes or Fields)
  private String accountNumber;
  private String accountHolderName;
  private double balance;
  private LocalDateTime createdAt;
  
  // Constructor
  BankAccount(String accountNumber, String accountHolderName, double balance) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.balance = balance;
    this.createdAt = LocalDateTime.now();
  }

  // Methods
  public void accountDetails() {
    System.out.println("Account No: " + accountNumber);
    System.out.println("Account Holder Name: " + accountHolderName);
    System.out.println("Created At: " + createdAt);
    System.out.println("Balance: " + balance);
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public double withdraw(double amount) {
    if (amount > balance) {
      System.out.println("Insufficient balance");
    } else {
      balance -= amount;
    }
    return balance;
  }


}


// 3. Inheritance
class Animal {

  void eat() {
    System.out.println("Eating");
  }
  
}

class Dog extends Animal {
  void run() {
    System.out.println("The dog runs.");
  }

  void speak() {
    System.out.println("The dog says: Woof!");
  }
}

class Cat extends Animal {
  void speak() {
    System.out.println("The cat says: Meow!");
  }
}

class Snake extends Animal {
  void speak() {
    System.out.println("The snake says: Hss!");
  }

  void move() {
    System.out.println("The snake slithers");
  }

}

// 4. Polymorphism
// 4.1. Method Overloading: same class, same name/signature but different parameters
class Calculator {
  int add(int a, int b) {
    return a + b;
  }

  int add(int a, int b, int c) {
    return a + b + c;
  }

  String add(String str1, String str2) {
    return str1 + str2;
  }
}

// 4.2. Method Overriding: Child class, same name/signature and same parameters
class Shape {
  public void draw() {
    System.out.print("Shape is getting drawn...");
  }
}

class Circle extends Shape {
  @Override
  public void draw() {
    System.out.print("Circle is getting drawn...");
  }
}








public class UnderstandingOOPs {
  public static void main(String[] args) {
    // Creating an object of a car
    // Car suzuki = new Car("red", "swift", 800000);
    // suzuki.getCarDetails();

    // Create bank account
    // BankAccount account = new BankAccount("500243214321", "Suraj", 10000);
    // account.accountDetails();
    // account.deposit(12000);
    // System.out.println("Balance: " + account.getBalance());
    // account.withdraw(5500);
    // System.out.println("Balance: " + account.getBalance());

    // Dog myDog = new Dog();
    // myDog.eat();
    // myDog.run();

    // Snake newSnake = new Snake();
    // newSnake.eat();
    // newSnake.speak();

    // Calculator myCal = new Calculator();

    // System.out.println(myCal.add(4,5));
    // System.out.println(myCal.add("John ", "Doe"));
    // System.out.println(myCal.add(4,5,6));

    Circle myCircle = new Circle();
    myCircle.draw();

  }
}