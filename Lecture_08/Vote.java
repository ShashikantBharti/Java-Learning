import java.util.*;

public class Vote {
  public static void isAdult(int age) {
    if (age >= 18) {
      System.out.print("He/She can vote."); 
      return;
    }
    System.out.print("He/She cannot vote.");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter age: ");
    int age = sc.nextInt();
    isAdult(age);
  }
}