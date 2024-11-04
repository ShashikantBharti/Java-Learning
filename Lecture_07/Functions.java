import java.util.*;

public class Functions {
  public static void printMyName(String name) {
    System.out.println("Welcome, "+name);
    return;
  }

  public static int calculateSum(int a, int b) {
    return a + b;
  }

  public static int calculateProduct(int a, int b) {
    return a * b;
  }

  public static int factorial(int a) {
    // int fact = 1;
    // while(a > 0) {
    //   fact = fact * a;
    //   a--;
    // }

    // return fact;
    if(a < 0) {
      System.out.println("Invalid number!");
      return 0;
    }
    if (a == 1 || a == 0) return 1;
    return a * factorial(a - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name: ");

    String name = sc.next();
    printMyName(name);

    System.out.print("Enter two numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    int sum = calculateSum(a, b);
    System.out.println("Sum = " + sum);

    int product = calculateProduct(a, b);
    System.out.println("Product = " + product);

    System.out.println("Factorial of " + a +" = " + factorial(a));

  }
}