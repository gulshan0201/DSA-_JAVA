import java.util.*;

public class printevenvalues{

  public static Scanner sc = new Scanner(System.in);

  public static void main(String args[]){
    int size = sc.nextInt();
    int[] arr = new int[size];

    input(arr);

    printEvenValues(arr);

   }

   public static void input(int[] arr){
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }
   }

   public static void printEvenValues(int[] arr){
    for(int i=0; i<arr.length; i++){
      if((arr[i] % 2)==0){
        System.out.print(arr[i] + " ");
      }
    }
    System.out.println();
   }

  
}
