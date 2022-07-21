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
    for(int i=0; i<arr.length; i++){
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
