import java.util.*;

public class SolidTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Height of Triangle: ");
    int n = sc.nextInt();

    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}