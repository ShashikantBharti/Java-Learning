import java.util.*;

public class Calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter two numbers: ");
    int number1 = sc.nextInt();
    int number2 = sc.nextInt();
    System.out.print("Enter operation to perform: ");
    String operator = sc.next();


    switch(operator) {
      case "+": System.out.print("Sum : "); System.out.println(number1 + number2); break;
      case "-": System.out.print("Difference : "); System.out.println(number1 - number2); break;
      case "*": System.out.print("Product : "); System.out.println(number1 * number2); break;
      case "/": System.out.print("Division : "); System.out.println(number1 / number2); break;
      default: System.out.println("Invalid Input!!");
    }
  }
}
