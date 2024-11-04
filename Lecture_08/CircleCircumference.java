import java.util.*;

public class CircleCircumference {

  public static double circumference(float r) {
    return 2 * 3.14 * r;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter radius of circle: ");
    float r = sc.nextInt();
    System.out.print("Circumference of circle is: " + circumference(r));
  }
}