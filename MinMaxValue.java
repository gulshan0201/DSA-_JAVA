// First approach

import java.util.*;

public class minvaluearray{

  public static Scanner sc = new Scanner(System.in);

  public static void main(String args[]){

    int size = sc.nextInt();

    int[] arr = new int[size];

    input(arr);

    minElementArray(arr);
  }

  public static void input(int[] arr){
    for(int i=0; i<=arr.length; i++){
      arr[i] = sc.nextInt();
    }
  }

  public static void minElementArray(int[] arr){
    int min = arr[0];
    for(int i=0; i<arr.length; i++){
      if(arr[i] < min){
        min = arr[i];
      }
    }
    System.out.print(min);
  }
}

//Second approach using (Ingeter.MAX_VALUE)

import java.util.*;

public class minvaluearray{

  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int size = sc.nextInt();
    int[] arr = new int[size];
    input(arr);
    printMin(arr);
    printMax(arr);
  }

  public static void input(int[] arr){
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }
  }

  public static void printMin(int[] arr){
    int min = Integer.MAX_VALUE;
    for(int i=0; i<arr.length; i++){
      if(arr[i] < min){
        min = arr[i];
      }
    }
    System.out.println("The minumum value in the array is " + min);
  }

  public static void printMax(int[] arr){
    int max = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
      if(arr[i] > max){
        max = arr[i];
      }
    }
    System.out.println("The maximum value in the array is " + max);
  }
}
