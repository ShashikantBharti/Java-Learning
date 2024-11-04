import java.util.*;

public class Sum {
  public static void main(String[] args) {
   int a = 4;
   int b = 5;
   int c = 6;
   int d = 8;
   int e = 2;
   System.out.println(a + b * c - d / e);

   // Input
   System.out.println("Please enter your name: ");
   Scanner sc = new Scanner(System.in);
   String name = sc.next(); // Single word input
   String about = sc.nextLine(); // Multiple word input
   // nextInt() - integer input
   // nextFloat() - decimal number
   System.out.println(name);
   System.out.println(about);
  }
}


