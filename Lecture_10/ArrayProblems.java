import java.util.*;

public class ArrayProblems {
  
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int[] marks = {95, 94, 96, 97, 90};
    System.out.println("Sum of Marks: " + getSum(marks)); 
    System.out.println("Maximum Marks: " + getMaxElement(marks)); 
    System.out.println("Minimum Marks: " + getMinElement(marks)); 

    int[] reversedArr = reverse(marks);
    
    System.out.println("\nReversed Array: ");
    print(reversedArr);

    System.out.println("\nSorted Array: ");

    int[] sortedArr = sort(marks);
    print(sortedArr);

    int[] arr1 = {1,2,3,9,8};
    int[] arr2 = {4,7,6,5};
    int[] mergedArr = sort(merge(arr1, arr2));
    System.out.println("\nMerged sorted Array: ");
    print(mergedArr);

    System.out.println("\nRemove 6: ");
    print(remove(mergedArr, 6));

    int[] arr3 = {1,2,4,3,2,4,3,1,4,3,2,3,4};

    System.out.print("\nDuplicates: " + duplicates(arr3));

  }

  // 1. Problem: Write a Java program to calculate the sum of all elements in an integer array.
  public static int getSum(int[] arr) {
    int sum = 0;
    for(int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  // 2. Finding Maximum and Minimum Element
  public static int getMaxElement(int[] arr) {
    int max = arr[0];
    for(int i = 1; i < arr.length; i++) {
      if(max < arr[i]) {
        max = arr[i];
      }
    }
    return max;
  }

  public static int getMinElement(int[] arr) {
    int min = arr[0];
    for(int i = 1; i < arr.length; i++) {
      if(min > arr[i]) {
        min = arr[i];
      }
    }
    return min;
  }

  // 3. Reversing an Array
  public static int[] reverse(int[] arr) {
    // int[] newArr = new int[arr.length];
    // int k = arr.length - 1;
    // for(int i = 0; i < arr.length; i++) {
    //   newArr[i] = arr[k];
    //   k--;
    // }
    // return newArr;

    int start = 0;
    int end = arr.length - 1;
    
    while(start < end) {
      int num = arr[start];
      arr[start] = arr[end];
      arr[end] = num;
      start++;
      end--;
    }

    return arr;
  }

  // 4. Sorting an Array
  public static int[] sort(int[] arr) {
    int start = 0;

    for(int i = start; i < arr.length; i++) {
      int min = i;
      for(int j = i+1; j < arr.length; j++) {
        if(arr[min] > arr[j]) {
          min = j;
        }
      }
      // swap min with start
      int num = arr[start];
      arr[start] = arr[min];
      arr[min] = num;
      start++; 
    }

    return arr;

  }

  // 5. Merge two arrays
  public static int[] merge(int[] arr1, int[] arr2) {
    int[] newArr = new int[arr1.length + arr2.length];
    // Copy Elements of first array
    int k = 0;
    for(int i = 0; i < arr1.length; i++) {
      newArr[k] = arr1[i];
      k++;
    }
    // Copy elements of second array 
    for(int i = 0; i < arr2.length; i++) {
      newArr[k] = arr2[i];
      k++;
    }
    return newArr;
  }

  // 6. Removing an Element from an Array
  public static int[] remove(int[] arr, int element) {
    int index = 0;
    int[] newArr = new int[arr.length-1];
    for(int i = 0, j = 0; i < arr.length; i++, j++) {
      if(element == arr[i]) {
        j--;
        continue;
      }
      newArr[j] = arr[i];
    }
    return newArr;
  }

  // 7. Print Array
  public static void print(int[] arr) {
    System.out.print("[");
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if(i < arr.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.print("]");
  }

  // 8. Check for Duplicates
  public static int duplicates(int[] arr) {
    int count = 0;
    for(int i = 0; i < arr.length - 1; i++) {
      int element = arr[i];
      for(int j = i + 1; j < arr.length; j++) {
        if(element == arr[j]) {
          count++;
        }
      }
    }
    return count;
  }

}