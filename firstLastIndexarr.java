import java.util.*;

public class firstLastOccurence {

  public static Scanner sc = new Scanner(System.in);

  public static void main(String args[]){

    int size = sc.nextInt();

    int[] arr = new int[size];

    input(arr);
    int value = sc.nextInt();
    firstLastOcc(arr, value);
  }

  public static void input(int[] arr){
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }
  }

  public static void firstLastOcc(int[] arr, int value){
    int i=0;
    for( i=0; i<arr.length; i++){
      if(arr[i] == value){
        break;
      }
    }
    System.out.println(i);
    
    for(i=arr.length - 1; i>=0; i--){
      if(arr[i] == value){
        System.out.println(i);
        break;
      }
    }
  }
  
}
