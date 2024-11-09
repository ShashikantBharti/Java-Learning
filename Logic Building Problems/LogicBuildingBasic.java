import java.util.*;

public class LogicBuildingBasic {
  // 1. Odd or Even
  public static void oddOrEven(int number) {
    if (number % 2 == 0) {
      System.out.println(number + " is even.");
    } else {
      System.out.println(number + " is odd.");
    }
  }

  // 2. Sum of Digits
  public static int sumOfDigits(int number) {
    int sum = 0;
    while(number != 0) {
      sum += number % 10;
      number /= 10;
    }
    return sum;
  }

  // 3. Palindrome number Checker
  public static String isPalindrome(int number) {
    int reverseNumber = 0;
    int oldNumber = number;
    while(number != 0) {
      int digit = number % 10;
      reverseNumber = reverseNumber * 10 + digit;
      number /= 10;
    }
    return reverseNumber == oldNumber ? "Palindrome" : "Not Palindrome";
  }

  // 4. Palindrome word checker
  public static String isPalindromeString(String string) {
    int left = 0;
    int right = string.length() - 1;

    while(left < right) {
      if(string.charAt(left) != string.charAt(right)) {
        return "Not Palindrome";
      }
      left++;
      right--;
    }
    return "Palindrome";
  }

  // 5. Factorial Calculation
  public static int factorial(int number) {
    if(number == 1 || number == 0) return 1;
    return number * factorial(number - 1);    
  }

  // 6. Fibbonaci Sequence
  public static void fibonacci(int number) {
    int a = 0;
    int b = 1;
    int c;
    while(number >= 0) {
      System.out.print(c + " ");
      c = a + b;
      a = b;
      b = c;
      number--;
    }
  }

  // 7. Prime Number Checker
  public static String isPrime(int number) {
    if (number <= 1) return "Not Prime";
    for(int i = 2; i <= number/2; i++) {
      if(number % i == 0) {
        return "Not Prime";
      }
    }
    return "Prime";
  }

  // 8. Count vowels and consonents in a given string
  public static void countVowelsConsonents(String string) {
    String vowels = "aeiou";
    int vowelCount = 0;
    int consonentCount = 0;
    for(int i = 0; i < string.length(); i++) {
      
    }
    System.out.println("Vowel Count: " + vowelCount);
    System.out.println("Consonent Count: " + consonentCount);
  }

  // 9. 
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number;
    String vowels = "aeiou";
    // System.out.print("Enter a number: ");
    // number = sc.nextInt();
    // oddOrEven(number);
    // System.out.println("Sum of digits: " + sumOfDigits(number));
    // System.out.println("Is palindrome: " + isPalindrome(number));
    // System.out.print("Enter any word: ");
    // String word = sc.next();
    // System.out.println("Is string palindrome: " + isPalindromeString(word));
    // System.out.print("Enter number to get factorial: ");
    // number = sc.nextInt();
    // System.out.println("Factorial of " + number + " is: " + factorial(number));
    // System.out.print("Enter number to get fibonacci sequence: ");
    // number = sc.nextInt();
    // fibonacci(number);
    // System.out.print("Enter number to check prime: ");
    // number = sc.nextInt();
    // System.out.println("Is prime: " + isPrime(number));

    // System.out.print("Enter string: ");
    // String string = sc.nextLine();
    // countVowelsConsonents(string);

    
  }
}