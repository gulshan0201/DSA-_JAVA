import java.util.*;

public class reverse{

  public static Scanner sc = new Scanner(System.in);

  public static void main(String args[]){

    int size = sc.nextInt();

    int[] arr = new int[size];
    input(arr);
    printReverseArray(arr);

  }

  public static void input(int[] arr){
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }
  }

  public static void printReverseArray(int[] arr){
    for(int i=arr.length - 1; i>=0; i--){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
