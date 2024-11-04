import java.util.*;

public class Button {
  public static void main(String[] args) {
    System.out.print("Enter a number: ");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    switch(number) {
      case 1: 
        System.out.println("Hello");
        break;
      case 2:
        System.out.println("Namaste");
        break;
      case 3:
        System.out.println("Bonzour");
        break;
      default:
        System.out.println("Entered number is Invalid!");
    }
  }
}