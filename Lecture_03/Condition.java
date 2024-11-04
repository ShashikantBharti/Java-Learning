import java.util.*;

public class Condition {
  public static void main(String[] args) {
    int age;
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter your age: ");
    age = sc.nextInt();
    if(age > 18) {
      System.out.println("You are an adult!!");
    } else {
      System.out.println("You are not an adult!!");
    }
  }
}