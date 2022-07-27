import java.util.*;

public class countOccurence {
  
  public static Scanner sc = new Scanner(System.in);
  public static void main(String args[]){

    int size = sc.nextInt();

    int[] arr = new int[size];

    input(arr);

    int value = sc.nextInt(); // value to search
    countOcc(arr, value);
  }

  public static void input(int[] arr){
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }
  }

  public static void countOcc(int[] arr, int value){
    int count = 0;
    for(int i=0; i<arr.length; i++){
      if(arr[i] == value){
      count++;
      }
    }
    System.out.println(count);
  }

}
