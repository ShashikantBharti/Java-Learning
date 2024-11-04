import java.util.*;

public class LesserGreater {
  public static void main(String[] args) {
    System.out.print("Enter tw number : ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a == b) {
      System.out.println("Both are equal!");
    } else if(a > b) {
      System.out.println("First Number is greater.");
    } else {
      System.out.println("First Number is Lesser.");
    }
  }
}