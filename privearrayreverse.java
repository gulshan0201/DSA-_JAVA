import java.util.Scanner;

public class printreverse {
  
  public static Scanner sc = new Scanner(System.in);

  public static void main(String args[]){
    int size = sc.nextInt();
    int[] arr = new int[size];
    
    input(arr);
    reverseNumber(arr);
    printArr(arr);

  }

  public static void input(int[] arr){
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }
  }

  public static void reverseNumber(int[] arr){
    int[] copy = new int[arr.length]; 

    int j =0;
    for(int i=arr.length - 1; i>=0; i--){
      copy[j] = arr[i];
      j++;
    }

    for(int i=0; i<arr.length; i++){
      arr[i] = copy[i];
    }
  }

  public static void printArr(int[] arr){
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  }
}
