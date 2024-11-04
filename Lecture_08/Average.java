import java.util.*;

public class Average {
  public static float calculateAverage(int a, int b, int c) {
    return (a+b+c)/3;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter three numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    System.out.print("avarage of " + a + ", " + b + " & " + c + " is : " + calculateAverage(a,b,c));
  }
}