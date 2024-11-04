import java.util.*;

public class Butterfly3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter height of butterfly: ");
    int n = sc.nextInt();
    // Upper Part
    for(int i = 1; i <= n; i++) {
      // First Half Part
      for(int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      // Print Spaces
      for(int j = 1; j <= 2 * (n - i); j++) {
        System.out.print("  ");
      }
      // Second Half Part
      for(int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      
      System.out.println();
    }
     // Lower Part
    for(int i = n; i >= 1; i--) {
      // First Half Part
      for(int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      // Print Spaces
      for(int j = 1; j <= 2 * (n - i); j++) {
        System.out.print("  ");
      }
      // Second Half Part
      for(int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      
      System.out.println();
    }

    
  }
}