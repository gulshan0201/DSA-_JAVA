import java.util.*;

public class sum{

  public static Scanner sc = new Scanner(System.in);

  public static void main(String args[]){

    int size = sc.nextInt();

    int[] arr = new int[size];

    input(arr);

    sumOfArray(arr);

  }

  public static void input(int[] arr){
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }
  }

  public static void sumOfArray(int[] arr){
    int sum =0;
    for(int i=0; i<arr.length; i++){
      sum = sum + arr[i];
    }
    System.out.println(sum);
  }
}
