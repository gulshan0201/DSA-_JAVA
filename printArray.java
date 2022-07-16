import java.util.*;

public class question1{

  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args){

    int size = sc.nextInt();

    int[] arr = new int[size];

    input(arr);

    printArray(arr);

    int[] copy = copyArray(arr);

    printArray(copy);
  }

  public static void input(int[] arr){
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }
  }

  public static void printArray(int[] arr){
    for(int i=0; i<arr.length; i++){
    System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static int[] copyArray(int[] arr){
    int[] narr = new int[arr.length];
    for(int i=0; i<arr.length; i++){
      narr[i] = arr[i];
    }
    return narr;
  }
}
